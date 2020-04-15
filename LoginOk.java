package com.javalec.home;

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



@WebServlet("/LoginOk")
public class LoginOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginOk() {
        super();
      
    }

    String id,pw,name,nickName=null;
    
    Connection con;
    Statement stmt;
    ResultSet rs;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGetÀ¸·Î µé¾î¿È");
		actionDo(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost·Î µé¾î¿È");
		actionDo(request,response);
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		id=request.getParameter("id");
		pw=request.getParameter("pw");
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user1","1234");
			stmt=con.createStatement();
			String sql="select * from member5 where id='"+id+"' and pw='"+pw+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				if(rs!=null) {
					name=(String)rs.getString("name");
					nickName=(String)rs.getString("nickName");
				
					HttpSession session=request.getSession();
					session.setAttribute("userId", id);
					session.setAttribute("userpw", pw);
					session.setAttribute("name", name);
					session.setAttribute("nickName", nickName);
					response.sendRedirect("index.jsp");
				}else {
					response.sendRedirect("login.html");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}
