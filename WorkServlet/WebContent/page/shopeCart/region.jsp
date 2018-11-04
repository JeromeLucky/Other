<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base target="main_frame"> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/XMLHttpRequest.js"></script>
<script type="text/javascript" src="js/jquery-3.2.0.js" ></script>
<script type="text/javascript">

		var httprequest;
			function verif(){
				var account =	document.getElementById("account").value;
					createXMLHttpRequest();
				
					httprequest.open("POST","<c:url value='/do/login'/>",true);
					httprequest.setRequestHeader("Content-Type",
					"application/x-www-form-urlencoded");
					//发送请求
					httprequest.send("method=verif&account=" + account);
					httprequest.onreadystatechange=action;
					
					
				}
				function action(){
							if(httprequest.readyState==4){
									if (httprequest.status == 200) {
														var info=httprequest.responseText;
																if("ok"==info){
																		document.getElementById("info").innerHTML="ok";
																		document.getElementById("info").className="two";
																}else if("no"==info){
																		document.getElementById("info").innerHTML="no";
															
																		document.getElementById("info").className="three";
															}
												}
									}			
							}
				/* 	function back(){
							document.location.href="<c:url value='/page/shopeCart/login.jsp' />  target='main_frame' ";
							document.location.href.submit();
						} */
	
</script>
<style>
					div.wrap{
							width:500px;
							height:200px;
							margin:200px auto;
							position:relative;	
					}
				
					div.one{
							position: absolute;
							left:255px;
							top:53px;
							width:50px;
							height:19px;
							opacity:0;
					}
					div.two{
							position: absolute;
							left:255px;
							top:53px;
							width:50px;
							height:19px;	
							opacity:1;
							background-color:green;
					}
					div.three{
							position: absolute;
							left:255px;
							top:53px;
							width:50px;
							height:19px;
							opacity:1;
							background-color:red;
					
					}
</style>

</head>
<body>
			<div class="wrqp">
					<fieldset>
					<legend> 用户登录</legend>
					<form action="<c:url value='/do/login?method=region'/>"    method="post" ><!-- 为了使登陆页面的路径目前为虚拟一直 -->
							<p>
									账    户：<input type="text" name="account"  id="account"  onblur="verif()" /><div id="info" class="one"></div>
							</p>
							<P>
									密　码：<input type="password" name="password"/>
							</P>
							<P>
									名　称：<input type="text" name="name"/>
							</P>
							<p>
								<input type="reset"  value="取消" />
								<input type="submit" value="提交"/>
								<input type="button"   onclick="document.location.href='login.jsp'" value="返回"/>
							</p>
				</div>		
</body>
</html>