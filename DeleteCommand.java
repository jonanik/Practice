package practice.java.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.java.ex.Dao.Dao;

public class DeleteCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bid=Integer.parseInt(request.getParameter("bid"));
		Dao dao=new Dao();
		dao.delete(bid);

	}

}
