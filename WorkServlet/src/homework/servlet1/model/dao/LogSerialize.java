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
		
				//为XML文档追加根元素
				doc.appendChild(root);
				
				//获取DOMImplementationRegistry对象
				DOMImplementationRegistry   registry = DOMImplementationRegistry.newInstance();
				//处理XML的格式
				//获取DOMImplementationLS
				DOMImplementationLS  ls = (DOMImplementationLS)registry.getDOMImplementation("LS");
				//获取
				LSSerializer   lss = ls.createLSSerializer();
				//设置使XML文档更美观
				lss.getDomConfig().setParameter("format-pretty-print", true);
				
				LSOutput  out = ls.createLSOutput();
				//指定输出文档的编码所用的字符集
				out.setEncoding("GBK");
				
				FileWriter   fw = new FileWriter(path);
				
				out.setCharacterStream(fw);
				
				//执行序列化(也就是将DOM数据转成XML文档)
				lss.write(doc, out);
			}
}
