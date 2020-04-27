package home.java.ex.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.ex.Dao.Dao;
import home.java.ex.Dto.Dto;

public class ContentCommand implements CommandInter {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int num=Integer.parseInt(request.getParameter("num"));
		Dao dao=new Dao();
		Dto dto=new Dto(); 
		dto=dao.content(num);
		request.setAttribute("content", dto);
		
	}

	
	
}
