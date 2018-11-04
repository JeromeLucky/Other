package com.jerome.ssh.user.action;

import com.jerome.ssh.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction  extends ActionSupport{
				private  UserService userService;
				public UserService getUserService() {
					return userService;
				}
				public void setUserService(UserService userService) {
					this.userService = userService;
				}
				
				
				@Override
				public String execute() throws Exception {
					// TODO Auto-generated method stub
					userService.saveUser();
					return "success";
				}
}
