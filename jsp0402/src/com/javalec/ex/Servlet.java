package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void PostConstruct() {
		System.out.println("PostConstruct가 init 보다 먼저 최초로 한번 실행된다.");
	}

	@PreDestroy
	public void PreDestroy() {
		System.out.println("preDestroy가 destroy보다 마지막에 실행된다.");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init이 최초에 먼저 실행된다.");
	}

	@Override
	public void destroy() {
		System.out.println("destroy가 마지막에 한번 실행된다.");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet이 실행된다.");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter write = response.getWriter();

		write.println("<html>");
		write.println("<head>");
		write.println("</head>");
		write.println("<body>");
		write.println("<h1>안뇽</h1>");
		write.println("</body>");
		write.println("</html>");

		write.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost가 실행된다.");
		request.setCharacterEncoding("utf-8");
		PrintWriter write = response.getWriter();

		write.println("<html>");
		write.println("<head>");
		write.println("</head>");
		write.println("<body>");
		write.println("<h1>hello</h1>");
		write.println("</body>");
		write.println("</html>");

		write.close();

	}

}
