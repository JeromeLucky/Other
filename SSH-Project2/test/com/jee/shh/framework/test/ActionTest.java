package com.jee.shh.framework.test;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.jerome.ssh.user.service.TestService;
import com.opensymphony.xwork2.ActionSupport;
@Controller
@Scope("prototype")
public class ActionTest extends ActionSupport {
/*	@Resource
	private TestService testService;

	public String execute( HttpServletRequest request,HttpServletResponse resp) throws Exception {
				
					String name=request.getParameter("account");
					String pwd=request.getParameter("pwd");
				// TODO Auto-generated method stub
					System.out.println("ActionTest.execute()--------------------------------------");
					System.out.println(name+"--------------------"+pwd);
				return "success";
			}
				@Override
				public String execute() throws Exception {
					testService.userAdd();
				return "success";
		}*/
}
