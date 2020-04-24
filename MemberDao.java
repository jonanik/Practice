package com.javalec.ex.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.DTO.MemberDto;

public class MemberDao {

	private MemberDao() {
		
	}
	
	private static MemberDao instance=new MemberDao();
	
	public static MemberDao getInstance() {
		return instance;
	}
	
	//객체 선언부
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	MemberDao mdao=null;
	MemberDto mdto=null;
	String sql=null;
	
	//select 전체
	public ArrayList<MemberDto> getMembers(){
		ArrayList<MemberDto> list=new ArrayList<MemberDto>();
		sql="select * from b_member";
		
		try {
			con=getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
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
				if(pstmt!=null) rs.close();
				if(con!=null) con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}//select 전체
	//커넥션 풀
	public Connection getConnection() {
		
		try {
			Context context=new InitialContext();
			DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			con=ds.getConnection();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return con;
	}//커넥
	
}//class
