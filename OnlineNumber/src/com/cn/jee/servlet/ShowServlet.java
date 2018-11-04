package com.cn.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
						//获取访问的数量
					HttpSession session=req.getSession();
					session.setMaxInactiveInterval(30);
					ServletContext  context =req.getServletContext(); 
							Integer number =(Integer) context.getAttribute("total");
							resp.setContentType("text/html;charset=utf-8");
							if(number!=null){
										resp.getWriter().write("<h3>当前用户数量"+number+"</h3>");
										
							}
						resp.getWriter().write("<a href='show'>刷新</a>");
		}
}
