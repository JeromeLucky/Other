package com.jerome.mybatis.manager.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;


import com.jerome.mybatis.common.SqlSessionFactoryUtil;
import com.jerome.mybatis.manager.dao.IManagerDao;
import com.jerome.mybatis.manager.entity.Manager;


public class Test {
	private static Logger log=Logger.getLogger(Test.class);
	private  SqlSession session=null;
	private IManagerDao iManagerDao=null;
	
	@Before
	public void initObject() {
			session=SqlSessionFactoryUtil.getSqlSession();
			iManagerDao=session.getMapper(IManagerDao.class);
	}
	/*@org.junit.Test
	public void test() {
			Map map= new HashMap();
					map.put("name", "%abc%");
					map.put("age","12");
					
			List< Manager> mList=	iManagerDao.queryByConditions(map);
			System.out.println(mList);
		
	}*/
	
	/*@org.junit.Test
	public void testage() {
		Map map= new HashMap();
		List ageList=new ArrayList<>();
				ageList.add(12);
				ageList.add(13);
			map.put("agelist", ageList);
			List< Manager> mList=	iManagerDao.queryByAge(map);
			System.out.println(mList);
	}*/
	@org.junit.Test
	public void testUpdate() {
				Manager manager =new Manager();
							manager.setId(1);
								manager.setName("siyu");
		int n=	iManagerDao.update(manager);
		System.out.println(n+"-----------------");
		
		
	}
	@After
	public void close() {
			session.commit();
			SqlSessionFactoryUtil.sessionClose(session);
	}

}
