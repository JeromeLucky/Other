package homework.servlet1.web.filter;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import homework.common.dbutil.DButil;
@WebFilter("/do/*")
public class ConnFilter  implements Filter{
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
				Connection conn=DButil.getConnection();
				req.setAttribute("Connection", conn);
					chain.doFilter(req, resp);
				DButil.DBclose(conn, null, null);
				System.out.println(conn);
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
