package com.jerome.mybatis.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {
		 private static SqlSessionFactory sqlSessionFactory;
		 private static SqlSessionFactory getSqlSessionFactory() {
			 		try {
			 				if(sqlSessionFactory==null) {
			 					InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
			 					sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);	
			 				}
			 		}catch (IOException e) {
			 				e.printStackTrace();
			 		}
			 		return sqlSessionFactory;			
		 	}	
		 
		 	public 	static   SqlSession      getSqlSession() {
		 			return getSqlSessionFactory().openSession();
		 	}
		 	public static void sessionClose( SqlSession sqlSession) {
		 						sqlSession.close();
		 	}
}