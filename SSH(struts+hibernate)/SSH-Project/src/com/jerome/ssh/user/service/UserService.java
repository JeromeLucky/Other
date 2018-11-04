package com.jerome.ssh.user.service;

import com.jerome.ssh.user.dao.UserDao;

public class UserService {
		private UserDao userDao;
		public UserDao getUserDao() {
			return userDao;
		}
		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}
		public void saveUser() {
					userDao.addUser();
		}
}
