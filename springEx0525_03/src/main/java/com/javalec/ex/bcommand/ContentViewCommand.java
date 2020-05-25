package com.javalec.ex.bcommand;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class ContentViewCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, Model model) {

		String bId = request.getParameter("bId");
		BDao bdao = new BDao();
		BDto bdto = bdao.contentView(bId);
		bdao.upHit(bId);
		model.addAttribute("content_view", bdto);
	}

}
