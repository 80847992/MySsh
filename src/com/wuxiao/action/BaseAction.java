package com.wuxiao.action;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseAction extends ActionSupport {
	
	private static final long serialVersionUID = 8268916806973818879L;

	@Autowired
	protected HttpServletRequest request;
	
	@Override
	public String execute() throws Exception {
		return super.execute();
	}
}
