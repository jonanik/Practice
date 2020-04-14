package com.javalec.ex;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@WebServlet("/Login_ok")
public class Login_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login_ok() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet으로 들어옴");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet으로 들어옴");
		actionDo(request, response);
	}

	// 프로그램 구현
	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String id, pw, name, phone1, phone2, phone3, gender;

		id = request.getParameter("id");
		pw = request.getParameter("pw");

		// db에서 id,pw 검색후 비교
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ora_user", "1234");
			stmt = con.createStatement();
			String sql = "select * from member2 where id='" + id + "' and pw='" + pw + "'";
			rs = stmt.executeQuery(sql);// select-executequery를 쓰고///insert,update,delete-executeupdate이다

			if (rs != null) {

				while (rs.next()) {
					id = rs.getString("id");
					pw = rs.getString("pw");
					name = rs.getString("name");
					phone1 = rs.getString("phone1");
					phone2 = rs.getString("phone2");
					phone3 = rs.getString("phone3");
					gender = rs.getString("gender");
					//서블릿에서는 바로 여기서 세션을 넣을 수 없어서 세션을 가져와서 선언해준다.
					HttpSession session=request.getSession();
					session.setAttribute("user_id",id);
					session.setAttribute("user_pw",pw);
					session.setAttribute("user_name",name);
					session.setAttribute("authUser",id);
					
					response.sendRedirect("index.jsp");
					
					
				}
			}else {
				//id,pw가 없을때
				response.sendRedirect("login.html");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("index.jsp");
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					rs.close();
				if (con != null)
					con.close();

			} catch (Exception e1) {
				e1.printStackTrace();
				response.sendRedirect("index.jsp");
			}
		}

	}

}
