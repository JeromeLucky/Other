package homework.xml.nodedao;

import java.sql.Connection;
import java.util.ArrayList;


public interface ICommonDao<T extends java.io.Serializable> {
		//��ȡȫ���ڵ�
		  ArrayList<T> queryAll(Connection conn);
		 //����id��ȡ�ӽڵ�
		  ArrayList<T> queryAll(Connection conn,Integer pid);
}
