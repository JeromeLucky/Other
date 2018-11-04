package com.jerome.struts.logintest.action;


import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.ServletActionContext;

import com.jerome.struts.logintest.pojo.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginXmlAction extends ActionSupport{

	private String account;
	private String password;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() {
				if("admin".equals(account)&&"123456".equals(password)) {
						User user=new User();
						user.setAccount(account);
						user.setPassword(password);
							Map session=ServletActionContext.getContext().getSession();
											session.put("user", user);
											return  "success";
				}else {
						return "error";
				}
	}

	
}
