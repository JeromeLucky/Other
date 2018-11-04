package com.bwf.stu;
/**
 * 
 * <相当于中介>
 *  
 * @author  wlx
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Proxy implements Rent
{
    private Host host;
    
    public Proxy()
    {
        super();
    }

    public Proxy(Host host)
    {
        super();
        this.host = host;
    }


    /**
     * 中介实现租房
     * 重写方法
     * @see com.wlx.staticproxy.Rent#rent()
     */
    @Override
    public void rent()
    {
       seeHouse();
       host.rent();
       money();
    }
    
    /**
     * 
     * <带客户看房的方法>
     * <功能详细描述>
     * @see [类、类#方法、类#成员]
     */
    private void seeHouse()
    {
        System.out.println("带客户看房");
    }
    
    /**
     * 
     * <收取中介费>
     * <功能详细描述>
     * @see [类、类#方法、类#成员]
     */
    private void money()
    {
      System.out.println("收取中介费");  
    }
    
    
}
