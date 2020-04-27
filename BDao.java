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
	//db에서 데이터 가져올때 필요함
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	//커넥셕풀에 필요함
	Context context=null;
	DataSource ds=null;
	
	//데이터 담는데 필요한 변수
	BDto dto=new BDto();
	ArrayList<BDto> dtos=new ArrayList<BDto>();
	String bName,bTitle,bContent;
	Timestamp bDate;
	int bId,bHit,bGroup,bStep,bIndent;
	String sql;
	
	//생성자 커넥션풀 연결
	public BDao() {
		try {
			context=new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public ArrayList<BDto> list() {
		sql="select * from mvc_board ";
		try {
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
//			String bName,bTitle,bContent;
//			Timestamp bDate;
//			int bId,bHit,bGroup,bStep,bIndent;
			
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
				
				dto=new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				dtos.add(dto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		return dtos;
	}
	
	//1개 select-contentView
	public BDto contentView(int bId) {
		
		//조회수 1증가
		//update mvc_board set bHit=1 where bId=4;
		upHit(bId);
		
		
		try {
			sql="select * from mvc_board where bId=?";
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bId);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				bId=rs.getInt("bId");
				bName=rs.getString("bName");
				bTitle=rs.getString("bTitle");
				bContent=rs.getString("bContent");
				bDate=rs.getTimestamp("bDate");
				bHit=rs.getInt("bHit");
				bGroup=rs.getInt("bGroup");
				bStep=rs.getInt("bStep");
				bIndent=rs.getInt("bIndent");
				
				dto=new BDto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dto;
	}//1개 select
	
	
	//조회수 1증가
	public int upHit(int bId) {
		int check=0;
		sql="update mvc_board set bHit=bHit+1 where bId=?";
		
		
		try {
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,bId );
			check=pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//조회수 1증가
		
		
		
		
		
		
		return check;
	}
	
}
