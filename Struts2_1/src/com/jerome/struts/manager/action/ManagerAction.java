package com.jerome.struts.manager.action;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.jerome.struts.manager.entity.Manager;
import com.opensymphony.xwork2.ActionSupport;

public class ManagerAction  extends ActionSupport{
	private Integer id;
	private String account;
	private String password;
	private String userName;
	private Date createTime;
	
	
		public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
		@Override
		public String execute() throws Exception {
			// TODO Auto-generated method stub
			return"success";
		}
		public String add() throws Exception{
				
		/*		此方法 为servlet的方法  
		 * HttpServletRequest request=ServletActionContext.getRequest();
				String id=request.getParameter("id");
				String   account =request.getParameter("account");
				String   password =request.getParameter("password");
				String   userName =request.getParameter("userName");*/
			
		//方式二 用struts 框架自己进行反射  获取 表单元素属性  会自动进行数据类型转换  (表单提交数据为string类型) date 类型需要自定义类型转换器
		Manager manager=new Manager();
					manager.setId(id);
					manager.setAccount(account);
					manager.setPassword(password);
					manager.setUserName(userName);
					
				System.out.println("manager---------------add"+manager+createTime);
				//manager---------------addManager [id=12, account=21, password=eqeq, userName=212]
				return "success";
			
	}
		public Date getCreateTime() {
			return createTime;
		}
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
}
