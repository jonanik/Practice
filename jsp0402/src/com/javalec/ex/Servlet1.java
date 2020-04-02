package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/S2")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
 

	
	public void init(ServletConfig config) throws ServletException {
		
		
		
	}

	
	public void destroy() {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter write=response.getWriter();
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		String[] hobby=request.getParameterValues("hobby");
		String address=request.getParameter("address");
		
		write.println("<html>");
		write.println("<head>");
		write.println("</head>");
		write.println("<body>");
		write.println("아이디:"+id);
		write.println("비밀번호:"+pw);
		write.println("이름:"+name);
		write.println("취미:"+Arrays.toString(hobby));
		write.println("주소:"+address);
		write.println("</body>");
		write.println("</html>");
		write.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter write=response.getWriter();
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		String name=request.getParameter("name");
		String[] hobby=request.getParameterValues("hobby");
		String address=request.getParameter("address");
		
		write.println("<html>");
		write.println("<head>");
		write.println("</head>");
		write.println("<body>");
		write.println("아이디:"+id);
		write.println("비밀번호:"+pw);
		write.println("이름:"+name);
		write.println("취미:"+Arrays.toString(hobby));
		write.println("주소:"+address);
		write.println("</body>");
		write.println("</html>");
		
		write.close();
	}

}
