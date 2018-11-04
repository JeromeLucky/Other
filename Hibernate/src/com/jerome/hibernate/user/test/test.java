package com.jerome.hibernate.user.test;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;

import com.jerome.hibernate.common.HibernateUtil;
import com.jerome.hibernate.user.entity.User;

public class test {
			/*		@Test
				public void add() {
					Session session=	HibernateUtil.getSession();
									Transaction tx=session.beginTransaction();
							User user=new User(1,"mm",17);
									session.save(user);
									tx.commit();
									session.close();
											
											
				}*/
					@Test
				public void get() {
						Session session=null;
						try {
								session=HibernateUtil.getSession();
								String hql="from User  where name=?";
							Query  query=session.createQuery(hql);
						
									query.setString(0, "admin");
										List<User> list=query.list();
										for(User u:list) {
											System.out.println(u);
										}
						}finally {
									if(session!=null) {
										session.close();
									}
						}
				}
					@Test
				public void insert() {
					
				}
					@Test
				public void delet() {
					
				}
}
