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
			
			private static  HashMap<String , Item> shopCart =new  HashMap<>(); //一个货物在 购物车内对应一个购物项
			private static ItemDao itemDao=new ItemDao();
			private static GoodsDao goodDao=new GoodsDao();
			
			
			public  void  add(Goods goods,String sessionid){
						if(shopCart.get(goods.getId())!=null){
									//改变购物项的数量
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
			//改变购物项的数量
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
											//从新添加到购物车
											shopCart.replace(id, item);
										}	
									DButil.DBclose(conn, null, null);
						
								
			}
			//删除某个购物项
				public  void deleItem(String id){
								shopCart.remove(id);
								Connection connection =DButil.getConnection();
								itemDao.delete(connection, id);
								DButil.DBclose(connection, null, null);
				}
			//获取全部货物项的总钱数
			public  float getMoney(){
				Connection conn=DButil.getConnection();	
				float total=0;
				for(Item item:getItems()){
							total+=(item.getNumber())*(goodDao.getByid(conn, item.getGoodsId()).getPrice());
				}
				return total;
			}
			//获取全部购物项
			public  Collection<Item> getItems(){
						return shopCart.values();
			}
}
