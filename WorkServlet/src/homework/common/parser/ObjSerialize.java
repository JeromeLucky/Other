package homework.common.parser;

import java.io.FileWriter;

import org.w3c.dom.Document;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

public class ObjSerialize {
	 public static void out(Document doc,String path) throws Exception{
		//��ȡDOMImplementationRegistry����
		DOMImplementationRegistry   registry = DOMImplementationRegistry.newInstance();
		//����XML�ĸ�ʽ
		//��ȡDOMImplementationLS
		DOMImplementationLS  ls = (DOMImplementationLS)registry.getDOMImplementation("LS");
		//��ȡ
		LSSerializer   lss = ls.createLSSerializer();
		//����ʹXML�ĵ�������
		lss.getDomConfig().setParameter("format-pretty-print", true);
		
		LSOutput  out = ls.createLSOutput();
		//ָ������ĵ��ı������õ��ַ���
		out.setEncoding("GBK");
		
		FileWriter   fw = new FileWriter(path);
		
		out.setCharacterStream(fw);
		
		//ִ�����л�(Ҳ���ǽ�DOM����ת��XML�ĵ�)
		lss.write(doc, out);
		
	}
}
