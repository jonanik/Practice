package com.javalec.ex.bcommand;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class BReplyViewCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, Model model) {
		String bId = request.getParameter("bId");
		BDao bdao = new BDao();
		BDto bdto = new BDto();
		bdto = bdao.reply_view(bId);
		model.addAttribute("reply_view", bdto);

	}

}
