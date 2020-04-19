package home0419_01;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

public class MDao {

	public MDao(){
	try {
		Class.forName("oralce.jdbc.driver.OracleDriver");
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
}
	
	public ArrayList<MDto> list=new ArrayList<MDto>();
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	int mNum;
	String id,pw,name,address;
	Timestamp birth,mDate;
	String sql;
	
	public ArrayList<MDto> mlist(){
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user1","1234");
			sql="select * from member6";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				mNum=rs.getInt("mNum");
				id=rs.getString("id");
				pw=rs.getString("pw");
				name=rs.getString("name");
				address=rs.getString("address");
				birth=rs.getTimestamp("birth");
				mDate=rs.getTimestamp("mDate");			
				
				
				MDto mdto=new MDto(mNum, id, pw, name, address, birth, mDate);
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
}
