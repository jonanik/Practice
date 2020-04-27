package home.java.ex.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandInter {

	public void execute(HttpServletRequest request,HttpServletResponse response);
	
}
