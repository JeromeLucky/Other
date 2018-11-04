package com.jerome.mybatis.consignee.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jerome.mybatis.common.SqlSessionFactoryUtil;
import com.jerome.mybatis.consignee.dao.IConsigneeDao;
import com.jerome.mybatis.consignee.entity.Consignee;

public class OtOtest {
		private static SqlSession session=null;
		private static IConsigneeDao iConsigneeDao=null;
		@Before
			public void intObj() {
						session=SqlSessionFactoryUtil.getSqlSession();
						iConsigneeDao=session.getMapper(IConsigneeDao.class);
			}
		@Test
			public void testOO() {
						Consignee consignee=iConsigneeDao.findById(1);
						System.out.println(consignee);
			}
		@After
			public void close() {
						session.commit();
						SqlSessionFactoryUtil.sessionClose(session);
			}
}
