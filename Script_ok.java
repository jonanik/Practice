package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/S_ok")
public class Script_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Script_ok() {
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
		response.setCharacterEncoding("utf_8");
		response.setContentType("text/html; charset=utf-8");

		String str;
		str = "<script type=\"text/javascript\">" + ""
				+ "alert(\"아이디,패스워드가 잘못되었습니다. 다시 입력해주세요.\");"
				+ "location.href='Script_link.html';" + "</script>";
				//"history.back(-1);\r\n"+ 로케이션이랑 히스토리 둘다 쓸 수 있다. 
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println(str);
		writer.println("</body></html>");
		writer.close();

	}
}
