package homework.servlet1.web.servlet.ajax;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;

import org.dom4j.io.SAXReader;

@WebServlet("/do/province")
public class ProvServlet	extends HttpServlet  {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
						//ï¿½ï¿½ï¿½ï¿½ provice xml
					req.setCharacterEncoding("UTF-8");
					String method=req.getParameter("method");				
					resp.setContentType("text/html; charset=UTF-8");
						if("province".equals(method)){
								getProvince(req,resp);	
						}
						if("city".equals(method)){
								getCity(req,resp);
					 }
			
		}

	private void getCity(HttpServletRequest req, HttpServletResponse resp) {
		try {
			//Ê¹ÓÃDOM4j½âÎöÆ÷½âÎöchina.xml
			SAXReader    reader  = new SAXReader();
			InputStream  input =  this.getClass().getResourceAsStream("../china.xml");
			Document  doc = reader.read(input);
			
			String pname = req.getParameter("province");
			Element ele = (Element)doc.selectSingleNode("//province[@name='"+pname+"']");
			
			System.out.println("==========="+pname+"---------------------"+ele);
			//½«ÔªËØ×ª³É×Ö·û´®
			
			List<Element> cList=ele.selectNodes("city");
			
			StringBuilder sBuilder=new StringBuilder();
					for(int i=0;i<cList.size();i++){
								sBuilder.append(cList.get(i).getText());
								if(i<cList.size()-1){
										sBuilder.append(",");
								}
					}
			
				resp.getWriter().write(sBuilder.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
									
	}
	private void getProvince(HttpServletRequest req,HttpServletResponse resp) {
		try{
					SAXReader reader=new SAXReader();	
					InputStream inputStream=this.getClass().getResourceAsStream("../china.xml");
					Document document=reader.read(inputStream);
					//ï¿½ï¿½È¡ï¿½ï¿½ï¿½Ð½Úµï¿½
					List<Attribute> alist=document.selectNodes("//province/@name");
							System.out.println(alist.size());
						StringBuilder sb=new StringBuilder();
							for(int i=0;i<alist.size();i++){
										sb.append(alist.get(i).getValue());
										if(i<alist.size()-1){
											sb.append(",");
										}
							}
							
							resp.setContentType("text/html; charset=UTF-8");
							resp.getWriter().write(sb.toString());
						//ï¿½ï¿½ï¿½ï¿½Ôªï¿½Øµï¿½
				}catch (Exception e) {
							e.printStackTrace()	;
				}
	}
}
