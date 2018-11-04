<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<head>新增货物</head>
<form action="${pageContext.servletContext.contextPath }/do/goods"  method="post">
		<label>货物名称</label><input type="text" name="godsname"/><br/>
		<label>货物单价</label><input type="text" name="godsprice"/><br/>
		<label>产品介绍</label><input type="text" name="godsintroduce"/><br/>
		<input type="submit" value="提交"><input type="reset" value="取消">
		<a href="${pageContext.servletContext.contextPath}/page/shopeCart/index.jsp">返回首页</a>
		</form>
</div>
</body>
</html>