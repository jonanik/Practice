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
		System.out.println("doGet으로 들어옴");
		actionDo(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost로 들어옴");
		actionDo(request,response);
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo로 들어옴");
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
		}else if(com.equals("modifyView")) {
			in=new modifyViewCommand();
			in.execute(request, response);
			viewPage="modify.jsp";
		}else if(com.equals("/modify.do")) {
			in=new ModifyCommand();
			in.execute(request, response);
			viewPage="list.do";
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
