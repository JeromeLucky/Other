<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="homework.servlet1.model.pojo.Item"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
					Context ctx=new InitialContext();
					//获取DataSource 对象
					DataSource  ds=(DataSource)ctx.lookup("java:comp/env/jdbc/textDB");
					Connection conn=ds.getConnection();
					
						String id =session.getId();
						Cookie[] cookies=request.getCookies();
						System.out.print(cookies.length);
						for(int i=0; i<cookies.length;i++){
									if(cookies[i].getName().equals("item")){
										
									id=cookies[i].getValue();
									break;
									}else{
										Cookie cookie=new Cookie("item",id);
												cookie.setMaxAge(3600*24);
											
												response.addCookie(cookie);
									}
							}		
						
						Item item=new Item();
							item.setId(id);
							item.setGoodsName(request.getParameter("godsname"));
							item.setGoodsId(request.getParameter("godsid"));
							item.setNumber(Double.parseDouble(request.getParameter("godsnumber")));
						
							int a=	addCart(conn, item);
						
							conn.close();
					
					
					
					
		%>
		<%!   
		ArrayList<Item > itemList=new ArrayList<>();
					Item item=null;
					public int  addCart(Connection conn,Item item){
								PreparedStatement pstm=null;
								int n=0;
								String addsql="insert into item (sessionid,goodsname,goodsid,number) value(?,?,?,?)";
								try{
										pstm=conn.prepareStatement(addsql);
										pstm.setString(1, item.getId());
										pstm.setString(2, item.getGoodsName());
										pstm.setString(3,item.getGoodsId());
										pstm.setDouble(4,item.getNumber());
										
										 n=pstm.executeUpdate();
										if(n>0){
													System.out.println("插入了"+n);
											}
										}catch(Exception e){
										e.printStackTrace();
									}finally{
											try{
											pstm.close();
											}catch(Exception e){
												e.printStackTrace();
											}
									}
						return n;
					}
		
		public  ArrayList<Item> query( Connection conn,String sessionid){
			PreparedStatement pstm=null;
			ResultSet rs=null;

			String addsql="select * from item where sessionid=?";
			try{
				
					pstm.setString(1, sessionid);
	
					rs=pstm.executeQuery();
						while(rs.next()){
									item=new Item();
									item.setGoodsId(rs.getString("goodsid"));
									item.setGoodsName(rs.getString("goodsname"));
									item.setId(rs.getString("sessionid"));
									item.setNumber(rs.getDouble("number"));
									
									itemList.add(item);	
						}
				
					}catch(Exception e){
					e.printStackTrace();
				}finally{
						try{
						pstm.close();
						}catch(Exception e){
							e.printStackTrace();
						}
				}
	return itemList;
}

	
		
		%>
</body>
</html>