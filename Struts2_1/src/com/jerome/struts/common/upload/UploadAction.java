package com.jerome.struts.common.upload;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction  extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private File photo;
	private String photoContentType;
	private String photoFileName;

		public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	
	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}
	
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

		public String upload() {
				//获取目标文件夹 通过 ServletContext 域对象
			ServletContext sc=ServletActionContext.getServletContext();
			
			String path=sc.getRealPath("/uploadFile");
			File file=new File(path,photoFileName);
			System.out.println(photo+"----------"+photoContentType+"--------------"+photoFileName);
			//struts 提供的 文件复制工具
			try {
				FileUtils.copyFile(photo,file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			photo.delete();
			
			
			return "success";
		}
}
