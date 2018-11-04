package homework.servlet1.web.servlet.cartServlet;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;


import homework.servlet1.model.pojo.Goods;
import homework.servlet1.model.pojo.Item;
import homework.servlet1.web.servlet.cartServlet.dao.GoodsDao;
import homework.servlet1.web.servlet.cartServlet.dao.ItemDao;
import homework.servlet1.web.servlet.cartServlet.util.DButil;


public class Cart {
			
			private static  HashMap<String , Item> shopCart =new  HashMap<>(); //һ�������� ���ﳵ�ڶ�Ӧһ��������
			private static ItemDao itemDao=new ItemDao();
			private static GoodsDao goodDao=new GoodsDao();
			
			
			public  void  add(Goods goods,String sessionid){
						if(shopCart.get(goods.getId())!=null){
									//�ı乺���������
									chanMumber(goods.getId(),1.0);
						}else{
							Item item=new Item();
									item.setGoodsId(goods.getId());
									item.setGoodsName(goods.getName());
									item.setNumber(1.0);
									item.setId(sessionid);
							shopCart.put(goods.getId(), item);
							Connection conn=DButil.getConnection();	
									itemDao.addCart(conn, item);
									DButil.DBclose(conn, null, null);
						}
			}
			//�ı乺���������
			public  static void chanMumber(String id, double number) {
								Item item=shopCart.get(id);
								Double num=item.getNumber()+number;
								
								Connection conn=DButil.getConnection();	
								if(num==0.0){
											itemDao.delete(conn, id);
											shopCart.remove(id);			
								}else{
											itemDao.update(conn, id,num);
											item.setNumber(num);		
											//������ӵ����ﳵ
											shopCart.replace(id, item);
										}	
									DButil.DBclose(conn, null, null);
						
								
			}
			//ɾ��ĳ��������
				public  void deleItem(String id){
								shopCart.remove(id);
								Connection connection =DButil.getConnection();
								itemDao.delete(connection, id);
								DButil.DBclose(connection, null, null);
				}
			//��ȡȫ�����������Ǯ��
			public  float getMoney(){
				Connection conn=DButil.getConnection();	
				float total=0;
				for(Item item:getItems()){
							total+=(item.getNumber())*(goodDao.getByid(conn, item.getGoodsId()).getPrice());
				}
				return total;
			}
			//��ȡȫ��������
			public  Collection<Item> getItems(){
						return shopCart.values();
			}
}
