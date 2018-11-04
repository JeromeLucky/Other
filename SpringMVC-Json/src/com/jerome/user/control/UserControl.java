package com.jerome.user.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		//ajax 访问  并已json格式传回集合数据
		  @RequestMapping("/json.do")
		   @ResponseBody
		    public  List<User>  jsonRequest()
		    {
		        List<User>  list = new ArrayList<>();
		        list.add(new User(1, "qq", 21));
		        list.add(new User(2, "webqq", 22));
		        list.add(new User(3, "uc", 32));
		        list.add(new User(4, "pp", 12));   
		        return list;
		        
		    }
}
