<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <% String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>upload   page</title>
</head>
<body>
		
		<form enctype="multipart/form-data" method="post" 
		action="<%=path %>/upload/Upload_upload.action">
		上传文件：<input type="file" name="photo"/><br/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>