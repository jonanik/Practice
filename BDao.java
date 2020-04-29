package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.BDto.BDto;

public class BDao {
Context context=null;
DataSource ds=null;
Connection con=null;
PreparedStatement pstmt=null;
ResultSet rs=null;

BDto dto=new BDto();
ArrayList<BDto> list=new ArrayList<BDto>();

String bname,btitle,bcontent;
Timestamp bdate;
int bid,bhit,bgroup,bstep,bindent;
String sql=null;

	public BDao() {
		try {
			context=new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public ArrayList<BDto> list(int page,int limit) {
		int startrow=(page-1)*10+1;
		int endrow=startrow+limit-1;
		
		
		sql="select * from (select rownum rnum,bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent from (select * from  mvc_board m order by bgroup desc,bid asc)) where rnum>=? and rnum<=?";
		try {
			
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs=pstmt.executeQuery();
		
			while(rs.next()) {
				BDto dto=new BDto();
			 bid=rs.getInt("bId");
			 bname=rs.getString("bName");
			 btitle=rs.getString("bTitle");
			 bcontent=rs.getString("bContent");
			 bdate=rs.getTimestamp("bDate");
			 bhit=rs.getInt("bHit");
			 bgroup=rs.getInt("bGroup");
			 bstep=rs.getInt("bStep");
			 bindent=rs.getInt("bIndent");
			 dto=new BDto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);
			 list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return list;
	}
	
	public int getlistCount() {
		int count=0;
		sql="select count(*) as count from mvc_board";//as count는 별칭임
		try {
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
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
	
}
