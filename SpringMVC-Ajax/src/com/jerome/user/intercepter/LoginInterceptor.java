package com.jerome.user.intercepter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor
{
    
    /**
     * 在Controller请求之后,处理Controller方法之前被执行
     * 如果返回true,则继续向下执行,如果返回false则不继续往下执行,即不执行
     * Controller中的处理方法
     * 重写方法
     * @param arg0
     * @param arg1
     * @param arg2
     * @return
     * @throws Exception
     * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
     */
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object hanader)
        throws Exception
    {
        String account =req.getParameter("account");
        String password =req.getParameter("password");
        if("admin".equals(account)&&"password".equals(password)) {
        	return true;
        	}
        	return false;
    }
 /**
     * 在Controller请求之后,处理Controller方法之后被执行
     * 重写方法
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @throws Exception
     * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
     */
    @Override
    public void afterCompletion(HttpServletRequest req, HttpServletResponse resp, Object hanadler, Exception arg3)
        throws Exception
    {
        System.out.println("controller----after---");
    }
    /**
     * 在Controller处理方法执行之后,在渲染之前执行
     * 重写方法
     * @param arg0
     * @param arg1
     * @param arg2
     * @param arg3
     * @throws Exception
     * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
     */
    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse resp, Object hangler, ModelAndView arg3)
        throws Exception
    {
        System.out.println("---post---");
    } 
    
    
}