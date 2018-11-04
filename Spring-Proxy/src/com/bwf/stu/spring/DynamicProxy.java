package com.bwf.stu.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * �ֶ����JDK�Ķ�̬����
 * @author usera
 *
 */
public class DynamicProxy implements InvocationHandler {

	//Ŀ�����--��ʵ����
    private Object target;
    

    public void setTarget(Object target)
    {
        this.target = target;
    }
    
    
    public  Object getProxy()
    {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    
    /**
     * 
     * ��д����
     * @param proxy ������
     * @param method ������ĵ��ô������ķ�������
     * @param args
     * @return
     * @throws Throwable
     * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        System.out.println("args=="+args[0]);
        System.out.println("������"+method.getName()+"����");
        Object result = method.invoke(target, args);
        return result;
    }
    
   

}
