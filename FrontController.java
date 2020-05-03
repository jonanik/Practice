package home.java.ex.Front;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.ex.Command.ContentViewCommand;
import home.java.ex.Command.DeleteCommand;
import home.java.ex.Command.ListCommand;
import home.java.ex.Command.ReplyCommand;
import home.java.ex.Command.WriteCommand;
import home.java.ex.Command.modifyCommand;
import home.java.ex.Command.modifyViewCommand;
import home.java.ex.Command.replyFormCommand;
import home.java.ex.Interace.Interface;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public FrontController() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGetÀ¸·Î µé¾î¿È");
		actionDo(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost·Î µé¾î¿È");
		actionDo(request, response);
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
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
		}else if(com.equals("/contentView.do")) {
			in=new ContentViewCommand();
			in.execute(request, response);
			viewPage="contentView.jsp";
		}else if(com.equals("/modifyView.do")) {
			in=new modifyViewCommand();
			in.execute(request, response);
			viewPage="modifyView.jsp";
		}else if(com.equals("/modify.do")) {
			in=new modifyCommand();
			in.execute(request, response);
			viewPage="list.do";
		}else if(com.equals("/write.do")) {
			in=new WriteCommand();
			in.execute(request, response);
			viewPage="list.do";
		}else if(com.equals("/writeForm.do")) {
			viewPage="writeForm.jsp";
		}else if(com.equals("/delete.do")) {
			in=new DeleteCommand();
			in.execute(request, response);
			viewPage="list.do";
		}else if(com.equals("/replyForm.do")) {
			in=new replyFormCommand();
			in.execute(request, response);
			viewPage="replyForm.jsp";
		}else if(com.equals("/reply.do")) {
			in=new ReplyCommand();
			in.execute(request, response);
			viewPage="list.do";
		}
		request.setCharacterEncoding("utf-8");
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
