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
				//��ȡ�ļ�����·��
				String path = getServletContext().getRealPath("/")+"Book/";
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html;utf-8");
				String filename=(String) request.getSession().getAttribute("filename");
				//String filename = request.getParameter("filename");
				System.out.println(filename);
				File file = new File(path + filename);
				if(file.exists()){
					//������Ӧ����application/octet-stream
					response.setContentType("application/x-msdownload");
					//����ͷ��Ϣ
					response.setHeader("Content-Disposition", "attachment;filename=\"" + filename + "\"");
					InputStream inputStream = new FileInputStream(file);
					ServletOutputStream ouputStream = response.getOutputStream();
					byte b[] = new byte[1024];
					int n ;
					while((n = inputStream.read(b)) != -1){
						ouputStream.write(b,0,n);
					}
					//�ر������ͷ���Դ
					ouputStream.close();
					inputStream.close();
					
					
				}else{
					request.setAttribute("errorResult", "�ļ�����������ʧ�ܣ�");
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
