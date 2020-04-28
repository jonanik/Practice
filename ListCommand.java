package practice.java.ex.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import practice.java.ex.Dao.Dao;
import practice.java.ex.Dto.Dto;

public class ListCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Dao dao=new Dao();
		ArrayList<Dto> list=new ArrayList<Dto>();
		
		list=dao.List();
		request.setAttribute("list", list);
		
	}

}
