package homework.servlet1.web.servlet.xxsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;


import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

import homework.servlet1.model.dao.impl.StuUDaoImpl;
import homework.servlet1.model.pojo.StuUsers;

public class Ureg extends HttpServlet {
		@Override
	
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
							switch (req.getMethod()) {
							case "POST":
								doPost(req, resp);
							break;
							case "GET":
								doGet(req, resp);
							break;
							}
		}
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
						method(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
			method(req, resp);
		}
		
		private  void  method(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
						StuUDaoImpl impl =new StuUDaoImpl();
						Connection conn=(Connection)req.getAttribute("Connection");
						try{
						conn.setAutoCommit(false);
						String userId =req.getParameter("userId");
						String password =req.getParameter("password");
						String name =req.getParameter("name");
						StuUsers users=new StuUsers();
							
							users.setUserId(userId);
							users.setPassword(password);
							users.setUserName(name);
					impl.add(conn, users);				
						conn.commit();
						
					Enumeration<String >	 heads =req.getHeaderNames();
						while(heads.hasMoreElements()){
									System.out.println(heads.nextElement()+"-------------->"+req.getHeader(heads.nextElement()));
						}
							System.out.println(req.getRequestURL().toString());
							HttpSession session=req.getSession();
						}catch (Exception e) {
							try {
								conn.rollback();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						System.out.println(conn);
		}
}
