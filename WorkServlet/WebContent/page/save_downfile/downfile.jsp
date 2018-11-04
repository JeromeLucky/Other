<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="${pageContext.servletContext.contextPath }/${pageContext.request.serverName}"    target="">
</head>

<body>
	<%
		session.setAttribute("filename", "JDBC数据库的连接.docx");
	%>
	<form action="do/downfile" method="get" >
		下载：JDBC数据库的连接.doc
		<br/>
		<input type="submit" value="下载">${errorResult }
	</form>
	<br/>
	下载：<a href="do/downfile?filename=JDBC数据库的连接.docx">JDBC数据库的连接.doc</a>${errorResult }
</body>
</html>