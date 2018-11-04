package com.jerome.mybatis.user.test;

import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.builder.InitializingObject;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;

import com.jerome.mybatis.common.SqlSessionFactoryUtil;
import com.jerome.mybatis.user.dao.UserMapper;
import com.jerome.mybatis.user.entity.User;
import com.sun.xml.internal.org.jvnet.fastinfoset.VocabularyApplicationData;

import sun.util.logging.resources.logging;

public class Test {
	private static Logger log=Logger.getLogger(Test.class);
	private SqlSession sqlSession;
	private UserMapper userMapper;
	
	@Before
	public void  intitObject() {
				sqlSession=SqlSessionFactoryUtil.getSqlSession();
				userMapper=sqlSession.getMapper(UserMapper.class);
	}
/*@org.junit.Test
	public void add() {
		SqlSession session=	SqlSessionFactoryUtil.getSqlSession();
				UserMapper userMapper=session.getMapper(UserMapper.class);
					User user =new User();
						user.setName("ccccccc");
						user.setPwd("12dsadasdwwdsd");
						user.setAge(32);
					int result=userMapper.add(user);
							session.commit();
							System.out.println(result);
							SqlSessionFactoryUtil.sessionClose(session);
	}*/

/*@org.junit.Test
public void delet() {
		SqlSession session=	SqlSessionFactoryUtil.getSqlSession();
		UserMapper userMapper=session.getMapper(UserMapper.class);
		int result=userMapper.delet(1);
		session.commit();
		System.out.println(result);
		SqlSessionFactoryUtil.sessionClose(session);
}*/
/*@org.junit.Test
public void findByid() {
				SqlSession session=	SqlSessionFactoryUtil.getSqlSession();
				UserMapper userMapper=session.getMapper(UserMapper.class);
				User user=userMapper.findByid(2);
				session.commit();
				System.out.println(user);
				SqlSessionFactoryUtil.sessionClose(session);
	
	}*/
	/*@org.junit.Test
	public void update() {
			log.info("shushushsu");
			User user =new User();
				user.setId(2);
				user.setName("siyu");
				user.setPwd("123456");
				user.setAge(12131);
			int result=userMapper.update(user);
					System.out.println(result);
	}*/
	@org.junit.Test
	public void update() {
			log.info("shushushsuddddddd");
			List list=userMapper.query();
					System.out.println(list);
	}
	
	
	@After
	public void close() {
			sqlSession.commit();
			SqlSessionFactoryUtil.sessionClose(sqlSession);
	}
}
