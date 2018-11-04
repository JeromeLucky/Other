package com.wlx.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wlx.dao.UserDao;
import com.wlx.entity.User;

public class MainTesting 
{
	
	public static void main(String[] args)
    {
        BeanFactory bf = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao = (UserDao)bf.getBean("userDao");
        List<User> userList = userDao.selectUser();
        for(User user:userList)
        {
            System.out.println(user);
        }
    }
	
	

}
