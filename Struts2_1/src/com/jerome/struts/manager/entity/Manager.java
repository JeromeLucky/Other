package com.jerome.struts.manager.entity;

public class Manager {
		private  int id;
		private String account;
		private String password;
		private String userName;
		public int getId() {
			return id;
		}
		public void setId(int id) {
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
		public String toString() {
			return "Manager [id=" + id + ", account=" + account + ", password=" + password + ", userName=" + userName
					+ "]";
		}
		public Manager() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Manager(int id, String account, String password, String userName) {
			super();
			this.id = id;
			this.account = account;
			this.password = password;
			this.userName = userName;
		}
		
}
