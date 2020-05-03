package home.java.ex.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.ex.Dao.Dao;
import home.java.ex.Interace.Interface;

public class modifyCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bId=Integer.parseInt(request.getParameter("bId"));
		String bTitle=request.getParameter("bTitle");
		String bContent=request.getParameter("bContent");
		Dao dao=new Dao();
		dao.modify(bId, bTitle, bContent);

	}

}
