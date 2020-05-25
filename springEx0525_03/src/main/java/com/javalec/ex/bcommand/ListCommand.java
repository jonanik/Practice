package com.javalec.ex.bcommand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class ListCommand implements BCommand {
	@Override
	public void execute(HttpServletRequest request, Model model) {
		BDao bdao = new BDao();
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		dtos = bdao.list();
		model.addAttribute("list", dtos);
	}

}
