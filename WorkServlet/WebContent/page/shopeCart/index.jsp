<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
 <%@ taglib prefix="my" uri="http://www.bwf.jerome/mytaglib" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%
		String path=request.getContextPath();
		String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <base href="<%=basePath %>"  target="_parent" />
<title>div pages</title>
<style type="text/css">

div.wrap{
		position:relative;
		width:100%;
		heigth:700px;
}
div.head{
	width:100%;
	height:100px;
	position:relative;
	top:0;
	left:0;
	background-color:pink;
}
div.left{
	width:80%;
	height:600px;
	position:absolute;
	top:100px;
	left:0;
	background-color:blue;
}
div.right{
	width:20%;
	height:600px;
	position:absolute;
	top:120px;
	right:0;
	background-color:grey;
}
div.page{
		position:absolute;
		top:600px;
		left:0;
		width:100%;
		height:30px;
		background-color:yellow;
	}
.pagestyle{
			 list-style-type: none;
			 heigth:30px;
			 position:relative;
			 top:0px;
			
		 }
.pagestyle li{float: left;width: 20px;border: 1px #eee solid;text-align: center;  position:relative; top:-13px;}
.pagestyle li a{text-decoration: none;}
</style>

</head>
<body>
		<div class="wrap">
		<div class="head"><h2>Shope</h2></div>
		<div class="left">
		<%-- <iframe name="main_frame"   frameborder="0" scrolling="no" width="100%"  height="100%" src='<c:url  value="/page/shopeCart/godslist.jsp" />'   >
		
		</iframe> --%>
		<jsp:include page="/page/shopeCart/godslist.jsp"></jsp:include>
		
		</div>
		
		<div class="right">
			<head>管理栏</head>
				<ul>
					
					<li><a href="<c:url value='/page/shopeCart/login.jsp'/>  "   target="main_frame">登录</a></li>
					<c:if test="${user !=null}">
					<li>欢迎${user.name}</li>
					<li><ul>
							<li><head>购物车</head></li>	
									
							<c:forEach var="item" items="${cart.items }">
										
									<li>货物编号:${item.goodsId }</li>
									<li>货物名称:${item.goodsName }</li>
									<li>货物数量:${item.number }</li>
								<%-- 	<c:forEach var="good" items="${gods}">
												<c:if test="${good.id==item.id }">
															<li>单价为：${ good.price}</li>
												</c:if>
											</c:forEach> --%>
									</c:forEach>
								</ul>
							<li>
						</c:if>
				</ul>
		
		
		</div>
					
		
		</div>
</body>
</html>