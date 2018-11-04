package homework.servlet1.model.dao;
import java.io.FileWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;

public class LogSerialize {
		public static void  logOut(String user,String pwd,String path) throws Exception{
				DocumentBuilderFactory   factory = DocumentBuilderFactory.newInstance();
				factory.setIgnoringElementContentWhitespace(true);
				DocumentBuilder  builder  = factory.newDocumentBuilder();
				Document  doc = builder.newDocument();
				doc.setXmlVersion("1.0");
				Element  root = doc.createElement("web-app");
	
				Element  userFile = doc.createElement("user");
				Element  userId = doc.createElement("userId");
				Text  tid =   doc.createTextNode(user);
						userId.appendChild(tid);
				Element  userPwd = doc.createElement("userPwd");
					 Text  tpwd =   doc.createTextNode(user);
								userPwd.appendChild(tpwd);
								
				userFile.appendChild(userId);
				userFile.appendChild(userPwd);
				root.appendChild(userFile);
		
				//ΪXML�ĵ�׷�Ӹ�Ԫ��
				doc.appendChild(root);
				
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
