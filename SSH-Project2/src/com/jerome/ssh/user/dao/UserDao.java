package com.jerome.ssh.user.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.jerome.ssh.user.entity.User;

public class UserDao {
	
	private  HibernateTemplate   hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

			public  void addUser() {
			/*	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
				hibernateTemplate= (HibernateTemplate) ac.getBean("hibernateTemplate");*/
					System.out.println("dao÷¥––°£°£°£°£");
					System.out.println(hibernateTemplate);
			
						User user=	hibernateTemplate.get(User.class, 1);
						hibernateTemplate.delete(user);
						System.out.println(user);
				}
			}

