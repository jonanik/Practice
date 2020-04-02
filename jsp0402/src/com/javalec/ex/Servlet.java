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
		System.out.println("PostConstruct�� init ���� ���� ���ʷ� �ѹ� ����ȴ�.");
	}

	@PreDestroy
	public void PreDestroy() {
		System.out.println("preDestroy�� destroy���� �������� ����ȴ�.");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init�� ���ʿ� ���� ����ȴ�.");
	}

	@Override
	public void destroy() {
		System.out.println("destroy�� �������� �ѹ� ����ȴ�.");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet�� ����ȴ�.");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter write = response.getWriter();

		write.println("<html>");
		write.println("<head>");
		write.println("</head>");
		write.println("<body>");
		write.println("<h1>�ȴ�</h1>");
		write.println("</body>");
		write.println("</html>");

		write.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost�� ����ȴ�.");
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
