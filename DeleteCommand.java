package home.java.ex.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.ex.Dao.Dao;
import home.java.ex.Interace.Interface;

public class DeleteCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bId=Integer.parseInt(request.getParameter("bId"));
		Dao dao=new Dao();
		dao.delete(bId);

	}

}
