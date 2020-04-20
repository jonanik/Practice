package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {

	private MemberDao() {
		
	}
	//MemberDao mdao=new MemberDao();
	private static MemberDao instance= new MemberDao();
	
	public static MemberDao getInstance() {
		return instance;
	}
	
	//member 여러개
	public ArrayList<MemberDto> getMember(){
		
		ArrayList<MemberDto> list=new ArrayList<MemberDto>();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberDto mdto= null;
		
		String sql="select * from b_member";
		
		try {
			Context context=new InitialContext();
			DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
				while(rs.next()) {
					//db에서 데이터 읽어와서 dto에 입력
					mdto=new MemberDto();
					mdto.setId(rs.getString("id"));
					mdto.setPw(rs.getString("pw"));
					mdto.setName(rs.getString("name"));
					mdto.setEmail(rs.getString("email"));
					mdto.setAddress(rs.getString("address"));
					mdto.setB_date(rs.getTimestamp("b_date"));
					
					list.add(mdto);
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
	
	
	
	
	
	
	
	//member 1개
	public MemberDto getMember(String id) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberDto mdto= null;
		
		String sql="select * from b_member where id=?";
		
		try {
			Context context=new InitialContext();
			DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			
				while(rs.next()) {
					
					//db에서 데이터 읽어와서 dto에 입력
					mdto=new MemberDto();
					mdto.setId(rs.getString("id"));
					mdto.setPw(rs.getString("pw"));
					mdto.setName(rs.getString("name"));
					mdto.setEmail(rs.getString("email"));
					mdto.setAddress(rs.getString("address"));
					mdto.setB_date(rs.getTimestamp("b_date"));
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
		
		
		return mdto;
	}
	
	
	
	
	
	//아이디,패스워드 체크 메소드
	public int userCheck(String id,String pw) {
		int check=0;//db에서 결과 리턴값
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select id,pw from b_member where id=?";
		String ch_id,ch_pw;
		
		try {
			Context context=null;
			DataSource ds=null;
			
			context=new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("rs데이터 읽음:"+rs);
				//데이터가 있을 경우
				
					ch_id=rs.getString("id");
					ch_pw=rs.getString("pw");
					
					if(ch_pw.equals(pw)) {
						check=1;//패스워드 일치
					}else {
						check=0;//패스워드 불일치
					}
				
				
			}else {
				//데이터가 없을 경우
				check=-1;//id가 존재하지 않음
			}
//			
				
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
		
		
		
		return check; //일치=1,불일치=0,존재한지 않음 셋중 하나임=-1
		
	}//userCheck
	
}//class
