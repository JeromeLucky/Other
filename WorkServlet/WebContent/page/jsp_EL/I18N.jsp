<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="i" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<i:setLocale value="zh_CN"/>
	<i:setBundle  basename="message"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><i:message>login.title </i:message></title>
</head>
<body>

	
	
	<i:message key="login.password"/> <input type="password" />
	<i:message key="login.user"/> <input type="text" /><br/>
	<i:formatNumber  type="number">12345 </i:formatNumber><br/>
	<i:formatNumber  type="currency"  pattern="￥.0">12345 </i:formatNumber><br/>
	<i:formatNumber  type="percent" >12.345 </i:formatNumber><br/>
	
	<i:formatDate value="<%=new Date()%>" type="time"/></br>
	<i:formatDate value="<%=new Date()%>" type="date"/></br>
	<i:formatDate value="<%=new Date()%>" type="both"/></br>
	<i:formatDate value="<%=new Date()%>" type="both"  dateStyle="long" timeStyle="short"/></br>
	<i:formatDate value="<%=new Date()%>" type="both"   pattern="yyyy-MM-dd HH:mm:ss"/></br>
</body>
</html>