package home.java.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.ex.Command.CommandInter;
import home.java.ex.Command.ContentCommand;
import home.java.ex.Command.ListCommand;


@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controller() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGetÀ¸·Î µé¾î¿È");
		actionDo(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost·Î µé¾î¿È");
		actionDo(request,response);
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo·Î µé¾î¿È");
		String viewPage=null;
		String uri=request.getRequestURI();
		String conPath=request.getContextPath();
		String com=uri.substring(conPath.length());
		CommandInter comm;
		
		if(com.equals("/select.do")) {
			comm=new ListCommand();
			comm.execute(request, response);
			viewPage="select.jsp";
		}else if(com.equals("/content.do")) {
			comm=new ContentCommand();
			comm.execute(request, response);
			viewPage="content.jsp";
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
	
	
}
