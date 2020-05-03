package home.java.ex.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.ex.Dao.Dao;
import home.java.ex.Interace.Interface;

public class ReplyCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int bId=Integer.parseInt(request.getParameter("bId"));
		String bName=request.getParameter("bName");
		String bTitle=request.getParameter("bTitle");
		String bContent=request.getParameter("bContent");
		int bGroup=Integer.parseInt(request.getParameter("bGroup"));
		int bStep=Integer.parseInt(request.getParameter("bStep"));
		int bIndent=Integer.parseInt(request.getParameter("bIndent"));
		
		Dao dao=new Dao();
		dao.reply(bId,bName,bTitle,bContent,bGroup,bStep,bIndent);

	}

}
