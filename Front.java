package prc.ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prc.ex.Command.Interface;
import prc.ex.Command.ListCommand;

@WebServlet("*.do")
public class Front extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Front() {
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
		String comPath=request.getContextPath();
		String com=uri.substring(comPath.length());
		Interface in;
		
		if(com.equals("/list.do")) {
			in=new ListCommand();
			in.execute(request, response);
			viewPage="list.jsp";
		}else if(com.equals("/search.do")) {
			in=new ListCommand();
			in.execute(request, response);
			viewPage="list.jsp";
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
