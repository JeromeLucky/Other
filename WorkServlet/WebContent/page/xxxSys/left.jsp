<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>left</title>
<link href="css/reset.css" rel="stylesheet"/>
<style>
		ul li{
				width:100%;
				height:40px;
				text-align:center;
				font-size:30px;
				margin-top:20px;
				
		}
</style>
</head>
<body>
	<div>
		<ul>
			<li><a href="<%=request.getContextPath()%>/page/xxxSys/add.jsp" target="right">添加功能</a>
			<li><a href="<%=request.getContextPath()%>/page/xxxSys/select.jsp" target="right">查询功能</a>
			<li><a href="<%=request.getContextPath()%>/page/xxxSys/update.jsp" target="right">修改功能</a>
			<li><a href="<%=request.getContextPath()%>/page/xxxSys/update.jsp" target="right">删除功能</a>
			<li><a href="<%=request.getContextPath()%>/page/xxxSys/exit.jsp" target="right">退出系统</a>
		</ul>
	</div>
</body>
</html>