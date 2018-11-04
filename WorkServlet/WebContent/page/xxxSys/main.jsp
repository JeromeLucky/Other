<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Xxxx系统</title>
<style type="text/css">
	
	#top
	{
		position: absolute;
		border:1px solid black;
		width: 99%;
		height: 20%;
	}
	
	#left
	{
		position: absolute;
		border: 1px solid black;
		width: 19%;
		height: 80%;
		top:22%;
	}
	
	#right
	{
		position: absolute;
		border: 1px solid black;
		width: 80%;
		height: 80%;
		right: 0%;
		top: 22%;
	}
	

</style>
</head>
<body>
	<%
		String name = request.getParameter("username");
		session.setAttribute("username", name);
	%>
	<div id="dv">
		<div id="top">
			<iframe name="top" frameborder="0" scrolling="no" width="100%"  height="100%" src="<%=request.getContextPath()%>/page/xxxSys/top.jsp"></iframe>
		</div>
		<div id="left">
			<iframe name="left"  frameborder="0" width="100%"  height="100%" src="<%=request.getContextPath()%>/page/xxxSys/left.jsp"></iframe>
		</div>
		<div id="right">
			<iframe name="right"  frameborder="0" scrolling="no" width="100%"  height="100%" src="<%=request.getContextPath()%>/page/xxxSys/right.jsp"></iframe>
		</div>
	</div>
</body>
</html>