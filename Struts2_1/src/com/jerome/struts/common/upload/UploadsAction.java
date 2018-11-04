package com.jerome.struts.common.upload;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadsAction  extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private File[] photo;
	private String [] photoContentType;
	private String[]  photoFileName;

		public File[] getPhoto() {
		return photo;
	}

	public void setPhoto(File[] photo) {
		this.photo = photo;
	}

	public String[] getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String[] photoContentType) {
		this.photoContentType = photoContentType;
	}

	public String[] getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String[] photoFileName) {
		this.photoFileName = photoFileName;
	}

		public String uploads() {
				//��ȡĿ���ļ��� ͨ�� ServletContext �����
			ServletContext sc=ServletActionContext.getServletContext();
			
			String path=sc.getRealPath("/uploadFile");
			for(int i=0;i<photo.length;i++) {
			File file=new File(path,photoFileName[i]);	
			//struts �ṩ�� �ļ����ƹ���
			try {
				FileUtils.copyFile(photo[i],file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			photo[i].delete();
			}
			
			return "success";
		}
}
