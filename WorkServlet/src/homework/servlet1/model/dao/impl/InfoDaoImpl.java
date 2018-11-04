package homework.servlet1.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import homework.common.dbutil.DButil;
import homework.servlet1.model.pojo.Info;
import homework.servlet1.model.service.ConditionVO;

public class InfoDaoImpl  extends CommonImpl<ConditionVO>{

	
	
	
@Override
	public ArrayList finByConditionVO(Connection conn, ConditionVO  t) {
		// TODO Auto-generated method stub
				PreparedStatement pstm=null;
				ResultSet rSet=null;
				ArrayList<Info> inList=new ArrayList<>();
				String sql="select * from info where value like ?";
				try{
						pstm=conn.prepareStatement(sql);
							pstm.setString(1, "%"+t.getName()+"%");
							rSet=pstm.executeQuery();
									while(rSet.next()){
											Info info=	new Info();
												info.setId(rSet.getInt("id"));
												info.setValue(rSet.getString("value"));
										inList.add(info);
									}
				}catch (Exception e) {
					e.printStackTrace();
				}finally {
						DButil.DBclose(null, pstm, rSet);
				}
				return inList;
	}
		
}
