package com.cn.jee.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
						//�ĵ��Ự����  �ѱ�������ݴ洢��servletContext��
						HttpSession  session= event.getSession();
						ServletContext context=session.getServletContext();
						//��������
							Integer  number=(Integer) context.getAttribute("total");
							if(number==null){
										context.setAttribute("total", 1);
							}else{
									context.setAttribute("total", number+1);
							}
				}
			
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
						//��ȡServletContext
						HttpSession  session= event.getSession();
						ServletContext context=session.getServletContext();
						Integer number =(Integer) context.getAttribute("total");
								context.setAttribute("total", number-1);
				}

}
