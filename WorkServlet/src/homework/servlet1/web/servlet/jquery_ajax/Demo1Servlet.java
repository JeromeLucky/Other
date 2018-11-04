package homework.servlet1.web.servlet.jquery_ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loadServlet")
public class Demo1Servlet extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			System.out.println(req.getParameter("name")+"-----------------------"+req.getParameter("password"));
			resp.getWriter().println("NiºÃ");
		}
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
			
			
		};
}
