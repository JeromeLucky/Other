package com.jerome.struts.i18n.action;

import com.jerome.struts.i18n.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class I18nAction  extends ActionSupport{
		private User user;
		
		@Override
		public String execute() throws Exception {
			// TODO Auto-generated method stub
			return "success";
		}
		public String login() {
			String accountType=this.getText("item.account");
			System.out.println("login----action"+user+accountType);
			return "success";
		}
		
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
}
