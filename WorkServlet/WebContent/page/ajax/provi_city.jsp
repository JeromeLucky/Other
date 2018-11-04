<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>province  city</title>
<script type="text/javascript">
	
	
	
	function createXMLHttpRequest() {
		
		if (window.XMLHttpRequest) {
			return new XMLHttpRequest();
		}
		else
			{
				try {
					return new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
					return new ActiveXObject(" Msxml2.XMLHTTP ");
				}
			}
	}
	
	window.onload = function()
			{
				var xmlhttp = createXMLHttpRequest();
						xmlhttp.open("GET","<c:url value='/do/province?method=province'/>",true);
						xmlhttp.send(null);
						xmlhttp.onreadystatechange = function() 
					     	{
							if(xmlhttp.readyState == 4 && xmlhttp.status == 200)
							{
					 	//获取服务器响应的数据
				     	var  text = xmlhttp.responseText;
						//使用逗号分隔后缓存到数组中
						var  arry = text.split(",");
					//遍历每个省份的名称,并将其放在一个option元素中,然后添加到select元素中
						for(var i = 0; i < arry.length;i++)
							{	
							//创建option元素
						var opt = document.createElement("option");
							//设置option元素的属性值
						opt.value = arry[i];
							//创建文本节点
						var textNode = document.createTextNode(arry[i]);
						opt.appendChild(textNode);
							
						document.getElementById("p").appendChild(opt);
							
						}	
				}
		}
		
		var provi = document.getElementById("p");
		//当省份发生改变时触发该函数
		provi.onchange = function() 
		{
			var xmlhttp = createXMLHttpRequest();
			xmlhttp.open("POST","<c:url value='/do/province'/>",true);
			xmlhttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
			xmlhttp.send("method=city&province="+provi.value);
			xmlhttp.onreadystatechange = function()
					{
				if(xmlhttp.readyState == 4 && xmlhttp.status == 200)
				{
					
					var  text = xmlhttp.responseText;
					var city = document.getElementById("c");
								city.innerHTML="	<option>--请选择市--</option>";
							
					//使用逗号分隔后缓存到数组中
					var  arry = text.split(",");
					//遍历每个省份的名称,并将其放在一个option元素中,然后添加到select元素中
					for(var i = 0; i < arry.length;i++)
						{	
							//创建option元素
							var opt = document.createElement("option");
							//设置option元素的属性值
							opt.value = arry[i];
							//创建文本节点
							var textNode = document.createTextNode(arry[i]);
							opt.appendChild(textNode);
							
							city.appendChild(opt);
					
										}
				
								}
						}
				}
		
	}
	

</script>
</head>
<body>
	
	<h1>省市级联</h1>
	省:	<select  name="province" id="p">
			<option>--请选择省份--</option>
		</select>
	市:	<select  name="city" id="c">
			<option>--请选择市--</option>
		</select>
	
</body>
</html>