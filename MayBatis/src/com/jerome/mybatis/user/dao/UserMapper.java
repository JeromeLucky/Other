package com.jerome.mybatis.user.dao;

import java.util.List;

import com.jerome.mybatis.user.entity.User;

public interface UserMapper {
	public int add(User user);
	public int delet(int id);
	public User findByid(int id);
	public int update(User user);
	public List<User> query();

}
