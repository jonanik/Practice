package com.javalec.ex.BCommand;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.SetAllPropertiesRule;

import com.javalec.ex.BDao.BDao;
import com.javalec.ex.BDto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao bdao=new BDao();
		ArrayList<BDto> list=new ArrayList<BDto>();
		list=bdao.list();
		request.setAttribute("list", list);
		

	}

}
