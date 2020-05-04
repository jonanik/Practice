package prc.ex.Command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import prc.ex.Dao.Dao;
import prc.ex.Dto.Dto;

public class ListCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Dao dao=new Dao();
		
		String opt=request.getParameter("opt");
		String search=request.getParameter("search");
		String searchFlag=null;
		
		int page=1;
		int limit=10;
		int listCount=dao.listCount(opt,search);
		int startPage=((int)((double)page/10+0.95)-1)*10+1;
		int maxPage=(int)((double)listCount/limit+0.95);
		int endPage=maxPage;
		
		
		ArrayList<Dto> list=new ArrayList<Dto>();
		
		if(request.getParameter("page")!=null) {
			page=Integer.parseInt(request.getParameter("page"));
		}
		
		if(opt==null) opt="";
		if(search==null) search="";
		
		list=dao.getList(page,limit,opt,search);
		request.setAttribute("list", list);
		request.setAttribute("page", page);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("maxPage", maxPage);
		
		if(search!=null) {
			searchFlag="1";
			request.setAttribute("searchFlag", searchFlag);
			request.setAttribute("opt", opt);
			request.setAttribute("search", search);
		}
		
	}

}
