package homework.servlet1.web.servlet.cartServlet.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public  final class DButil {
		public static Connection getConnection(){
				Connection conn=null;
				try{
							Context context =new InitialContext();
								DataSource  dataSource =(DataSource)context.lookup("java:comp/env/jdbc/textDB");
								conn=dataSource.getConnection();
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
