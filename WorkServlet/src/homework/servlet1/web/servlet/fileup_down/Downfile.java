package homework.servlet1.web.servlet.fileup_down;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/do/downfile")
public class Downfile extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//获取文件下载路径
				String path = getServletContext().getRealPath("/")+"Book/";
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html;utf-8");
				String filename=(String) request.getSession().getAttribute("filename");
				//String filename = request.getParameter("filename");
				System.out.println(filename);
				File file = new File(path + filename);
				if(file.exists()){
					//设置相应类型application/octet-stream
					response.setContentType("application/x-msdownload");
					//设置头信息
					response.setHeader("Content-Disposition", "attachment;filename=\"" + filename + "\"");
					InputStream inputStream = new FileInputStream(file);
					ServletOutputStream ouputStream = response.getOutputStream();
					byte b[] = new byte[1024];
					int n ;
					while((n = inputStream.read(b)) != -1){
						ouputStream.write(b,0,n);
					}
					//关闭流、释放资源
					ouputStream.close();
					inputStream.close();
					
					
				}else{
					request.setAttribute("errorResult", "文件不存在下载失败！");
					RequestDispatcher dispatcher = request.getRequestDispatcher("/down.jsp");
					dispatcher.forward(request, response);
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
