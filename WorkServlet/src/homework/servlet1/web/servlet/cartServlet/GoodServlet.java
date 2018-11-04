package homework.servlet1.web.servlet.cartServlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import homework.servlet1.model.pojo.Goods;
import homework.servlet1.web.servlet.cartServlet.dao.GoodsDao;

import homework.servlet1.web.servlet.cartServlet.util.DButil;
@WebServlet("/do/goods")
public class GoodServlet  extends  HttpServlet{
				GoodsDao godsDao=new GoodsDao();
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
						String godsname=req.getParameter("godsname");
						String godsprice=req.getParameter("godsprice");
						String godsintroduce=req.getParameter("godsintroduce");
						Goods goods=new Goods();
								goods.setIntroduce(godsintroduce);
								goods.setName(godsname);
								goods.setPrice(Float.parseFloat(godsprice));
								Connection conn=DButil.getConnection();
								godsDao.addGod(conn, goods);
								DButil.DBclose(conn, null, null);
						String url=req.getHeader("referer");
								resp.sendRedirect(url);
		}
}
