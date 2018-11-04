package homework.xml.nodedao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import homework.common.dbutil.DButil;
import homework.xml.nodedao.ComDaoImpl;
import homework.xml.pojo.HtmlPnode;



public class HPDaoImpl extends ComDaoImpl<HtmlPnode> {
	@Override
	public ArrayList<HtmlPnode> queryAll(Connection conn) {
				ArrayList< HtmlPnode> hpList=new ArrayList<>();
				PreparedStatement ps=null;
				ResultSet  rs=null;
				try{
				ps=conn.prepareStatement("select * from  htmlElementp ");
		
				HtmlPnode hPnode=new HtmlPnode();
				while(rs.next()){
					hPnode.setId(rs.getInt("id"));
					hPnode.setName(rs.getString("elpname"));
				
					hPnode.setPaname(rs.getString("paraname"));
				
					hPnode.setPavalue(rs.getString("pavalue"));
				
						
					hpList.add(hPnode);
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
				return hpList;
	}

			
}
