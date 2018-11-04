package homework.xml.nodedao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import homework.common.dbutil.DButil;
import homework.xml.nodedao.ComDaoImpl;
import homework.xml.pojo.HtmlPnode;


public class HCDaoImpl extends ComDaoImpl<HtmlPnode> {
	@Override
	public ArrayList<HtmlPnode> queryAll(Connection conn, Integer pid) {
				ArrayList< HtmlPnode> hcList=new ArrayList<>();
				PreparedStatement ps=null;
				ResultSet  rs=null;
				try{
		
				ps=conn.prepareStatement("select * from  htmlElementc where pid=?");
				ps .setInt(1, pid);
				HtmlPnode xCnode=new HtmlPnode();
				while(rs.next()){
						xCnode.setName(rs.getString("elcname"));
						xCnode.setPaname(rs.getString("paraname"));
						xCnode.setPaname(rs.getString("paravalue"));
			
						hcList.add(xCnode);
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
				return hcList;
	}

			
}
