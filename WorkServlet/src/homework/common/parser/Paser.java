package homework.common.parser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class Paser {
	
		public static DocumentBuilder getdomParser(){
				//��ȡDOM/SAX/DOM4j����������
				DocumentBuilderFactory   factory = DocumentBuilderFactory.newInstance();
				
				//ָ���ɴ˹������󴴽���������XML�ĵ�ʱ,����ɾ��Ԫ�������еĿո�
				factory.setIgnoringElementContentWhitespace(true);
					
				//��ȡDOM������
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
