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
public class CharsetFilter  implements Filter{
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
					req.setCharacterEncoding("UTF-8");
//					resp.setContentType("text/html;charset=utf-8");
				
					chain.doFilter(req, resp);
			
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
