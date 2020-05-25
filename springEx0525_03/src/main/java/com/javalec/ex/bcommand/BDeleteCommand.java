package com.javalec.ex.bcommand;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, Model model) {
		String bId = request.getParameter("bId");
		BDao bdao = new BDao();
		bdao.delete(bId);

	}

}
