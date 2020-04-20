package home.javalec.ex;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import javafx.util.converter.DateStringConverter;

public class MemberDao {

	private MemberDao() {

	}

	private static MemberDao mdao = new MemberDao();

	public static MemberDao getInstance() {

		return mdao;
	}

	public ArrayList<MemberDto> mem(){
		ArrayList<MemberDto> list= new ArrayList<MemberDto>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto mdto=null;
		
		String sql = "select * from mem";
		String id,pw,name,address;
		Timestamp birth;
		int check = 0;
		
		
		try {
			Context context=new InitialContext();
			DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				id=rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				address=rs.getString("address");
				birth=rs.getTimestamp("birth");
				
				mdto= new MemberDto(id, pw, name, address, birth);
				list.add(mdto);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	public MemberDto onemem(String id){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto mdto=null;
		
		String sql = "select * from mem where id=?";
		String pw,name,address;
		Timestamp birth;
		int check = 0;
		
		
		try {
			Context context=new InitialContext();
			DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				id=rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				address=rs.getString("address");
				birth=rs.getTimestamp("birth");
				
				mdto= new MemberDto(id, pw, name, address, birth);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return mdto;
		
	}
	
	
	public int loginCheck(String id, String pw) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select id,pw from mem where id=?";

		String idCheck;
		String pwCheck;
		int check = 0;

		try {
			Context context;
			DataSource ds;
			
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				
				idCheck = rs.getString("id");
				pwCheck = rs.getString("pw");
				if (id.equals(idCheck)) {
					if(pw.equals(pwCheck)) {
						check=1;
					}
				} else if (!(id.equals(idCheck))) {
					
					check=-1;
				} else if(!(pw.equals(pwCheck))) {
					
					check=-2;
				}
			}else {
				System.out.println("정보가 없습니다.");
				check=0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return check;
	}

}
