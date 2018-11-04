package com.bwf.stu;
/**
 * 
 * <房客>
 *  
 * @author  wlx
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Roomer
{
    public static void main(String[] args)
    {
        Host host = new Host();
        Proxy  proxy = new Proxy(host);
        proxy.rent();
    }
}

