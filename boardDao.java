package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class boardDao {

	private boardDao() {
		
	}
	//클래스 객체-1개 객체 생성
	private static boardDao instance =new boardDao();
	//싱글톤 패턴
	public static boardDao getInstance() {
		return instance;
	}
	
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	int check=0;
	int b_num;
	String b_title,b_content,b_user,b_file;
	boardDao bdao=null;
	boardDto bdto=null;
	String sql="";
	
	public int updateBoard(boardDto bdto) {
		sql="update b_board set b_title=?,b_content=?,b_file=? where b_num=?";
try {
	con=getconConnection();
	pstmt=con.prepareStatement(sql);
	pstmt.setString(1,bdto.getB_title());
	pstmt.setString(2,bdto.getB_content());
	pstmt.setString(3,bdto.getB_file());
	pstmt.setInt(4,bdto.getB_num());
	check=pstmt.executeUpdate();
	
	
	
	
} catch (Exception e) {
	e.printStackTrace();
}finally {
	try {
		if(pstmt!=null)pstmt.close();
		if(con!=null)con.close();
		
	} catch (Exception e2) {
		e2.printStackTrace();
	}
}
		
		
		return check;
	}
	
	
	
	public int insertBoard(boardDto bdto) {
		sql="insert into b_board values(up_seq.nextval,?,?,?,?) ";
		b_title=bdto.getB_title();
		b_content=bdto.getB_content();
		b_user=bdto.getB_user();
		b_file=bdto.getB_file();
		try {
			con=getconConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,bdto.getB_title());
			pstmt.setString(2,bdto.getB_content());
			pstmt.setString(3,bdto.getB_user());
			pstmt.setString(4,bdto.getB_file());
		check=pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return check;
	}
	
	public boardDto getBoard(int b_num) {
		
			try {
				sql="select * from b_board where b_title=? ";
				con=getconConnection();
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, b_num);
				rs=pstmt.executeQuery();
				
				if(rs.next()) {
					
					bdto.setB_num(rs.getInt("b_num"));
					bdto.setB_title(rs.getString("b_title"));
					bdto.setB_content(rs.getString("b_content"));
					bdto.setB_user(rs.getString("b_user"));
					bdto.setB_file(rs.getString("b_file"));	
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
			
			
			return bdto;
		}
	
public ArrayList<boardDto> getBoards(boardDto bdto) {
	ArrayList<boardDto> list=new ArrayList<boardDto>();
		try {
			sql="select * from b_board order by b_num asc";
			con=getconConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				bdto=new boardDto();
				bdto.setB_num(rs.getInt("b_num"));
				bdto.setB_title(rs.getString("b_title"));
				bdto.setB_content(rs.getString("b_content"));
				bdto.setB_user(rs.getString("b_user"));
				bdto.setB_file(rs.getString("b_file"));
			
				list.add(bdto);
				
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
	
	
	
	
	public Connection getconConnection() {
		try {
			Context context=new InitialContext();
			DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			con=ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return con;
	}
	
}
