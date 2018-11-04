package com.jerome.struts.common;

import java.lang.reflect.Member;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.naming.java.javaURLContextFactory;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;


public class DateConverter extends DefaultTypeConverter{
		@Override
		public Object convertValue(Object value, Class toType) {
				if(value==null) {
					return false;
				}
				if(toType==null) {
					return false;
				}
				if(toType!=java.util.Date.class) {
					return false;
				}
				if(value instanceof java.lang.String[]) {
							String[] str=(String[]) value;
									if(str[0]!=null&&str[0].length()>0) {
										try {
											SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
												return sdf.parse(str[0]);
										}catch (Exception e) {
											e.printStackTrace();
											throw new RuntimeException(e);
										}
							}
				}
			
			return new Date();
		}
}
