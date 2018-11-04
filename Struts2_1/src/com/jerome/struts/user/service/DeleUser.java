package com.jerome.struts.user.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DeleUser extends ActionSupport {
					@Override
					public String execute() throws Exception {
						// TODO Auto-generated method stub
						HttpServletRequest request=ServletActionContext.getRequest();

								request.setAttribute("value", "É¾³ý³É¹¦");
						return "success";
					}
}
