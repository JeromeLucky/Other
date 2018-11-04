package homework.servlet1.model.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;
import homework.servlet1.model.dao.ICommonDao;
import homework.servlet1.model.pojo.Info;
import homework.servlet1.model.service.ConditionVO;
public  abstract class CommonImpl<T extends java.io.Serializable> implements  ICommonDao<T>{

	@Override
	public ArrayList<T> finByConditionVO(Connection conn, T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T find(Connection conn,String userId, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList query(Connection conn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Connection conn,String userId, String pwd) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void add( Connection conn,T t) {
		// TODO Auto-generated method stub

	}


	
}
