package com.bwf.stu;
/**
 * 
 * <����>
 *  
 * @author  wlx
 * @see  [�����/����]
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

