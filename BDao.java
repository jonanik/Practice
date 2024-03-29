package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.BDto.ADto;
import com.javalec.ex.BDto.BDto;
import com.javalec.ex.BDto.EDto;

public class BDao {
	Context context = null;
	DataSource ds = null;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	BDto dto = new BDto();
	ADto adto = new ADto();
	EDto edto= new EDto();
	
	ArrayList<BDto> list = new ArrayList<BDto>();
	ArrayList<EDto> elist = new ArrayList<EDto>();
	//이벤트에 필요한 변수
	String bfile;
	
	// 관리자 로그인에 필요한 변수
	String aId, aPw;

	// 리스트에 필요한 변수
	String bname, btitle, bcontent;
	Timestamp bdate;
	int bid, bhit, bgroup, bstep, bindent;
	String sql = null;

	public BDao() {
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
public ArrayList<EDto> getEvents(int page,int limit) {
	int startrow = (page - 1) * 10 + 1;
	int endrow = startrow + limit - 1;
	
		sql = "select * from (select rownum rnum,btitle,bcontent,bfile,bdate from event) where rnum>=? and rnum<=?";
	

	try {

		con = ds.getConnection();
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, startrow);
		pstmt.setInt(2, endrow);
		rs = pstmt.executeQuery();

		while (rs.next()) {
			EDto edto = new EDto();
			bfile = rs.getString("bfile");
			btitle = rs.getString("btitle");
			bcontent = rs.getString("bcontent");
			bdate = rs.getTimestamp("bdate");
			
			edto = new EDto(btitle, bcontent,bfile, bdate);
			elist.add(edto);
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

	return elist;
}
	
	
public void	EventWrite(String btitle,String bcontent,String fileName){
	sql = "insert into Event values(?,?,?,sysdate)";
	try {
		con = ds.getConnection();
		pstmt = con.prepareStatement(sql);

		pstmt.setString(1, btitle);
		pstmt.setString(2, bcontent);
		pstmt.setString(3, fileName);
		pstmt.executeUpdate();

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	}
	
	
	//글 수정
	public void modify(int bid,String btitle,String bcontent) {
		sql = "update mvc_board set btitle=?,bcontent=? where bid=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, btitle);
			pstmt.setString(2, bcontent);
			pstmt.setInt(3, bid);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}//수정
	
	
	//글 수정 폼에 들어갈 정보 하나 가져오기
	public BDto getdata(int bid) {

		try {
			sql = "select * from mvc_board where bId=?";
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				bid = rs.getInt("bid");
				bname = rs.getString("bname");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");

				dto = new BDto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);

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

		return dto;
	}
	
	public void delete(int bid) {
		sql = "delete mvc_board where bid=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}// delete
	
	public void write(String bTitle, String bContent) {
		sql = "insert into mvc_board values(mvc_board_seq.nextval,'관리자',?,?,sysdate,0,mvc_board_seq.currval,0,0)";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, bTitle);
			pstmt.setString(2, bContent);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}// write

	public ADto getAdmin() {

		try {
			sql = "select * from admin ";
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				aId = rs.getString("aId");
				aPw = rs.getString("aPw");

				adto = new ADto(aId, aPw);

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

		return adto;
	}

	public BDto content(int bid) {

		// 조회수 1증가
		// update mvc_board set bHit=1 where bId=4;
		upHit(bid);

		try {
			sql = "select * from mvc_board where bId=?";
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				bid = rs.getInt("bId");
				bname = rs.getString("bName");
				btitle = rs.getString("bTitle");
				bcontent = rs.getString("bContent");
				bdate = rs.getTimestamp("bDate");
				bhit = rs.getInt("bHit");
				bgroup = rs.getInt("bGroup");
				bstep = rs.getInt("bStep");
				bindent = rs.getInt("bIndent");

				dto = new BDto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);

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

		return dto;
	}

	public ArrayList<BDto> list(int page, int limit, String opt, String search) {
		int startrow = (page - 1) * 10 + 1;
		int endrow = startrow + limit - 1;
		System.out.println(opt);
		System.out.println(search);
		if (opt == null)
			opt = "";

		if (opt.equals("")) {
			sql = "select * from (select rownum rnum,bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent from (select * from  mvc_board m order by bgroup desc,bid asc)) where rnum>=? and rnum<=?";
		} else if (opt.equals("all")) {
			sql = "select * from (select rownum rnum,bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent from (select * from  mvc_board m where bTitle like '%'||?||'%' or bContent like '%'||?||'%' order by bgroup desc,bid asc)) where rnum>=? and rnum<=?";
		} else if (opt.equals("tit")) {
			sql = "select * from (select rownum rnum,bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent from (select * from  mvc_board m where bTitle like '%'||?||'%' order by bgroup desc,bid asc)) where rnum>=? and rnum<=?";
		} else if (opt.equals("con")) {
			sql = "select * from (select rownum rnum,bid,bname,btitle,bcontent,bdate,bhit,bgroup,bstep,bindent from (select * from  mvc_board m where bContent like '%'||?||'%' order by bgroup desc,bid asc)) where rnum>=? and rnum<=?";
		}

		try {

			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			if (opt.equals("")) {
				pstmt.setInt(1, startrow);
				pstmt.setInt(2, endrow);
			}
			switch (opt) {
			case "all":
				pstmt.setString(1, search);
				pstmt.setString(2, search);
				pstmt.setInt(3, startrow);
				pstmt.setInt(4, endrow);
				break;
			case "tit":
				pstmt.setString(1, search);
				pstmt.setInt(2, startrow);
				pstmt.setInt(3, endrow);
				break;
			case "con":
				pstmt.setString(1, search);
				pstmt.setInt(2, startrow);
				pstmt.setInt(3, endrow);
				break;
			default:
				break;
			}

			rs = pstmt.executeQuery();

			while (rs.next()) {
				BDto dto = new BDto();
				bid = rs.getInt("bId");
				bname = rs.getString("bName");
				btitle = rs.getString("bTitle");
				bcontent = rs.getString("bContent");
				bdate = rs.getTimestamp("bDate");
				bhit = rs.getInt("bHit");
				bgroup = rs.getInt("bGroup");
				bstep = rs.getInt("bStep");
				bindent = rs.getInt("bIndent");
				dto = new BDto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);
				list.add(dto);
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

		return list;
	}
	//이벤트 게시글 개수
	public int getlistCount1() {
		int count = 0;
			sql = "select count(*) as count from Event";// as count는 별칭임
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt("count");
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

		return count;
	}
	public int getlistCount(String opt, String search) {
		int count = 0;
		if (opt == null)
			opt = "";
		switch (opt) {
		case "":
			sql = "select count(*) as count from mvc_board";// as count는 별칭임
			break;
		case "all":
			sql = "select count(*) as count from mvc_board where bTitle like '%'||?||'%' or bContent like '%'||?||'%'";// as
																														// count는
																														// 별칭임
			break;
		case "tit":
			sql = "select count(*) as count from mvc_board where bTitle like '%'||?||'%'";// as count는 별칭임
			break;
		case "con":
			sql = "select count(*) as count from mvc_board where bContent like '%'||?||'%'";// as count는 별칭임
			break;
		default:
			break;
		}
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			switch (opt) {
			case "all":
				pstmt.setString(1, search);
				pstmt.setString(2, search);
				break;
			case "tit":
				pstmt.setString(1, search);
				break;
			case "con":
				pstmt.setString(1, search);
				break;
			default:
				break;
			}
			rs = pstmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt("count");
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

		return count;
	}

	public int upHit(int bid) {
		int check = 0;
		sql = "update mvc_board set bHit=bHit+1 where bId=?";

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			check = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
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
