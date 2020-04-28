package com.javalec.ex.BFront;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.BCommand.BDeleteCommand;
import com.javalec.ex.BCommand.BListcommand;
import com.javalec.ex.BCommand.BModifyCommand;
import com.javalec.ex.BCommand.BModifyViewCommand;
import com.javalec.ex.BCommand.BReplyCommand;
import com.javalec.ex.BCommand.BReplyViewCommand;
import com.javalec.ex.BCommand.BWritecommand;
import com.javalec.ex.BContentCommand.BContentcommand;


@WebServlet("*.do")
public class BFront extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public BFront() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet으로 들어옴");
		actionDo(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost로 들어옴");
		actionDo(request,response);
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo 호출");
		request.setCharacterEncoding("utf-8");
		
		String pageView=null;
		BCommand bcom=null;
		
		//페이지 확인
		String uri=request.getRequestURI();
		String conPath=request.getContextPath();
		String com=uri.substring(conPath.length());
		
		if(com.equals("/list.do")) {
			bcom=new BListcommand();
			bcom.execute(request, response);
			pageView="list.jsp";
		}else if(com.equals("/content_view.do")) {
			bcom=new BContentcommand();
			bcom.execute(request, response);
			pageView="content_view.jsp";
		}else if(com.equals("/write_view.do")) {
			pageView="write_view.jsp";
		}else if(com.equals("/write.do")){
			bcom=new BWritecommand();
			bcom.execute(request, response);
			pageView="list.do";
		}else if(com.equals("/delete.do")) {
			bcom=new BDeleteCommand();
			bcom.execute(request, response);
			pageView="list.do";
		}else if(com.equals("/reply_view.do")) {
			bcom=new BReplyViewCommand();
			bcom.execute(request, response);
			pageView="reply_view.jsp";
		}else if(com.equals("/reply.do")) {
			bcom=new BReplyCommand();
			bcom.execute(request, response);
			pageView="list.do";
		}else if(com.equals("/modify_view.do")) {
			bcom=new BModifyViewCommand();
			bcom.execute(request, response);
			pageView="modify_view.jsp";
		}else if(com.equals("/modify.do")) {
			bcom=new BModifyCommand();
			bcom.execute(request, response);
			pageView="list.do";
		}
		
		//forward
		RequestDispatcher dispatcher=request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
	}
}
