package homework.servlet1.web.servlet.divpages;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import homework.servlet1.model.pojo.Goods;
import homework.servlet1.web.servlet.cartServlet.dao.GoodsDao;
import homework.servlet1.web.servlet.cartServlet.util.DButil;
@WebServlet("/do/pageServlet")
public class PageServlet extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

				//通过参数的传递控制起始记录    用于点击a标签时  从数据库查询那几条记录 并传递给页面
				int start=Integer.parseInt(req.getParameter("start"));

				//编写数据库连接查询代码  String sql=" SELECT * FROM userbase LIMIT "+start+",5";
							Connection conn=DButil.getConnection();
							GoodsDao goodDao=new GoodsDao();
							HttpSession session=req.getSession();
							ArrayList<Goods>godsList=	goodDao.querybypage(conn, start);
							session.setAttribute("godslist", godsList);
								
							DButil.DBclose(conn, null, null);
							String url=	req.getHeader("referer");
							//重定向回去
							resp.sendRedirect(url);
							
		}
}
