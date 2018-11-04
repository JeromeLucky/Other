package homework.xml.nodedao;

import java.sql.Connection;
import java.util.ArrayList;


public interface ICommonDao<T extends java.io.Serializable> {
		//获取全部节点
		  ArrayList<T> queryAll(Connection conn);
		 //根据id获取子节点
		  ArrayList<T> queryAll(Connection conn,Integer pid);
}
