package homework.common.parser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Paser {
	
		public static DocumentBuilder getdomParser(){
				//获取DOM/SAX/DOM4j解析器对象
				DocumentBuilderFactory   factory = DocumentBuilderFactory.newInstance();
				
				//指定由此工厂对象创建解析器在XML文档时,必须删除元素内容中的空格
				factory.setIgnoringElementContentWhitespace(true);
					
				//获取DOM解析器
				DocumentBuilder  builder=null;
				try {
					builder  = factory.newDocumentBuilder();
					
				} catch (ParserConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return builder;
			
			}
}
