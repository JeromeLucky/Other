package homework.servlet1.web.servlet.cartServlet;


import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import homework.servlet1.model.pojo.Customer;
import homework.servlet1.web.servlet.cartServlet.dao.CustomerDao;
import homework.servlet1.web.servlet.cartServlet.util.DButil;
@WebServlet("/do/login")
public class LoginServlet  extends  HttpServlet{
	private static CustomerDao cusdao=new CustomerDao();
	private static HttpSession session=null;
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
					Customer  customer=new Customer(); //应该为数据库获取的对象
					String  account =req.getParameter("account");
					String password=req.getParameter("password");
					String name=req.getParameter("name");
				

								customer.setAccount(account);
								customer.setPassword(password);
								customer.setName(name);
					String method=req.getParameter("method");
								session=req.getSession();
					
					if("change".equals(method)){
									session.setAttribute("type", req.getParameter("language"));
									resp.sendRedirect( req.getContextPath()+"/page/shopeCart/login.jsp");
					}
						if("login".equals(method)){
								login(req,resp,customer);
								
					}
						if("region".equals(method)){
							region(req,resp,customer);
					}
							if("verif".equals(method)){
							verif(req,resp,account);		
					}
			}
		
		private void verif(HttpServletRequest req, HttpServletResponse resp, String   account) throws IOException {
			// TODO Auto-generated method stub
			Connection conn=DButil.getConnection();
				System.out.println(cusdao.query(conn, account).isEmpty()+"--------------------");
						if(cusdao.query(conn, account).isEmpty()){
									resp.getWriter().write("ok");
						}else{
									resp.getWriter().write("no");
						}
						DButil.DBclose(conn, null, null);
						
		}
		private void region(HttpServletRequest req, HttpServletResponse resp, Customer  customer) throws IOException {
			// TODO Auto-generated method stub
						Connection conn=DButil.getConnection();
						cusdao.addCus(conn, customer);
						session.setAttribute("user",customer);
						resp.sendRedirect( req.getContextPath()+"/page/shopeCart/index.jsp");
						DButil.DBclose(conn, null, null);
		}
		private void login(HttpServletRequest req, HttpServletResponse resp, Customer  customer) throws IOException, ServletException {
			Connection conn=DButil.getConnection();
			System.out.println(customer.getAccount()+"-----------------"+customer.getPassword());
			Customer customer1=cusdao.getCustomer(conn, customer.getAccount(), customer.getPassword());
			System.out.println(customer1+"-----------------");
			if(null!=customer1){
						session.setAttribute("user",customer1);
						req.getRequestDispatcher("/page/shopeCart/index.jsp").forward(req, resp);
					/*	resp.sendRedirect( req.getContextPath()+"/page/shopeCart/index.jsp");*/
			}else{
						session.setAttribute("login_error","用户或密码错误");
						resp.sendRedirect( req.getContextPath()+"/page/shopeCart/login.jsp");
			}
						DButil.DBclose(conn, null, null);
	
		}
}
