package homework.servlet1.web.filter;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.sun.javafx.collections.MappingChange.Map;

import homework.servlet1.model.pojo.Goods;
import homework.servlet1.web.servlet.cartServlet.dao.GoodsDao;
import homework.servlet1.web.servlet.cartServlet.util.DButil;
import homework.servlet1.web.servlet.divpages.PageVO;

@WebFilter("/page/shopeCart/index.jsp")
public class GodsListInitFilter  implements Filter{
	private GoodsDao goodsDao=new GoodsDao();
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		
			HttpServletRequest request=(HttpServletRequest) req;
			HttpSession session=request.getSession();
			
				Connection connection=DButil.getConnection();
				ArrayList<Goods> gods=goodsDao.query(connection);
				session.setAttribute("gods", gods); //记录所有货物数据  在购物车 操作时使用  根据id 获取货物对象
				
				int count =gods.size();
				System.out.println(count+"===================");
				PageVO pageVO=new PageVO(count, req.getServletContext().getContextPath()+"/do/pageServlet", 5, 0);
				
				session.setAttribute("pageVO", pageVO);
			if(session.getAttribute("godslist")==null){
									ArrayList<Goods> godslist=goodsDao.querybypage(connection, 0);
									System.out.println("========"+godslist.size()+"===========");
									session.setAttribute("godslist", godslist);
				
			}		
			chain.doFilter(req, resp);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
