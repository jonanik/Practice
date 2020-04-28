package practice.java.ex.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.catalina.connector.Request;

import practice.java.ex.Dto.Dto;

public class Dao {

public	Dao(){
		try {
			context=new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	ArrayList<Dto> list =new ArrayList<Dto>();
	
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	DataSource ds;
	Context context;
	
	Dto dto;
	String sql;
	String bname,btitle,bcontent;
	Timestamp bdate;
	int bid,bhit,bgroup,bstep,bindent;
	
	
	
	//寃뚯떆湲� �닔�젙
	public void modify(int bid,String btitle,String bcontent) {
		try {
			sql="update board set btitle=?,bcontent=? where bid=?";
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setInt(3, bid);
			pstmt.executeUpdate();
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
	//寃뚯떆湲� �궘�젣
	public void delete(int bid) {
		
			try {
				sql="delete board where bid=?";
				con=ds.getConnection();
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, bid);
				pstmt.executeQuery();
		
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null) pstmt.close();
					if(con!=null) con.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		}
	
	
	
	//寃뚯떆湲� �옉�꽦write
	public void write(String bname,String btitle,String bcontent) {
		try {
			sql="insert into board values(b_sequ.nextval,?,?,?,sysdate,0,b_sequ.currval,0,0)";
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.executeUpdate();
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	
	}
	
	public void reply(int bid,String btitle,String bname, String bcontent,int bgroup,int bindent,int bstep) {
		try {
			
			sql="insert into board values(b_sequ.nextval,?,?,?,sysdate,0,?,?,?)";
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.setInt(4,bgroup );
			pstmt.setInt(5,bstep+1 );
			pstmt.setInt(6,bindent+1 );
			pstmt.executeUpdate();
	
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
	
	//寃뚯떆湲� 以� �븯�굹�쓽 肄섑뀗痢� �솗�씤contentView
	public Dto getcontent(int bid) {
		
		uphit(bid);
		
		try {
			sql="select * from board where bid=?";
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				
				bid=rs.getInt("bid");
				bname=rs.getString("bname");
				btitle=rs.getString("btitle");
				bcontent=rs.getString("bcontent");
				bdate=rs.getTimestamp("bdate");
				bhit=rs.getInt("bhit");
				bgroup=rs.getInt("bgroup");
				bstep=rs.getInt("bstep");
				bindent=rs.getInt("bindent");
				
				dto=new Dto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return dto;
	}//contentView
		

	//寃뚯떆�뙋 �쟾泥� 由ъ뒪�듃 List
	public ArrayList<Dto> List(){
		try {
			sql="select * from board order by bgroup desc, bstep asc";
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Dto dto=new Dto();
				bid=rs.getInt("bid");
				bname=rs.getString("bname");
				btitle=rs.getString("btitle");
				bcontent=rs.getString("bcontent");
				bdate=rs.getTimestamp("bdate");
				bhit=rs.getInt("bhit");
				bgroup=rs.getInt("bgroup");
				bstep=rs.getInt("bstep");
				bindent=rs.getInt("bindent");
				
				dto=new Dto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);
				list.add(dto);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return list;
	}//List
	
	
	//議고쉶�닔 利앷�
	public void uphit(int bid) {
		try {
			sql="update board set bhit=bhit+1 where bid=?";
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();
			
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
	}
	
	
	
}
