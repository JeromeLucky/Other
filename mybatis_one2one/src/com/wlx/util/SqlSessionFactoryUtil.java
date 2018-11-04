package com.wlx.util;

/**
 * ��дSqlSessionFactoryUtil������,�������ڴ���
 * SqlSession����
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
				//Ҫ�봴��SqlSessionFactory����,�ͱ����Ƚ���mybatis-config.xml�ļ�
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
	
	
	//�ֱ�ر�SqlSessionFactory��SqlSession
	
	
	
	
}
