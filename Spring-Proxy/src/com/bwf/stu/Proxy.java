package com.bwf.stu;
/**
 * 
 * <�൱���н�>
 *  
 * @author  wlx
 * @see  [�����/����]
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
     * �н�ʵ���ⷿ
     * ��д����
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
     * <���ͻ������ķ���>
     * <������ϸ����>
     * @see [�ࡢ��#��������#��Ա]
     */
    private void seeHouse()
    {
        System.out.println("���ͻ�����");
    }
    
    /**
     * 
     * <��ȡ�н��>
     * <������ϸ����>
     * @see [�ࡢ��#��������#��Ա]
     */
    private void money()
    {
      System.out.println("��ȡ�н��");  
    }
    
    
}
