package home.java.ex.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.ex.Dao.Dao;
import home.java.ex.Interace.Interface;

public class WriteCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bName=request.getParameter("bName");
		String bTitle=request.getParameter("bTitle");
		String bContent=request.getParameter("bContent");
				System.out.println(bContent);
		Dao dao=new Dao();
		dao.write(bName,bTitle,bContent);

	}

}
