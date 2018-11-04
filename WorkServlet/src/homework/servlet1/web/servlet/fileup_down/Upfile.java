package homework.servlet1.web.servlet.fileup_down;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet(
				initParams={@WebInitParam(name="savefile",value="savefile"),
									@WebInitParam(name="temp",value="temp"),
								},
					urlPatterns={ "/do/fileup"}		
			)
public class Upfile  extends HttpServlet{
	
	
		private String savefile;
		private String temp;
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
							
			
								DiskFileItemFactory factory=new DiskFileItemFactory();
								factory.setSizeThreshold(40*1024*1024);
								factory.setRepository(new File(temp));
								
								//上传处理器   根据硬盘工厂
								ServletFileUpload fileUpload=new ServletFileUpload(factory);
								
								fileUpload.setFileSizeMax(40*1024*1024);
								try {
									List items=fileUpload.parseRequest(req);
									Iterator  iterator=items.iterator();
									while(iterator.hasNext()){
										FileItem item=	(FileItem) iterator.next();
										if(item.isFormField()){
												ptFormFile(item, resp);
										}else{
												uploadFormFile(item, resp);
										}
									}	
								} catch (FileUploadException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
		}	
		@Override
		public void init(ServletConfig config) throws ServletException {
						super.init(config);
						savefile=config.getInitParameter("savefile");
						temp=config.getInitParameter("temp");
						savefile=getServletContext().getRealPath(savefile);
						temp=getServletContext().getRealPath(temp);
						
		}
		
		private void ptFormFile(FileItem item, HttpServletResponse resp){
					String  name=item.getFieldName();
					try {
						resp.getWriter().println(name+"已处理");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
		}
		private void uploadFormFile(FileItem item,HttpServletResponse resp){
						String filename=item.getName();
						System.out.println(filename+"--------d------");
						int index=filename.lastIndexOf("\\");
						filename=filename.substring(index+1,filename.length());
						System.out.println(filename);
						long filesize=item.getSize();
						if(filesize==0&&filename.equals("")){
							
						}else{
									File uploadFile=new File(savefile+"/"+filename);
								
								
									try {
										//写入到服务端硬盘中
										item.write(uploadFile);
									
										resp.getWriter().println("upload success!");
										
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									
						}
		}
}
