package com.wlx.util;

/**
 * 编写SqlSessionFactoryUtil工具类,该类用于创建
 * SqlSession对象
 * @author wlx
 *
 */

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil 
{
	private static SqlSessionFactory  sqlSessionFactory;
	
	public  static SqlSessionFactory  getSqlSessionFactory()
	{
		try {
			if(sqlSessionFactory == null)
			{
				//要想创建SqlSessionFactory对象,就必须先解析mybatis-config.xml文件
				InputStream  inputStream = Resources.getResourceAsStream("mybatis-config.xml");
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
		
	}
	
	
	public  static SqlSession  getSqlSession()
	{
		return getSqlSessionFactory().openSession();
	}
	
	
	//分别关闭SqlSessionFactory、SqlSession
	
	
	
	
}
