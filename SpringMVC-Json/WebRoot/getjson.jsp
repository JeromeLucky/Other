<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax请求SpringMVC--Controller</title>
<script type="text/javascript" src="./jquery/jquery-1.11.3.js"></script>
<script type="text/javascript">
	$(
		function()
		{
			$("#bt").click(
				function() 
				{
					$.post("json.do",function(data){
						var html="";
						for(var i = 0;i < data.length;i++)
							{
								html+="<tr><td>"+data[i].id+"</td><td>"+data[i].name+"</td><td>"+data[i].age+"</td></tr>"
							}
						$("#tbo").html(html);
					});
				}		
			);	
		}		
	);
</script>
<style type="text/css">
	table,td,th
	{
		border: 1px black solid; 
	}
</style>
</head>
<body>
	<input type="button" value="getjson" id="bt">
	<table  width="60%" align="center">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>年龄</th>
		</tr>
		<tbody id="tbo"></tbody>
	</table>
</body>
</html>