package com.jerome.struts.logintest.action;


import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.struts2.ServletActionContext;

import com.jerome.struts.logintest.pojo.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

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
	//针对login方法 进行验证
	public void validateLogin() {
		
		if(account==null||account.equals("")){
			this.addFieldError("error", "用户名不能为空！");
		}
		
		if(password==null||password.equals("")){
			this.addFieldError("error", "密码不能为空！");
		}else{
			
			String pattern = "^[0-9a-zA-Z]{6,12}$";
			
			Pattern p = Pattern.compile(pattern);
			
			Matcher m = p.matcher(password);
			
			boolean b = m.matches();
			
			if(!b){
				this.addFieldError("error", "密码的长度必须在6至12之间！");
			}
			
		}
		
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
