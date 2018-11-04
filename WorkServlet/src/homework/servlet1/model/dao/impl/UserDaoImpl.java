package homework.servlet1.model.dao.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import homework.common.dbutil.DButil;
import homework.servlet1.model.pojo.Manager;
import homework.servlet1.model.pojo.StuUsers;
import homework.servlet1.model.pojo.Users;

public class UserDaoImpl extends CommonImpl<Users> {

	private PreparedStatement pstm=null;
	private ResultSet rs=null;
	private ArrayList<Users> uList=null;

	

		@Override
		public ArrayList query(Connection conn) {
			// TODO Auto-generated method stub
			String sql="select * from users";
			Users users=null;
			try{
					pstm=conn.prepareStatement(sql);
					
				rs=pstm.executeQuery();
				while(rs.next()){
					 users=new Users();
					users.setStuId(rs.getInt("userId"));
					users.setStuName(rs.getString("stuname"));
					users.setInfoId(rs.getString("infoId"));
					users.setMajor(rs.getString("major"));
					users.setSchool(rs.getString("school"));
					uList.add(users);
					}
			}catch (Exception e) {
			e.printStackTrace();
			}finally{
					DButil.DBclose(null, pstm, rs);
			}
			return uList;
		}
			@Override
			public void add(Connection conn,Users user) {
					String sql="insert into manager (userId,password,username) value(?,?,?,?,?)";
					try{
							pstm=conn.prepareStatement(sql);
							
					pstm.setInt(1,user.getStuId());
					pstm.setString(2,user.getStuName());
					pstm.setString(3,user.getInfoId());
					pstm.setString(4,user.getMajor());
					pstm.setString(5, user.getSchool());
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
			public Users find(Connection conn, String userId, String pwd) {
						String sql="select * from manager where userId =? and password=?";
						Users users=null;
						try{
								pstm=conn.prepareStatement(sql);
									pstm.setString(1, userId);
									pstm.setString(2, pwd);
							rs=pstm.executeQuery();
							while(rs.next()){
							 users=new Users();
								users.setStuId(rs.getInt("userId"));
								users.setStuName(rs.getString("stuname"));
								users.setInfoId(rs.getString("infoId"));
								users.setMajor(rs.getString("major"));
								users.setSchool(rs.getString("school"));
								}
						}catch (Exception e) {
						e.printStackTrace();
						}finally{
								DButil.DBclose(null, pstm, rs);
						}
						return users;
			}
			
		
}
