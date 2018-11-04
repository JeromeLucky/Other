<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
			.wrap{
								width:100%;
								height:100%;
								position:relative;
								
						}
			div.wrap ul{
							width:100%;
							heigth:100%;
							list-style-type: none;
					}
				div.wrap ul li {
						width:100px;
						heigth:30px;
						float: left;
						
					}
					.pagestyle{
					 list-style-type: none;
					 heigth:30px;
					 position:relative;
					 top:0px;
			
		 }
</style>
	
<body>
<div	class="wrape">
			<head>货物总览</head>
			
						<ul>	
						<c:forEach var="good" items="${godslist }">
							<li>
									货物编号: ${good.id}</br>
									货物名称:  ${good.name }
									货物单价: <fmt:formatNumber type="currency" pattern="￥.0"> ${good.price }</fmt:formatNumber> </br>
									<a href=" <c:url value='/do/cart?op=add&id=${good.id}'/>" >加入购物车</a>	
							</li>
		</c:forEach>
					
						</ul>
						<footer>	
										<div class="page">	
												<my:pagetag pageVO="${pageVO }"/>
										</div>
						</footer>
				</div>
				</div>
</body>
</html>