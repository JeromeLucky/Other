package homework.servlet1.web.servlet.jquery_easyUI;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.model.core.ID;

@WebServlet("/do/formUI")
public class Form_EasyUI  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			req.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
				String method=req.getParameter("method");
				String user=req.getParameter("user");
				System.out.println(user+"-------------------eayui-----------------------------"+method);
				if("submit".equals(method)){
					resp.getWriter().println("Œ“≤ª∫√");
				}
				
				if("verif".equals(method)){
					resp.getWriter().println("ok");
				}
				
			
	}
}
