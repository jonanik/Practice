package home.java.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import home.java.Dto.MDto;

public class MDao {

private	MDao(){
		
	}
	
	private static MDao mdao=new MDao();
	
	public MDao instance() {
		return mdao;
	}

	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs;
	MDto mdto;
	String sql;
	
	
	
	
	
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
