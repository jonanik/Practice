package com.javalec.ex.BCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BDao.BDao;

public class BModifyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bId=Integer.parseInt(request.getParameter("bId"));
		String bTitle=request.getParameter("bTitle");
		String bContent=request.getParameter("bContent");
		BDao dao=new BDao();
		
		int check=dao.modify(bId,bTitle,bContent);
		

	}

}
