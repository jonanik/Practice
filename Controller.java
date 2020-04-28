package practice.java.ex.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.java.ex.command.DeleteCommand;
import practice.java.ex.command.Interface;
import practice.java.ex.command.ListCommand;
import practice.java.ex.command.ModifyCommand;
import practice.java.ex.command.ReplyCommand;
import practice.java.ex.command.ReplyViewCommend;
import practice.java.ex.command.WriteCommand;
import practice.java.ex.command.contentViewCommand;
import practice.java.ex.command.modifyViewCommand;


@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet�쑝濡� �뱾�뼱�샂");
		actionDo(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost濡� �뱾�뼱�샂");
		actionDo(request,response);
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("actionDo濡� �뱾�뼱�샂");
		String viewPage=null;
		String uri=request.getRequestURI();
		String conpath=request.getContextPath();
		String com=uri.substring(conpath.length());
		Interface in;
		
		
		if(com.equals("/list.do")) {
			in=new ListCommand();
			in.execute(request, response);
			viewPage="list.jsp";
		}else if(com.equals("/contentView.do")) {
			in=new contentViewCommand();
			in.execute(request, response);
			viewPage="contentView.jsp";
		}else if(com.equals("/write.do")) {
			in=new WriteCommand();
			in.execute(request, response);
			viewPage="list.do";
		}else if(com.equals("/delete.do")) {
			in=new DeleteCommand();
			in.execute(request, response);
			viewPage="list.do";
		}else if(com.equals("/modifyView.do")) {
			in=new modifyViewCommand();
			in.execute(request, response);
			viewPage="modify.jsp";
		}else if(com.equals("/modify.do")) {
			in=new ModifyCommand();
			in.execute(request, response);
			viewPage="list.do";
		}else if(com.contentEquals("/replyView.do")) {
			in=new ReplyViewCommend();
			in.execute(request, response);
			viewPage="replyView.jsp";
		}else if(com.contentEquals("/reply.do")) {
			in=new ReplyCommand();
			in.execute(request, response);
			viewPage="list.do";
		}
		request.setCharacterEncoding("utf-8");
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
