package homework.servlet1.model.dao;

import java.sql.Connection;
import java.util.ArrayList;

import homework.servlet1.model.service.ConditionVO;

public interface ICommonDao<T extends java.io.Serializable> {
				T find(Connection conn, String userId,String pwd);
				ArrayList<T>  query(Connection conn);
				void  delete(Connection conn,String userId,String pwd );
				void add(Connection conn,T t);
				ArrayList<T> finByConditionVO(Connection conn,T t);
		
}
