package homework.servlet1.web.servlet.cartServlet.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import homework.servlet1.model.pojo.Customer;
import homework.servlet1.web.servlet.cartServlet.util.DButil;
public class CustomerDao {
	
	public void addCus(Connection conn,Customer customer){
		PreparedStatement pstm=null;
		int n=0;
		String addsql="insert into customer (account,password,name) value(?,?,?)";
		try{
				pstm=conn.prepareStatement(addsql);
				pstm.setString(1, customer.getAccount());
				pstm.setString(2, customer.getPassword());
				pstm.setString(3, customer.getName());
				 n=pstm.executeUpdate();
				if(n>0){
							System.out.println("≤Â»Î¡À"+n);
					}
				}catch(Exception e){
				e.printStackTrace();
			}finally{		
							DButil.DBclose(null, pstm, null);
			}
}
	
	public  void delete(Connection conn,String  account ,String  password){
				Statement stmt=null;
				String delsql="delete from  customer where  account=id and password=password";
				try{
				stmt=conn.createStatement();
						stmt.executeQuery(delsql);
				
				}catch (Exception e) {
					e.printStackTrace();
				}finally{
					DButil.DBclose(null, stmt, null);
				}
		}
	
		public void update(Connection conn,String account,String  password){
						PreparedStatement pstmt=null;
						String  upsql="update customer  set password=? where account=?";
						try{
						pstmt=conn.prepareStatement(upsql);
							pstmt.setString(1, password);
							pstmt.setString(2, account);
						}catch (Exception e) {
								e.printStackTrace();
						}finally{
							DButil.DBclose(null, pstmt, null);
						}
				}
					
						public  ArrayList<Customer> query( Connection conn,String account){
							PreparedStatement pstm=null;
							ResultSet rs=null;
							ArrayList<Customer> cusList=new ArrayList<>();
							String addsql="select * from customer  where account=?";
							try{
								pstm=conn.prepareStatement(addsql);
									pstm.setString(1, account);
					
									rs=pstm.executeQuery();
										while(rs.next()){
													Customer cus = new Customer();
													cus.setId(rs.getInt("id"));
													cus.setAccount(rs.getString("account"));
													cus.setPassword(rs.getString("password"));			
													cus.setName(rs.getString("name"));
													cusList.add(cus);	
										}
								
									}catch(Exception e){
									e.printStackTrace();
								}finally{
										DButil.DBclose(null, pstm, rs);
								}
					return cusList;
				}

						public  Customer getCustomer( Connection conn,String account,String pwd){
							PreparedStatement pstm=null;
							ResultSet rs=null;
							Customer cus=null;
							String addsql="select * from customer  where account=? and password=?";
							try{
								pstm=conn.prepareStatement(addsql);
									pstm.setString(1, account);
									pstm.setString(2, pwd);
									rs=pstm.executeQuery();
										while(rs.next()){
													cus = new Customer();
													cus.setId(rs.getInt("id"));
													cus.setAccount(rs.getString("account"));
													cus.setPassword(rs.getString("password"));			
													cus.setName(rs.getString("name"));
										}
									}catch(Exception e){
									e.printStackTrace();
								}finally{
										DButil.DBclose(null, pstm, rs);
								}
					return cus;
				}
	
}
