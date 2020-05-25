package com.javalec.ex.bcommand;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, Model model) {
		int bId = Integer.parseInt(request.getParameter("bid"));
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bName");
		String bContent = request.getParameter("bName");
		String bGroup = request.getParameter("bName");
		String bStep = request.getParameter("bName");
		String bIndent = request.getParameter("bName");

		BDao bdao = new BDao();
		bdao.reply(bId, bName, bTitle, bContent, bGroup, bStep, bIndent);

	}

}
