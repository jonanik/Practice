package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinOk")
public class JoinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JoinOk() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet으로 들어옴");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost로 들어옴");
		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id, pw, name, phone1, phone2, phone3, gender;
		Connection con = null;
		Statement stmt = null;
//		ResultSet rs=null; resultset은 select구문 사용할때만 사용하는 것이다. 데이터를 가져와 rs에 넣어줘야하는거다. 하지만 insert라서 안해도됨

		request.setCharacterEncoding("utf-8");

		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");

		String sql = "insert into member2 values('" + id + "','" + pw + "','" + name + "','" + phone1 + "','" + phone2
				+ "','" + phone3 + "','" + gender + "')";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ora_user", "1234");
			stmt = con.createStatement();
			// 저장OK면 1을 리턴함 저장X면 0을 리턴한다.
			int result = stmt.executeUpdate(sql);
			// 저장결과 페이지분기
			if (result == 1) {
				response.sendRedirect("joinResult.jsp");
			} else {
				
				PrintWriter writer = response.getWriter();
				writer.println("<html><head> <meta charset='utf-8'></head>");
				writer.println("<body>");
				writer.println("<script>alert('저장이 되지 않았습니다. 다시입력해주세요.');");
				writer.println("location.href('join.html');</script>");
				writer.println("</body></html>");
				writer.close();
			}

		} catch (Exception e) {
			
			response.sendRedirect("join.html");
			// 에러발생
//			e.printStackTrace();
//			response.setContentType("text/html;charset=utf-8");//ppt 5-2장에 내용있음 서블릿이면 무조건
//			PrintWriter writer = response.getWriter();
//			writer.println("<html><head> <meta charset='utf-8'></head>");
//			writer.println("<body>");
//			writer.println("<script>alert('저장이 되지 않았습니다. 다시입력해주세요.')</script>");
//			writer.println("location.href('join.html');</script>");
//			writer.println("</body></html>");
//			writer.close();

		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}