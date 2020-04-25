package home.java.Contoroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.Dao.MDao;
import home.java.Dto.MDto;


@WebServlet("*.do")
public class MController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MController() {
      
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
		request.setCharacterEncoding("utf-8");
		
		String uri=request.getRequestURI();
		String conPath=request.getContextPath();
		String come=uri.substring(conPath.length());
		
		if(come.equals("/insert.do")) {
			
			viewPage="insert.jsp";
			
		}else if(come.equals("/select.do")) {
			ArrayList<MDto> list=new ArrayList<MDto>();
			MDto mdto=new MDto();
			MDao mdao=MDao.instance();
			list=mdao.getMembers(mdto);
			request.setAttribute("memList",list);
			request.setAttribute("sel_address", come);
			viewPage="select.jsp";
			
		}else if(come.equals("/delete.do")) {
			
			viewPage="delete.jsp";
		}else if(come.equals("/update.do")) {
			
			viewPage="update.jsp";
		}
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
}
