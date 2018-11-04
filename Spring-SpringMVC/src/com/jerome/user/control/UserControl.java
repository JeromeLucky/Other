package com.jerome.user.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserControl implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(" spring mvc controller");
		ModelAndView mv=new ModelAndView();
			mv.setViewName("springmvc");
			mv.addObject("msg", "this is modelview");

		return mv;
	}

}
