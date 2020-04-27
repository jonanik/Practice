package home.java.ex.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import home.java.ex.Dto.Dto;

public class Dao {

public	Dao(){
		try {
			context=new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
Context context=null;
DataSource ds=null;

Connection con=null;
PreparedStatement pstmt=null;
ResultSet rs=null;
String sql=null;


public void hit() {
	
}

Dto dto=new Dto();
ArrayList<Dto> list=new ArrayList<Dto>();
int num,hit;
String name,title,content;
Timestamp wdate;


public Dto content(int num) {
	
	uphit(num);
	
	try {
		sql="select * from mvctable where num=?";
		con=ds.getConnection();
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, num);
		rs=pstmt.executeQuery();
		
		if(rs.next()) {
			num=rs.getInt("num");
			name=rs.getString("name");
			title=rs.getString("title");
			content=rs.getString("content");
			wdate=rs.getTimestamp("wdate");
			hit=rs.getInt("hit");
			dto=new Dto(num, name, title, content, wdate, hit);
			
			
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
	
	return dto;
}


public ArrayList<Dto> list(){
	try {
		sql="select * from mvctable";
		con=ds.getConnection();
		pstmt=con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		
		while(rs.next()) {
			Dto dto1=new Dto();
			num=rs.getInt("num");
			name=rs.getString("name");
			title=rs.getString("title");
			content=rs.getString("content");
			wdate=rs.getTimestamp("wdate");
			hit=rs.getInt("hit");
			dto1=new Dto(num, name, title, content, wdate, hit);
			list.add(dto1);
			
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

public int uphit(int num) {
	int check=0;
	try {
		sql="update mvctable set hit=hit+1 where num=?";
		con=ds.getConnection();
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, num);
		check=pstmt.executeUpdate();
		
		
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
	return check;
}
}

	

