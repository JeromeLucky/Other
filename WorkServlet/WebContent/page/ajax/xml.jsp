<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>xml</title>
<script type="text/javascript">
	

	var httprequest;

	function createXMLHttpRequest() {

		if (window.XMLHttpRequest) {
			httprequest = new XMLHttpRequest();
		} else {
			try {
				httprequest = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
				httprequest = new ActiveXObject(" Msxml2.XMLHTTP ");
			}
		}
	}

	//获取服务端的JSON字符串
	function postxml() {
		createXMLHttpRequest();
		var name = document.getElementById("username").value;
		httprequest.open("POST", "<c:url value='/XmlServlet'/>", true);
		//设置请求头信息，类似于form表单提交
		httprequest.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");
		//发送请求
		httprequest.send("username=" + name);
		//使用回调函数处理服务端的业务关系
		httprequest.onreadystatechange = reqjson;
	}

	function reqjson() {
		if (httprequest.readyState == 4) {
			if (httprequest.status == 200) {
				var xml = httprequest.responseXML;
				var val = xml.getElementsByTagName("welcome-file")[0];
				
			
				//非IE可以使用textContent获取文本节点
				document.getElementById("dv").innerHTML = val.textContent;
			
				//IE可以使用text获取文本节点
				document.getElementById("dv").innerHTML = val.text;
					
			
			}

		}
	}
</script>
<style type="text/css">

	div
	{
		border: 1px solid black;
		width: 200px;
		height: 200px;
	}

</style>
</head>
<body>
	username:<input type="text" value=""  id="username" name="username" onblur="postxml()"><br>
	userpwd:<input type="text" value=""  ><br>
	<div id="dv"></div>
</body>
</html>