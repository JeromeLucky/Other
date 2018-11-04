package homework.servlet1.web.servlet.cartServlet;

import java.io.IOException;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import homework.servlet1.model.pojo.Goods;
import homework.servlet1.web.servlet.cartServlet.util.DButil;
@WebServlet("/do/cart")
public class CarServlet  extends  HttpServlet{
	
	Connection conn=DButil.getConnection();
	private  Goods goods=null;  //要添加的货物
	private  Cart cart=null;			//购物车
	private  String itemid=null;//购物项 sessionid
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
				HttpSession session=req.getSession();
			
				
				String id=req.getParameter("id");
				String op=req.getParameter("op");
				//Goods goods=goodsDao.getByid(conn, id);//要加入购物的货物  避免多次访问数据库  用 回话中存储的 gods货物数据
				
					ArrayList<Goods> gods=(ArrayList<Goods>) session.getAttribute("gods");
							System.out.println("----长度----"+gods.size());
					for(Goods good: gods  ){
								if(good.getId().equals(id)){
										goods=good;
								}
					}
					System.out.println("----要添加的对象----"+goods);
				//创建cart对象  存入session 并  对数据进行初始化
						if(session.getAttribute("cart")==null){
										 cart=new Cart();
										session.setAttribute("cart", cart);
						}else{
										cart=(Cart) session.getAttribute("cart");
						}
							
				//cookie 验证  获取购物车   itemid
					
					Cookie[]	cookies=req.getCookies();
							for(int i=0;i<cookies.length;i++){
									if(cookies[i].getName().equals("itemid")){
												itemid=cookies[i].getValue();
												break;
									}else{
											itemid=session.getId();
											Cookie cookie=new Cookie("itemid", itemid);
													cookie.setMaxAge(3600*3600*24);
													resp.addCookie(cookie);
													System.out.println("----新建Cookie----");
													
										}
									
							}
							System.out.println("------------------------itemid----------------"+itemid);
						
							
								String url=req.getHeader("referer");			
								
							if("add".equals(op)){
							
										cart.add(goods, itemid);
								
									resp.sendRedirect( req.getContextPath()+"/page/shopeCart/index.jsp");
							}
							if("delet".equals(op)){
										cart.deleItem(id);
										req.getRequestDispatcher("/page/shopCart/index.jsp").forward(req, resp);
							}
								
		}
}
