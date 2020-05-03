package home.java.ex.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.ex.Dao.Dao;
import home.java.ex.Dto.Dto;
import home.java.ex.Interace.Interface;

public class replyFormCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bId=Integer.parseInt(request.getParameter("bId"));
		Dao dao=new Dao();
		Dto dto=new Dto();
	dto=dao.modiGetCon(bId);
	request.setAttribute("replyView",dto );

	}

}
