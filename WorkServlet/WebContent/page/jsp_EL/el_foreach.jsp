<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
		<%
					List list1=new ArrayList();
							list1.add("aa");
							list1.add("bb");
							list1.add("cc");
							list1.add("dd");
		
					List list2=new ArrayList();
							list2.add("index");
							list2.add("count");
							list2.add("first");
							list2.add("end");
					request.setAttribute("value", list1);
					request.setAttribute("title", list2);
						
		%>
		<table>
				<tr><th>current</th><th>index</th><th>count</th><th>first</th><th>last</th></tr>
				<c:forEach var="value" items="${value }" varStatus="status">
				<tr>
						<td>${status.current }</td><td>${status.index }</td><td>${status.count }</td><td>${status.first }</td><td>${status.last }</td>
				</tr>
				</c:forEach>
		
		
		
		</table>
</body>
</html>