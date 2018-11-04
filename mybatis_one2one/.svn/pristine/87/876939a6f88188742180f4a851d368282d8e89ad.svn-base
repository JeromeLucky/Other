package com.wlx.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wlx.entity.User;
import com.wlx.mappers.UserMappers;
import com.wlx.util.SqlSessionFactoryUtil;

public class JunitTesting 
{
	private static Logger  logger = Logger.getLogger(JunitTesting.class);
	private SqlSession   sqlsession;
	private UserMappers  userMappers;
	
	/**
	 * 在执行@Test注解的方法之前执行该方法
	 */
	@Before
	public  void initObject()
	{
		sqlsession = SqlSessionFactoryUtil.getSqlSession();
		userMappers = sqlsession.getMapper(UserMappers.class);
	}
	
	@After
	public  void close()
	{
		sqlsession.close();
	}
	
	@Test
	public void findUserAndAddress()
	{
		
		logger.info("根据用户id查询用户信息以及用户的地址");
		
		User user = userMappers.findUserAndAddress(3);
		System.out.println(user);
		
		
	}
	 	
	
	
	
	
	
	

}
