package com.javalec.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class JoinDao {

	public JoinDao(){
	
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Context context = new InitialContext();
		      dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	DataSource dataSource;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	int m_num;
	String id,pw,name,email,address,phone,gender,news,sms; 
	String sql;
	Timestamp birth,m_date;
	ArrayList<JoinDto> list = new ArrayList<JoinDto>();
	public ArrayList<JoinDto> member_list(){
		try {
//			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user", "1234");
		     
			
			sql="select * from member3";
			con=dataSource.getConnection();
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				m_num=rs.getInt("m_num");
				id=rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				email=rs.getString("email");
				address=rs.getString("address");
				phone=rs.getString("phone");
				birth=rs.getTimestamp("birth");
				gender=rs.getString("gender");
				news=rs.getString("news");
				sms=rs.getString("sms");
				m_date=rs.getTimestamp("m_date");
				
				JoinDto jdto=new JoinDto(m_num, id, pw, name, email, address, phone, birth, gender, news, sms, m_date);
				
				 list.add(jdto);
				 
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		return list;
		
		
		
	}
	
	
}
