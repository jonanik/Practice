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

	Context context=null;
	DataSource ds=null;
	
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	String sql=null;
	Dto dto=new Dto();
	ArrayList<Dto> list=new ArrayList<Dto>();
	
	int bId,bHit,bGroup,bStep,bIndent;
	Timestamp bDate;
	String bName,bTitle,bContent;
	
	public Dao() {
		
		try {
			context=new InitialContext();
			ds=(DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void delete(int bId) {
		sql="delete board where bId=?";
		try {
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bId);
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
	
	public void write(String bName,String bTitle,String bContent) {
		sql="insert into board values(b_seq.nextval,?,?,?,sysdate,0,b_seq.currval,0,0)";
		try {
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,bName);
			pstmt.setString(2,bTitle);
			pstmt.setString(3,bContent);
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
	
	public void modify(int bId,String bTitle,String bContent) {
		try {
			sql="update board set bTitle=?, bContent=? where bId=?";
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, bTitle);
			pstmt.setString(2, bContent);
			pstmt.setInt(3, bId);
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
	
	public Dto getContent(int bId) {
		
		hitUp(bId);
		
		sql="select * from board where bId=?";
		try {
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bId);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				bId=rs.getInt("bId");
				bName=rs.getString("bName");
				bTitle=rs.getString("bTitle");
				bContent=rs.getString("bContent");
				bDate=rs.getTimestamp("bDate");
				bHit=rs.getInt("bHit");
				bGroup=rs.getInt("bGroup");
				bStep=rs.getInt("bStep");
				bIndent=rs.getInt("bIndent");	
				
				dto=new Dto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dto;
	}
	
public Dto modiGetCon(int bId) {
		
		
		sql="select * from board where bId=?";
		try {
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bId);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				bId=rs.getInt("bId");
				bName=rs.getString("bName");
				bTitle=rs.getString("bTitle");
				bContent=rs.getString("bContent");
				bDate=rs.getTimestamp("bDate");
				bHit=rs.getInt("bHit");
				bGroup=rs.getInt("bGroup");
				bStep=rs.getInt("bStep");
				bIndent=rs.getInt("bIndent");	
				
				dto=new Dto(bId, bName, bTitle, bContent, bDate, bHit,bGroup , bStep, bIndent);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dto;
	}
	
public void reply(int bId,String bName,String bTitle,String bContent,int bGroup,int bStep,int bIndent) {
	sql="insert into board  values(b_seq.nextval,?,?,?,sysdate,0,?,?,?)";
	try {
//		stepUp(bId);
//		(bId,bName,bTitle,bContent,bDate,bHit,bGroup,bIndent)
		con=ds.getConnection();
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1,bName);
		pstmt.setString(2,bTitle);
		pstmt.setString(3,bContent);
		pstmt.setInt(4,bGroup);
		pstmt.setInt(5,bStep+1);
		pstmt.setInt(6,bIndent+1);
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

public void stepUp(int bId) {
	try {
		sql="update board set bStep=bStep+1 where bId=?";
		con=ds.getConnection();
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, bId);
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

	
	public void hitUp(int bId) {
		try {
			sql="update board set bHit=bHit+1 where bId=?";
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bId);
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
	
	
	public ArrayList<Dto> list(){
		
		sql="select * from board order by bGroup desc , bStep asc ";
		
		
		try {
			con=ds.getConnection();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Dto dto=new Dto();
				bId=rs.getInt("bId");
				bName=rs.getString("bName");
				bTitle=rs.getString("bTitle");
				bContent=rs.getString("bContent");
				bDate=rs.getTimestamp("bDate");
				bHit=rs.getInt("bHit");
				bGroup=rs.getInt("bGroup");
				bStep=rs.getInt("bStep");
				bIndent=rs.getInt("bIndent");
			
				dto=new Dto(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
				list.add(dto);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
	
	
}
