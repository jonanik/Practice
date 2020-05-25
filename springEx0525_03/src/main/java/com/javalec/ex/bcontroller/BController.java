package com.javalec.ex.bcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.BDto.BDto;
import com.javalec.ex.bcommand.BCommand;
import com.javalec.ex.bcommand.BDeleteCommand;
import com.javalec.ex.bcommand.BReplyCommand;
import com.javalec.ex.bcommand.BReplyViewCommand;
import com.javalec.ex.bcommand.BWriteCommand;
import com.javalec.ex.bcommand.ContentViewCommand;
import com.javalec.ex.bcommand.ListCommand;
import com.javalec.ex.util.Constant;

@Controller
public class BController {

	JdbcTemplate template;
	BCommand bcom = null;

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model) {
		bcom = new ListCommand();
		bcom.execute(request, model);
		return "list";
	}

	@RequestMapping("/content_view")
	public String contentView(HttpServletRequest request, Model model) {
		bcom = new ContentViewCommand();
		bcom.execute(request, model);
		return "content_view";
	}

	@RequestMapping("write")
	public String write(Model model) {
		return "write_view";

	}

	@RequestMapping("write_view")
	public String write_view(HttpServletRequest request, Model model) {
		bcom = new BWriteCommand();
		bcom.execute(request, model);

		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		bcom = new BDeleteCommand();
		bcom.execute(request, model);
		return "redirect:list";
	}

	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		bcom = new BReplyViewCommand();
		bcom.execute(request, model);
		return "reply_view";
	}

	@RequestMapping("reply")
	public String reply(HttpServletRequest request,Model model) {
		bcom = new BReplyCommand();
		bcom.execute(request,model);
		return "redirect:list";
	}

}
