<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL_SQL</title>
</head>
<body>	
	<sql:setDataSource   dirver="com.mysql.jdbc.Driver"  url="jdbc:mysql://localhost:3306/shop?autoReconnection=true"
		user="root" password="123456" var="datasource" scope="session"
	
	/>
		
		
			
		
		
		
		%>
</body>
</html>