package com.javalec.ex.bcommand;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public interface BCommand {

	public void execute(HttpServletRequest request, Model model);

}
