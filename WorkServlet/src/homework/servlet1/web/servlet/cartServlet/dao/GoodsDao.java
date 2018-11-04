package homework.servlet1.web.servlet.cartServlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.sun.xml.internal.bind.v2.model.core.ID;

import homework.servlet1.model.pojo.Goods;
import homework.servlet1.model.pojo.Item;

public class GoodsDao {
	
	
	
	public  ArrayList<Goods> query( Connection conn){
		PreparedStatement pstm=null;
		ResultSet rs=null;
		Goods good=null;
		ArrayList<Goods> goodList=new ArrayList<>();
		String selectsql="select * from good ";
	
		try{
				pstm=conn.prepareStatement(selectsql);
				rs=pstm.executeQuery();
					while(rs.next()){
								good=new Goods();
								good.setId(rs.getInt("id")+"");
								good.setName(rs.getString("goodsname"));
								good.setIntroduce(rs.getString("introduce"));
								good.setPrice(rs.getFloat("price"));
								
								goodList.add(good);	
							
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
			return goodList;
}
	
	
	public  ArrayList<Goods> querybypage( Connection conn,Integer start){
		PreparedStatement pstm=null;
		ResultSet rs=null;
		Goods good=null;
		ArrayList<Goods> goodList=new ArrayList<>();
		String selectsql="select * from good  LIMIT "+start+",5";
	
		try{
				pstm=conn.prepareStatement(selectsql);
				rs=pstm.executeQuery();
					while(rs.next()){
								good=new Goods();
								good.setId(rs.getInt("id")+"");
								good.setName(rs.getString("goodsname"));
								good.setIntroduce(rs.getString("introduce"));
								good.setPrice(rs.getFloat("price"));
								
								goodList.add(good);	
							
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
			return goodList;
}
	
	
	public   Goods getByid( Connection conn,String id){
		int  godid=Integer.parseInt(id);
		PreparedStatement pstm=null;
		ResultSet rs=null;
		Goods good=null;
		
		String selectsql="select * from good  where id=?";
		
		try{
				pstm=conn.prepareStatement(selectsql);
				pstm.setInt(1, godid);
				rs=pstm.executeQuery();
					while(rs.next()){
								good=new Goods();
								good.setId(rs.getInt("id")+"");
								good.setName(rs.getString("goodsname"));
								good.setIntroduce(rs.getString("introduce"));
								good.setPrice(rs.getFloat("price"));			
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
			return good;
}
	
	public  void delect(Connection conn,Integer id){
				Statement stmt=null;
				String delsql="delete from good where  good=id";
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
	
	public void updatePrice(Connection conn,Integer id,Float number){
						PreparedStatement pstmt=null;
						String  upsql="update good set price=? where id=?";
						try{
						pstmt=conn.prepareStatement(upsql);
							pstmt.setDouble(1, number);
							pstmt.setInt(2, id);
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
	
	public void addGod(Connection conn,Goods goods){
		PreparedStatement pstm=null;
		int n=0;
		String addsql="insert into good (goodsname,price,introduce) value(?,?,?)";
		try{
			
				pstm=conn.prepareStatement(addsql);
				pstm.setString(1, goods.getName());
				pstm.setFloat(2, goods.getPrice());
				pstm.setString(3,goods.getIntroduce());
			
				
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
}
