package com.javalec.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;



public class MemberDao {
	
	
	public MemberDao() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
	}
	
	
	
	
	
	
	//전체리스트 출력
	public ArrayList<MemberDto> member_Select() {
		
		ArrayList<MemberDto> dtos= new ArrayList<MemberDto>();
		
		//db접속에 필요한 객체 선언
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String id,pw,name,phone1,phone2,phone3,gender;
		String sql;
		
		//db연결
		try {
//			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			
			sql="select * from member2";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			//데이터 담기
			while(rs.next()) {
				id=rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				phone1=rs.getString("phone1");
				phone2=rs.getString("phone2");
				phone3=rs.getString("phone3");
				gender=rs.getString("gender");
				
				MemberDto mdto=new MemberDto(id, pw, name, phone1, phone2, phone3, gender);
					
				dtos.add(mdto);
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
		
		
		return dtos;
		
	}
	
	//jdbc 로딩
		//Connection 연결
		//PrepareStatement 연결
		//executeQuery(),executeUpdate()
		
	
	
Connection con;
Statement stmt;

}
