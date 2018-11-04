package com.jerome.struts.logintest.interceptor;

import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoinInterceptor implements Interceptor {

	@Override
	public void destroy() {	
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
			Map session =ServletActionContext.getContext().getSession();
			Object obj=session.get("user");
						if(obj==null||obj.equals("")) {
								return "error";
						}else {
							return "success";
						}
	}

}
