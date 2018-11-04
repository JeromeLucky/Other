package homework.servlet1.web.servlet.jquery_ajax;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import homework.common.dbutil.DButil;
import homework.servlet1.model.dao.DaoFactory;
import homework.servlet1.model.pojo.Info;
import homework.servlet1.model.service.ConditionVO;
@WebServlet("/do/select")
public class SelectDemo  extends HttpServlet{
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
					req.setCharacterEncoding("utf-8");
					resp.setContentType("text/html;charset=utf-8");
				String value=req.getParameter("name").trim();
				if(value.equals("")){
					resp.getWriter().println("");
				}else{
					StringBuilder sBuilder=new StringBuilder();
							ConditionVO cVo=new ConditionVO();
									cVo.setName(value);
							Connection connection=DButil.getConnection();
								ArrayList<Info> inList=DaoFactory.getDao("info").finByConditionVO(connection, cVo);
								System.out.println(inList.size());
										DButil.DBclose(connection, null, null);
							for(int i=0;i<inList.size();i++){
									sBuilder.append(inList.get(i));
									if(i<inList.size()-1){
										sBuilder.append(",");
									}
							}
							resp.getWriter().println(sBuilder.toString());
				}
			}
}
