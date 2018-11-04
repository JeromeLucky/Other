<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <% String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>i18n login</title>
</head>
<body>
		<form action="<%=path%>/i18n/I18n_login.action" method="post">
			<table cellpadding="0">
				<caption><s:text name="item.title"></s:text></caption>
				<tr>
					<td><s:text name="item.account"/></td><td><input type="text" name="user.account"/></td>
		    	</tr>
				<tr>
					<td><s:text name="item.password"/></td><td><input type="text" name="user.password"/></td>
		    	</tr>
			<tfoot> <input type="submit" value="<s:text name='item.login'/> "/> </tfoot>
			</table>
			
		</form>

</body>
</html>