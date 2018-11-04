package homework.servlet1.web.servlet.ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XmlServlet
 */
@WebServlet("/XmlServlet")
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public XmlServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		System.out.println("username---"+username);
		String xml = "<?xml version=\"1.0\" encoding=\"GBK\"?>\r\n" + 
				"<web-app>\r\n" + 
				"    <welcome-file-list>\r\n" + 
				"        <welcome-file id=\"w001\">index.jsp</welcome-file>\r\n" + 
				"    </welcome-file-list>\r\n" + 
				"</web-app>";
		response.getWriter().println(xml);
	
	}

}
