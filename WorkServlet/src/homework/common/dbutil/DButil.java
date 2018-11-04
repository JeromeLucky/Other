package homework.common.dbutil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


import com.mysql.jdbc.Util;
	

	public class DButil {
				private static String user=null;
				private static String password=null;
				private static String driver=null;
				private static String url=null;
				private static InputStream inputStream=null;
				
			static {
				Properties properties=new Properties();
					inputStream=Util.class.getClassLoader().getResourceAsStream("./homework/common/dbutil/DButil.properties");
				try {
					properties.load(inputStream);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
					user=properties.getProperty("user");
					password=properties.getProperty("pwd");
					url=properties.getProperty("url");
					driver=properties.getProperty("driver");
			}
			
			public static Connection getConnection(){
				Connection conn=null;
				try{
				Class.forName(driver);
					conn= DriverManager.getConnection(url, user, password);
				}catch(Exception e){
						e.printStackTrace();
				}
				return conn;
			}
			
			public static void  DBclose(Connection conn,Statement statement,ResultSet rs){
					
						try {
							if(rs!=null){
								rs.close();
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}finally{
							try {
								if(statement!=null){
									statement.close();
								}
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}finally{
								try {
									if(conn!=null){
										conn.close();
								
									}
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
		
				}
		}	

