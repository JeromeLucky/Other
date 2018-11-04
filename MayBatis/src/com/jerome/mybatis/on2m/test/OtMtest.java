package com.jerome.mybatis.on2m.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jerome.mybatis.common.SqlSessionFactoryUtil;
import com.jerome.mybatis.consignee.dao.IConsigneeDao;
import com.jerome.mybatis.consignee.entity.Consignee;
import com.jerome.mybatis.on2m.dao.IGradeDao;
import com.jerome.mybatis.on2m.entity.Grade;

public class OtMtest {
		private static SqlSession session=null;
		private static IGradeDao iGradeDao=null;
		@Before
			public void intObj() {
						session=SqlSessionFactoryUtil.getSqlSession();
						iGradeDao=session.getMapper(IGradeDao.class);
			}
	/*	@Test
			public void testOO() {
						Grade grade=iGradeDao.findById(2);
						System.out.println(grade);
			}*/
		
	/*	@Test
		public void testBypage1(){
				int start =0;
				int size=3;
				RowBounds rBounds=new RowBounds(start,size);
				List<Grade> gList=	iGradeDao.findByPage1(rBounds);
							for(Grade g:gList) {
									System.out.println(g);
							}
		}*/
		@Test
		public void testBypage2(){
				Map map=new HashMap<String , Object>();
							map.put("start",5);
							map.put("size", 4);
				List<Grade> gList=	iGradeDao.findByPage2(map);
							for(Grade g:gList) {
									System.out.println(g);
							}
		}
		
		@After
			public void close() {
						session.commit();
						SqlSessionFactoryUtil.sessionClose(session);
			}
}
