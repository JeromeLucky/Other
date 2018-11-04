package com.jerome.user.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jerome.user.entity.User;

@Controller
public class UserControl {
	@Autowired
	private User user;
		@RequestMapping(value="/login")
		public String login(User user,ModelMap model) {
				System.out.println("UserControl.login()=============="+user);
				model.addAttribute("user",user);
			return "springmvc";
	}
		@RequestMapping(value="/{id1}/{name1}/{age1}")
		public String login(@PathVariable("id1") int id,@PathVariable("name1") String name,@PathVariable("age1") int age,ModelMap model) {
			
				user.setId(id);
				user.setName(name);
				user.setAge(age);
			System.out.println("UserControl.login()=============="+user);
				model.addAttribute("user",user);
			return "springmvc";
	}
}
