package homework.servlet1.model.dao.impl;



import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import homework.common.dbutil.DButil;
import homework.servlet1.model.pojo.Manager;
import homework.servlet1.model.pojo.StuUsers;

public class ManagerDaoImpl extends CommonImpl<Manager> {

	private PreparedStatement pstm=null;
	private ResultSet rs=null;
	private ArrayList<Manager> mList=null;

	
	@Override
	public void delete(Connection conn, String userId, String pwd) {
	// TODO Auto-generated method stub
			super.delete(conn, userId, pwd);
	}

		@Override
		public ArrayList query(Connection conn) {
			// TODO Auto-generated method stub
			String sql="select * from manager";
			Manager manager=null;
			try{
					pstm=conn.prepareStatement(sql);
					
				rs=pstm.executeQuery();
				while(rs.next()){
					manager=new Manager();
					manager.setUserId(rs.getString("userId"));
					manager.setPassword(rs.getString("password"));
					mList.add(manager);
					}
			}catch (Exception e) {
			e.printStackTrace();
			}finally{
					DButil.DBclose(null, pstm, rs);
			}
			return mList;
		}
			@Override
			public void add(Connection conn,Manager user) {
					String sql="insert into manager (userId,password,username) value(?,?,?)";
					try{
							pstm=conn.prepareStatement(sql);
							
							pstm.setString(1, user.getUserId());
							pstm.setString(2, user.getPassword());
							pstm.setString(3, user.getUserName());
					if(pstm.executeUpdate()>0){
						System.out.println("Ìí¼Ó³É¹¦");
					}
					}catch (Exception e) {
							e.printStackTrace();
					}finally {
						DButil.DBclose(null, pstm, null);
					}
		
			}
			@Override
			public Manager find(Connection conn, String userId, String pwd) {
						String sql="select * from manager where userId =? and password=?";
						Manager manager=null;
						try{
								pstm=conn.prepareStatement(sql);
									pstm.setString(1, userId);
									pstm.setString(2, pwd);
							rs=pstm.executeQuery();
							while(rs.next()){
								manager=new Manager();
								manager.setUserId(rs.getString("userId"));
								manager.setPassword(rs.getString("password"));
								}
						}catch (Exception e) {
						e.printStackTrace();
						}finally{
								DButil.DBclose(null, pstm, rs);
						}
						return manager;
			}
			
		
}
