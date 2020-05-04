package prc.ex.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import prc.ex.Dto.Dto;

public class Dao {
	Context context=null;
	DataSource ds=null;
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String sql;
	int count;
	
	Dto dto=new Dto();
	
	int bId,bHit,bGroup,bStep,bIndent;
	String bName,bTitle,bContent;
	Timestamp bDate;
	ArrayList<Dto> list=new ArrayList<Dto>();
	
	public Dao() {
		try {
			context=new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int listCount(String opt,String search) {
		try {
			if(opt.equals("")) {
				sql="select count(*) as count from mvc_board";
			}else if(opt.equals("all")) {
				sql="select count(*) as count from mvc_board where bTitle like '%'||?||'%' or bContent like '%'||?||'%'";
			}else if(opt.equals("tit")) {
				sql="select count(*) as count from mvc_board where bTitle like '%'||?||'%'";
			}else if(opt.equals("con")) {
				sql="select count(*) as count from mvc_board where bContent like '%'||?||'%'";
			}
			
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				count=rs.getInt("count");	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
		}
		return count;
	}
	
	
	
	public ArrayList<Dto> getList(int page,int limit,String opt,String search) {
		int startrow=(page-1)*10+1;
		int endrow=startrow+limit-1;
		try {
			
			if(opt.equals("")) {
				sql="select * from (select rownum rnum,bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent from(select * from mvc_board order by bGroup desc,bId asc)) where rnum>=? and rnum<=?";
			}else if(opt.equals("all")) {
				sql="select * from (select rownum rnum,bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent from(select * from mvc_board where bTitle like '%'||?||'%' or bContent like '%'|?|'%' order by bGroup desc,bId asc)) where rnum>=? and rnum<=?";
			}else if(opt.equals("tit")) {
				sql="select * from (select rownum rnum,bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent from(select * from mvc_board where bTitle like '%'||?||'%' order by bGroup desc,bId asc)) where rnum>=? and rnum<=?";
			}else if(opt.equals("con")) {
				sql="select * from (select rownum rnum,bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent from(select * from mvc_board where bContent like '%'||?||'%' order by bGroup desc,bId asc)) where rnum>=? and rnum<=?";
			}
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			if(opt.equals("")) {
				pstmt.setInt(1, startrow);
				pstmt.setInt(2, endrow);	
			}else if(opt.equals("all")) {
				pstmt.setString(1, search);
				pstmt.setString(2, search);
				pstmt.setInt(3, startrow);
				pstmt.setInt(4, endrow);
			}else if(opt.equals("tit")) {
				pstmt.setString(1, search);
				pstmt.setInt(2, startrow);
				pstmt.setInt(3, endrow);
			}else if(opt.equals("con")) {
				pstmt.setString(1, search);
				pstmt.setInt(2, startrow);
				pstmt.setInt(3, endrow);
			}
			rs=pstmt.executeQuery();
			while(rs.next()) {
				bId=rs.getInt("bId");
				bName=rs.getString("bName");
				bTitle=rs.getString("bTitle");
				bContent=rs.getString("bContent");
				bDate=rs.getTimestamp("bDate");
				bHit=rs.getInt("bHit");
				bGroup=rs.getInt("bGroup");
				bStep=rs.getInt("bStep");
				bIndent=rs.getInt("bIndent");
				
				dto=new Dto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
		}
		
		
		return list;
	}
	
}
