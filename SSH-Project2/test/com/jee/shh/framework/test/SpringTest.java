package com.jee.shh.framework.test;


import javax.sql.DataSource;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Controller;

import com.jerome.ssh.user.service.TestService;

@Scope("proptotype")
public class SpringTest {

	/*
	public static void main(String[] args) {
			ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
			ActionTest  textAction=(ActionTest) ac.getBean("actionTest");
			System.out.print(textAction);
	
	}
	  */
		
/*		@Test
		public void testSessionFactory(){
		SessionFactory sessionFactory=(SessionFactory) ac.getBean("sessionFactory");
							System.out.print(sessionFactory);
	}
		@Test
		public void testDateSource(){
		DataSource dataSource=(DataSource) ac.getBe
		an("dataSource");
							System.out.print(dataSource);
	}*/
		/*@Test
		public void testTransaction(){
				TestService testService=(TestService) ac.getBean("testService");
					testService.userAdd();
		}*/
}
