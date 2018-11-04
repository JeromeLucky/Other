package homework.xml.nodedao;

import java.util.WeakHashMap;

import homework.xml.nodedao.impl.HCDaoImpl;
import homework.xml.nodedao.impl.HPDaoImpl;
import homework.xml.nodedao.impl.XCDaoImpl;
import homework.xml.nodedao.impl.XPDaoImpl;


public class DaoFactory {
	public DaoFactory(){};
	//´æ´¢daoImpleµÄMap¼¯ºÏ
	public final static WeakHashMap<String,ICommonDao> map=new WeakHashMap();
	
	public static ICommonDao getDao(String name){
			ICommonDao dao=map.get(name);
			if(dao!=null)
				return dao;
				return creatDao(name);
	}

	private static ICommonDao creatDao(String name) {
		ICommonDao dao=null;
		switch (name){
				case "xc": 
				dao=new XCDaoImpl();
				break;
				case "xp": 
				dao=new XPDaoImpl();
				break;
				case "hc": 
				dao=new HCDaoImpl();
				break;
				case "hp": 
				dao=new HPDaoImpl();
				break;
			}
		map.put(name, dao);
		return dao;
	}
	

}
