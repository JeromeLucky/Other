package homework.servlet1.model.dao.impl;



import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import homework.common.dbutil.DButil;
import homework.servlet1.model.pojo.StuUsers;

public class StuUDaoImpl extends CommonImpl<StuUsers> {

	private PreparedStatement pstm=null;
	private ResultSet rs=null;
	private ArrayList<StuUsers> sList=null;

	
	@Override
	public void delete(Connection conn, String userId, String pwd) {
	// TODO Auto-generated method stub
			super.delete(conn, userId, pwd);
	}

		@Override
		public ArrayList query(Connection conn) {
			// TODO Auto-generated method stub
			String sql="select * from user ";
			StuUsers stuUsers=null;
			try{
					pstm=conn.prepareStatement(sql);
						
				rs=pstm.executeQuery();
				while(rs.next()){
						stuUsers=new StuUsers();
							stuUsers.setUserId(rs.getString("userId"));
							stuUsers.setPassword(rs.getString("password"));
							sList.add(stuUsers);
					}
			}catch (Exception e) {
			e.printStackTrace();
			}finally{
					DButil.DBclose(null, pstm, rs);
			}
			return sList;
		}
			@Override
			public void add(Connection conn,StuUsers user) {
					String sql="insert into user (userId,password,username) value(?,?,?)";
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
			public StuUsers find(Connection conn, String userId, String pwd) {
						String sql="select * from user where userId =? and password=?";
						StuUsers stuUsers=null;
						try{
								pstm=conn.prepareStatement(sql);
									pstm.setString(1, userId);
									pstm.setString(2, pwd);
							rs=pstm.executeQuery();
							while(rs.next()){
									stuUsers=new StuUsers();
										stuUsers.setUserId(rs.getString("userId"));
										stuUsers.setPassword(rs.getString("password"));
								}
						}catch (Exception e) {
						e.printStackTrace();
						}finally{
								DButil.DBclose(null, pstm, rs);
						}
						return stuUsers;
			}
			
		
}
