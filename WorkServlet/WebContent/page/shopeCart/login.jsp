
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
		String path=request.getContextPath();
		String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<base href="<%=basePath %>"  target="main_frame">
<html>
<head>

	
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%-- <f:setLocale value="${pageContext.request.locale}"/> --%>



<f:setLocale value="${ empty type?'en_US':type}"/>
<f:setBundle basename="message"/>

<title><f:message key="title"/></title>
	
</head>
<body>
			<fieldset>
					<legend> <f:message>login.title</f:message></legend> ${ login_error }
					<form action="<s:url value='/do/login?method=login'/> "  method="post"><!-- 为了使登陆页面的路径目前为虚拟一直 -->
							<p>
									<f:message>login.user</f:message>：<input type="text" name="account" />
							</p>
							<P>
									<f:message>login.password</f:message><input type="password" name="password"/>
							</P>
							<p>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset"  value="<f:message  key='login.reset'/>" />
								&nbsp;&nbsp;<input type="submit" value="<f:message  key='login.submit'/>"/>&nbsp;&nbsp;&nbsp; <a href="/WorkServlet/page/shopeCart/region.jsp">注册新用户</a>
							
							</p>
					</form>
						<form  action="<s:url value='/do/login?method=change'/> "  id="change" method="post" >
									<select name="language" onchange="submit() "><option value="null">language</option> <option value="en_US">English</option><option value="zh_CN">Chinese</option></select>
						<form>
					
		</fieldset>
		</script>
</body>
</html>