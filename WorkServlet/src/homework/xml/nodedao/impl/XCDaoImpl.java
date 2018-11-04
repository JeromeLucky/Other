package homework.xml.nodedao.impl;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import homework.common.dbutil.DButil;
import homework.xml.nodedao.ComDaoImpl;
import homework.xml.pojo.XMLCnode;


public class XCDaoImpl extends ComDaoImpl<XMLCnode> {
	@Override
	public ArrayList<XMLCnode> queryAll(Connection conn, Integer pid) {
				ArrayList< XMLCnode> xcList=new ArrayList<>();
				PreparedStatement ps=null;
				ResultSet  rs=null;
				try{
				ps=conn.prepareStatement("select * from  elementchild where  ecid=?");
				ps .setInt(1, pid);
				XMLCnode xCnode=new XMLCnode();
				while(rs.next()){
						xCnode.setName(rs.getString("name"));
						xCnode.setText(rs.getString("ectex"));
						xcList.add(xCnode);
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
				return xcList;
	}

			
}
