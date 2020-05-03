package home.java.ex.Command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.java.ex.Dao.Dao;
import home.java.ex.Dto.Dto;
import home.java.ex.Interace.Interface;

public class ListCommand implements Interface {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		Dao dao=new Dao();
		ArrayList<Dto> list=new ArrayList<Dto>();
		list=dao.list();
		request.setAttribute("list", list);
		
	}

}
