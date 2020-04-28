package practice.java.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.java.ex.Dao.Dao;
import practice.java.ex.Dto.Dto;

public class contentViewCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bid=Integer.parseInt(request.getParameter("bid"));
		Dao dao=new Dao();
		Dto dto=new Dto();
		dto=dao.getcontent(bid);
		
		request.setAttribute("contentView", dto);
		
	}

}
