<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="/struts-tags" %>
   <%
   			String path=request.getContextPath();
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>converter</title>
</head>
<body>
	<form action="<%=path %>/manager/manager_add.action" method="post" >
			编号：<input name="id" type="text"/></br>
			账户：<input name="account" type="text"/></br>
			密码：<input name="password" type="password"/></br>
			用户名：<input name="userName" type="text"/></br>
			创建时间：<input name="createTime" type="text"/></br>
			<input type="submit" value="提交"/></br>
	</form>
</body>
</html>