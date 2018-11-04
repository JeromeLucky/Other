package com.bwf.stu;
/**
 * 
 * <房东>
 *  
 * @author  wlx
 * @see  [相关类/方法]
 * @since V1.00
 */
public class Host implements Rent
{
    @Override
    public void rent()
    {
        System.out.println("房屋出租");
    }
}
