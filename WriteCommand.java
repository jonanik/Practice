package practice.java.ex.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.java.ex.Dao.Dao;

public class WriteCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bname=request.getParameter("bname");
		String btitle=request.getParameter("btitle");
		String bcontent=request.getParameter("bcontent");
		Dao dao=new Dao();
		dao.write(bname,btitle,bcontent);

	}

}
