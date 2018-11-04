<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style type="text/css">
	
	table,td
	{
		border: 1px solid black;
	}
	
	#tj
	{
		text-align: center;
	}

	#tb
	{
		position: absolute;
		top: 10px;
		left: 500px;
	}

</style>
</head>
<body>
	<%=request.getContextPath() %><br>
	<form action="<%=request.getContextPath() %>/page/xxxSys/main.jsp" method="post">
		<table id="tb">
			<caption>登录界面</caption>
			<tr>
				<td>用户名:</td>
				<td>
					<input type="text" value="" name="username" placeholder="请输入用户名">
				</td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;&nbsp;码:</td>
				<td>
					<input type="password" value="" name="userpwd" placeholder="请输入密码">
				</td>
			</tr>
			<tr id="tj">
				<td colspan="2">
					<input type="submit" value="登录">&nbsp;&nbsp;&nbsp;
					<input type="reset" value="重置">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>