package homework.servlet1.model.dao;
import java.util.WeakHashMap;

import homework.servlet1.model.dao.impl.InfoDaoImpl;
import homework.servlet1.model.dao.impl.ManagerDaoImpl;
import homework.servlet1.model.dao.impl.StuUDaoImpl;
import homework.servlet1.model.dao.impl.UserDaoImpl;

public final class DaoFactory {
			public final static WeakHashMap<String,ICommonDao> map=new WeakHashMap<>();
			public static ICommonDao getDao(String name){
				ICommonDao dao=map.get(name);
				if(dao!=null)
					return dao;
				return creatDao(name);
			}
			private static ICommonDao creatDao(String name) {
				ICommonDao dao=null;
				if("stuser".equals(name)){
					dao=new StuUDaoImpl();
					map.put(name, dao);
				}
						if("manager".equals(name)){
					dao=new ManagerDaoImpl();
				}
					if("users".equals(name)){
					dao=new UserDaoImpl();
					}
					if("info".equals(name)){
						dao=new InfoDaoImpl();
					}
					return dao;
			}
}