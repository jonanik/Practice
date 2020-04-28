package practice.java.ex.command;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.java.ex.Dao.Dao;

public class ReplyCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bid=Integer.parseInt(request.getParameter("bid")) ;
		String btitle=request.getParameter("btitle");
		String bname=request.getParameter("bname");
		String bcontent=request.getParameter("bcontent");
		int bgroup=Integer.parseInt(request.getParameter("bgroup"));
		int bindent=Integer.parseInt(request.getParameter("bindent"));
		int bstep=Integer.parseInt(request.getParameter("bstep"));
		Dao dao=new Dao();
		dao.reply(bid, btitle, bname, bcontent,bgroup,bindent,bstep);

	}

}
