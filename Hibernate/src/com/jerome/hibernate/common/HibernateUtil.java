package com.jerome.hibernate.common;


import static org.hamcrest.CoreMatchers.nullValue;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public final class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;

	static {
		// 创建Configuration对象，读取hibernate.cfg.xml文件，完成初始化
		Configuration config = new Configuration().configure();
		sessionFactory=config.buildSessionFactory();
	}
	
	//获取SessionFactory
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	//获取Session
	public static Session getSession(){
		session=sessionFactory.openSession();
		return session;
	}
	
	//关闭Session
	public static void closeSession(Session session){
		if(session!=null){
			session.close();
		}
	}
	public  static void  save(Object object) {
				Session s=null;
				Transaction tx=null;
				try {
						s=HibernateUtil.getSession();
						tx=s.beginTransaction();
						s.save(object);
						tx.commit();
				}finally {
					if(s!=null)
							s.close();
				}
	}
	public  static void  update(Object object) {
		Session s=null;
		Transaction tx=null;
		try {
				s=HibernateUtil.getSession();
				tx=s.beginTransaction();
				s.update(object);
				tx.commit();
		}finally {
			if(s!=null)
					s.close();
		}
	}
	public  static void  delete(Object object) {
		Session s=null;
		Transaction tx=null;
		try {
				s=HibernateUtil.getSession();
				tx=s.beginTransaction();
				s.delete(object);
				tx.commit();
		}finally {
			if(s!=null)
					s.close();
		}
	}
	
	public  static Object  selectByid(Class clazz,Serializable id) {
		Session s=null;
		try {
				s=HibernateUtil.getSession();
				Object object=s.get(clazz, id);
				return object;
		}finally {
			if(s!=null)
					s.close();
		}
	}
}
