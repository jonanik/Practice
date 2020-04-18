package com.javalec.home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

public class MemberDao {

	public MemberDao(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	int m_num;
	String id,pw,name,address,phone,gender,news,sms;
	Timestamp birth,m_date;
	String sql;
	ArrayList<MemberDto> mlist=new ArrayList<MemberDto>();
	
	public ArrayList<MemberDto> list(){
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user1","1234");
			sql="select * from member3";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				m_num=rs.getInt("m_num");
				id=rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				birth=rs.getTimestamp("birth");
				address=rs.getString("address");
				phone=rs.getString("phone");
				gender=rs.getString("gender");
				news=rs.getString("news");
				sms=rs.getString("sms");
				m_date=rs.getTimestamp("m_date");
				
				MemberDto mdto=new MemberDto(m_num, id, pw, name, birth, address, phone, gender, news, sms, m_date);
				
				mlist.add(mdto);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) pstmt.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return mlist;
		
	}
	
	
}
