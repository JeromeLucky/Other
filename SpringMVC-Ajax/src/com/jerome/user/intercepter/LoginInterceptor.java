package com.jerome.user.intercepter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor
{
    
    /**
     * ��Controller����֮��,����Controller����֮ǰ��ִ��
     * �������true,���������ִ��,�������false�򲻼�������ִ��,����ִ��
     * Controller�еĴ�����
     * ��д����
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
     * ��Controller����֮��,����Controller����֮��ִ��
     * ��д����
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
     * ��Controller������ִ��֮��,����Ⱦ֮ǰִ��
     * ��д����
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