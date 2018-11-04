package com.jerome.struts.user.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class AddUser extends ActionSupport {
					@Override
					public String execute() throws Exception {
						// TODO Auto-generated method stub
						HttpServletRequest request=ServletActionContext.getRequest();
							String value=request.getParameter("name");
							System.out.println(value);
								request.setAttribute("value", value);
						return "success";
					}
}
