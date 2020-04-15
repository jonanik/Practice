package com.javalec.home;

import java.io.IOException;

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
    Connection con=null;
	Statement stmt=null;
	
	String id,pw,name,nickName=null;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet���� ����");
		actionDo(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost�� ����");
		actionDo(request,response);
		
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		 request.setCharacterEncoding("utf-8");
		id=request.getParameter("id");
		pw=request.getParameter("pw");
		name=request.getParameter("name");
		nickName=request.getParameter("nickName");
		String sql1="insert into member5 values('"+id+"','"+pw+"','"+name+"','"+nickName+"')";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user1","1234");
			stmt=con.createStatement();
			int check=stmt.executeUpdate(sql1);
			if(check==1) {
				response.sendRedirect("joinResult.jsp");
			}else {
				response.sendRedirect("joinn.html");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
