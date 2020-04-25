package home.java.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import home.java.Dto.MDto;

public class MDao {

private	MDao(){
		
	}
	
	private static MDao mdao=new MDao();
	
	public static MDao instance() {
		return mdao;
	}

	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs;
	MDto mdto;
	String id,pw,name;
	Timestamp b_date;
	String sql;
	
	public ArrayList<MDto> getMembers(MDto mdto){
		ArrayList<MDto> list=new ArrayList<MDto>();
		sql="select * from mtable";
		
		try {
			con=getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				id=rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				b_date=rs.getTimestamp("b_date");
				
				mdto=new MDto(id,pw,name,b_date);
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
	
	
	
	
	
	public Connection getConnection() {
		
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
