package com.jerome.user.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jerome.user.entity.User;

@Controller
public class UserControl {
	
	@RequestMapping(value="/mvc")
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(" spring mvc controller");
		ModelAndView mv=new ModelAndView();
			mv.setViewName("springmvc");
			mv.addObject("msg", "this is modelview");

		return mv;
	}
@RequestMapping("/arg")
		public String getArgment(String name,int age){
					System.out.println(name+"--------------"+age);
					return "springmvc";
		}
@RequestMapping("/user")
	public String getUser(User user ,ModelMap model){
			model.addAttribute("user",user);
			System.out.println(user);
			return "springmvc";
}

}
