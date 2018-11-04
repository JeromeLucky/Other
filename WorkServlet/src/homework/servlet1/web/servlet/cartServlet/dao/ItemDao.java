package homework.servlet1.web.servlet.cartServlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import homework.servlet1.model.pojo.Item;

public class ItemDao {
	
	public void addCart(Connection conn,Item item){
		PreparedStatement pstm=null;
		int n=0;
		String addsql="insert into item (sessionid,goodsname,goodsid,number) value(?,?,?,?)";
		try{
				pstm=conn.prepareStatement(addsql);
				pstm.setString(1, item.getId());
				pstm.setString(2, item.getGoodsName());
				pstm.setString(3,item.getGoodsId());
				pstm.setDouble(4,item.getNumber());
				
				 n=pstm.executeUpdate();
				if(n>0){
							System.out.println("≤Â»Î¡À"+n);
					}
				}catch(Exception e){
				e.printStackTrace();
			}finally{
					try{
					pstm.close();
					}catch(Exception e){
						e.printStackTrace();
					}
			}
}
	
	public  void delete(Connection conn,String  id){
				Statement stmt=null;
				String delsql="delete from  item where  goodsid=id";
				try{
				stmt=conn.createStatement();
						stmt.executeQuery(delsql);
				
				}catch (Exception e) {
					e.printStackTrace();
				}finally{
						try {
							stmt.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
	}
	
	public void update(Connection conn,String  id,Double number){
						PreparedStatement pstmt=null;
						String  upsql="update item set number=? where goodsid=?";
						try{
						pstmt=conn.prepareStatement(upsql);
							pstmt.setDouble(1, number);
							pstmt.setString(2, id);
						}catch (Exception e) {
								e.printStackTrace();
						}finally{
							try {
								pstmt.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
				}
	
	
						public  ArrayList<Item> query( Connection conn,String sessionid){
							PreparedStatement pstm=null;
							ResultSet rs=null;
							ArrayList<Item> itemList=new ArrayList<>();
							String addsql="select * from item where sessionid=?";
							
							try{
									pstm=conn.prepareStatement(addsql);
									pstm.setString(1, sessionid);
					
									rs=pstm.executeQuery();
										while(rs.next()){
													Item item = new Item();
													item.setGoodsId(rs.getString("goodsid"));
													item.setGoodsName(rs.getString("goodsname"));
													item.setId(rs.getString("sessionid"));
													item.setNumber(rs.getDouble("number"));
													
													itemList.add(item);	
										}
								
									}catch(Exception e){
									e.printStackTrace();
								}finally{
									try {
										rs.close();
									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
										try{
										pstm.close();
										}catch(Exception e){
											e.printStackTrace();
										}
								}
					return itemList;
				}

	
}
