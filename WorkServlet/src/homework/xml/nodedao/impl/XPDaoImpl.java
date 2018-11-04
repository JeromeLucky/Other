package homework.xml.nodedao.impl;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import homework.common.dbutil.DButil;
import homework.xml.nodedao.ComDaoImpl;
import homework.xml.pojo.XMlPnode;



public class XPDaoImpl extends ComDaoImpl<XMlPnode> {
	@Override
	public ArrayList<XMlPnode> queryAll(Connection conn) {
				ArrayList< XMlPnode> xpList=new ArrayList<>();
				PreparedStatement ps=null;
				ResultSet  rs=null;
				try{
				ps=conn.prepareStatement("select * from  element ");
		
				XMlPnode xPnode=new XMlPnode();
				while(rs.next()){
					xPnode.setId(rs.getInt("id"));
					xPnode.setName(rs.getString("name"));
				
						
					xpList.add(xPnode);
				}
				}catch(Exception e){
					try {
						conn.rollback();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					e.printStackTrace();
				}finally{
						DButil.DBclose(null, ps, rs);
				}
				return xpList;
	}

			
}
