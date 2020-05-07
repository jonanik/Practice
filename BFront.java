package com.javalec.ex.BFront;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.ex.BListcommand.BListcommand;
import com.javalec.ex.Bcommand.AdminLoginCommand;
import com.javalec.ex.Bcommand.BContentCommand;
import com.javalec.ex.Bcommand.BWriteCommand;
import com.javalec.ex.Bcommand.Bcommand;
import com.javalec.ex.Bcommand.DeleteCommand;
import com.javalec.ex.Bcommand.EventListCommand;
import com.javalec.ex.Bcommand.EventWriteCommand;
import com.javalec.ex.Bcommand.LogoutCommand;
import com.javalec.ex.Bcommand.ModifyCommand;
import com.javalec.ex.Bcommand.modifyFormCommand;


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
		System.out.println("actionDo로 들어옴");
		request.setCharacterEncoding("utf-8");
		
		String pageView=null;
		Bcommand bcom=null;
		
		String uri=request.getRequestURI();
		String conPath=request.getContextPath();
		String com=uri.substring(conPath.length());
		HttpSession session=request.getSession();
		
		if(com.equals("/list.do")) {//공지사항의 모든 글을 가져온다.
			bcom=new BListcommand();
//			bcom=new BEventCommnad();
			bcom.execute(request, response);
			pageView="list.jsp";	
		}
		
		
		else if(com.equals("/content.do")) {//공지사항에서 게시물을 클릭하면 해당 글을 보여준다
			bcom=new BContentCommand();
			bcom.execute(request, response);
			pageView="content.jsp";
		}else if(com.equals("/adminLogin.do")) {
			pageView="adminList.do";
		}else if(com.equals("/adLogin.do")) {//관리자 로그인을 한다.1
			bcom=new AdminLoginCommand();
			bcom.execute(request, response);
			pageView="adminList.do";
		}else if(com.equals("/adminList.do")) {//관리자 로그인 시 리스트를 가지고 들어감2
			bcom=new BListcommand();
			bcom.execute(request, response);
			pageView="admin.jsp";
		}
		else if(com.equals("/adloginOk.do")) {//관리자 로그인이 되서 세션이 있을 경우 리스트를 가지고 들어감
			pageView="adminList.do";
		}
		else if(com.equals("/moreList.do")) {//관리자페이지에서 모든 공지사항 글을 가져온다.
			bcom=new BListcommand();
			bcom.execute(request, response);
			pageView="noticeTlist.jsp";
		}
		//관리자페이지에서 글쓰기
		else if(com.equals("/writeForm.do")) {
			pageView="write.jsp";
		}else if(com.equals("/write.do")) {
			bcom=new BWriteCommand();
			bcom.execute(request, response);
			pageView="moreList.do";
		}
		
		//관리자페이지에서 이벤트 글쓰기
		else if(com.equals("/Event.do")) {
			pageView="adminEventWrite.jsp";
		}else if(com.equals("/EventWrite.do")) {
			bcom=new EventWriteCommand();
			bcom.execute(request, response);
			pageView="moreList.do";
		}
		
		//입력된 이벤트글 출력
		else if(com.equals("/EventList.do")) {
			bcom=new EventListCommand();
			bcom.execute(request, response);
			pageView="EventList.jsp";
		}
		
		//관리자페이지에서 글 보기
		else if(com.equals("/adcontent.do")) {//공지사항에서 게시물을 클릭하면 해당 글을 보여준다
			bcom=new BContentCommand();
			bcom.execute(request, response);
			pageView="noticeView.jsp";
		}
		
		//로그아웃 하면 세션을 제거한다.
		else if(com.equals("/logout.do")) {
			bcom=new LogoutCommand();
			bcom.execute(request, response);
			pageView="main.jsp";
		}
		//글 삭제
		else if(com.equals("/delete.do")) {
			bcom=new DeleteCommand();
			bcom.execute(request, response);
			pageView="moreList.do";
		}
		
		//글 수정 폼
		else if(com.equals("/modifyForm.do")) {
			bcom=new modifyFormCommand();
			bcom.execute(request, response);
			pageView="modifyForm.jsp";
		}
		//글 수정
		else if(com.equals("/modify.do")) {
			bcom=new ModifyCommand();
			bcom.execute(request, response);
			pageView="moreList.do";
		}
		
		else if(com.equals("/search.do")) {
			bcom=new BListcommand();
			bcom.execute(request, response);
			pageView="list.jsp";
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
	}
}
