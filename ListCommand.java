package practice.java.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.java.ex.Dao.Dao;
import practice.java.ex.Dto.Dto;

public class ListCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Dao dao=new Dao();
		int listCount=dao.getListCount();
		int page=1;//현재페이지
		int limit=10;//게시글 개수
		int maxpage=(int)((double)listCount/limit+0.95);//최대페이지
		int startpage=(((int)((double)page/10+0.9))-1)*10+1;//처음페이지 10개단위로
		int endpage=maxpage;//마지막페이지(10,20,30)
		if(endpage>startpage+10-1) endpage=startpage+10-1;
		ArrayList<Dto> list=new ArrayList<Dto>();
		
		if(request.getParameter("page")!=null) {
			page=Integer.parseInt(request.getParameter("page"));
		}
		list=dao.List(page,limit);
		request.setAttribute("list", list);
		request.setAttribute("listCount",listCount);
		request.setAttribute("page", page);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		
	}

}
