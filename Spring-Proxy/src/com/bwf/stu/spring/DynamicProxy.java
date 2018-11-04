package com.bwf.stu.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 手动完成JDK的动态代理
 * @author usera
 *
 */
public class DynamicProxy implements InvocationHandler {

	//目标对象--真实对象
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
     * 重写方法
     * @param proxy 代理类
     * @param method 代理类的调用处理程序的方法对象
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
        System.out.println("调用了"+method.getName()+"方法");
        Object result = method.invoke(target, args);
        return result;
    }
    
   

}
