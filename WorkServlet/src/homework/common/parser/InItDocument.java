package homework.common.parser;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import homework.xml.nodedao.DaoFactory;
import homework.xml.pojo.HtmlCnode;
import homework.xml.pojo.HtmlPnode;
import homework.xml.pojo.XMLCnode;
import homework.xml.pojo.XMlPnode;


public class InItDocument {
		 public static Document DocInit(String type,Document doc,Connection conn,String name){
				Document document=null;
			
			if("xml".equals(type)){	
					//设置XML的版本
					doc.setXmlVersion("1.0");	
					//创建XML根元素
					Element root=doc.createElement("web-app");
						doc.appendChild(root);
					Element  xMlname = doc.createElement("display-name");
						Text  tname=doc.createTextNode(name);
						xMlname.appendChild(tname);
						root.appendChild(xMlname);
					//添加节点
					ArrayList<XMlPnode> plist=DaoFactory.getDao("xp").queryAll(conn);
					
					for(XMlPnode p : plist){
					
							Element p1=doc.createElement(p.getName());
							ArrayList<XMLCnode> clist=DaoFactory.getDao("xc").queryAll(conn, p.getId());
						System.out.println(p.getId()+"-----------"+clist.size());
									
							for(XMLCnode c:clist){
									Element c1=doc.createElement(c.getName());
										
											c1.appendChild(doc.createTextNode(c.getText()));
									p1.appendChild(c1);
							
							}
							root.appendChild(p1);
						}
	
					document=doc;
//-----------------------------html--------------------------------------------
				}else if("html".equals(type)){
					
//					//设置XML的版本
//					doc.setXmlVersion("1.0");	
				
					Element style=doc.createElement("!DOCTYPE html");
					doc.appendChild(style);
					//创建XML根元素
					Element root=doc.createElement("html");
						doc.appendChild(root);

					//添加节点
					ArrayList<HtmlPnode> hplist=DaoFactory.getDao("hp").queryAll(conn);
					
					for(HtmlPnode p : hplist){
					
							Element p1=doc.createElement(p.getName());
									p1.setAttribute(p.getPaname(), p.getPavalue());
							ArrayList<HtmlCnode> hclist=DaoFactory.getDao("hc").queryAll(conn, p.getId());
						System.out.println(p.getId()+"-----------"+hclist.size());
									
							for(HtmlCnode c:hclist){
									Element c1=doc.createElement(c.getName());
											c1.setAttribute(c.getPaname(), c.getPavalue());
									p1.appendChild(c1);
							
							}
							root.appendChild(p1);
						}

					document=doc;
				}
			return document;
		}
}
