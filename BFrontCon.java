package com.javalec.ex;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.MemberDao;
import com.javalec.ex.DTO.MemberDto;


@WebServlet("*.do")
public class BFrontCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public BFrontCon() {
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
	protected void actionDo(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		//페이지 이동에 사용하는 변수
		String viewPage=null;
		
		System.out.println("actionDo 들어옴");
		request.setCharacterEncoding("utf-8");
		//url=http://localhost:8181/jsp_0424/insert
		//uri=/jsp_0424/insert
		String uri=request.getRequestURI();
		//contextPath=/jsp_0424
		String conPath=request.getContextPath();
		//file명=/insert
		String com=uri.substring(conPath.length());//conPath.length에 해당하는 숫자만큼 uri의 글자수에서 제하고 그다음부터를 com에 담는다.
		
		System.out.println(com);
		
		if(com.equals("/insert.do")) {
			System.out.println("insert페이지를 요청하였습니다.");
			request.setAttribute("insert_com",com);
			viewPage="insert.jsp";
		}else if(com.equals("/update.do")) {
			System.out.println("update페이지를 요청하였습니다.");
			request.setAttribute("update_com",com);
			viewPage="update.jsp";
			
		}else if(com.equals("/select.do")) {
			System.out.println("select페이지를 요청하였습니다.");
			ArrayList<MemberDto> list=new ArrayList<MemberDto>();
			MemberDao mdao=MemberDao.getInstance();
			list=mdao.getMembers();
			request.setAttribute("dtos",list);
			request.setAttribute("select_address",com);
			
			viewPage="select.jsp";
			
		}else if(com.contentEquals("/delete.do")) {
			System.out.println("delete페이지를 요청하였습니다.");
	
			request.setAttribute("delete_com",com);
			viewPage="delete.jsp";
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
