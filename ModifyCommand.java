package practice.java.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.java.ex.Dao.Dao;

public class ModifyCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Dao dao=new Dao();
		int bid=Integer.parseInt(request.getParameter("bid"));
		String btitle=request.getParameter("btitle");
		String bcontent=request.getParameter("bcontent");
		dao.modify(bid,btitle,bcontent);

	}

}
