<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="../../js/jquery-3.2.0.js" type="text/javascript"></script>
<script type="text/javascript">
		$(function(){
					$("input[type=text]").change(	function(){
						$.ajax({
							type:"POST",
							url:"<c:url value='/loadServlet'/>",
							data:"name="+$("input[type=text]").val()+"&password="+$("input[type=password]").val(),
							success:function(mes){
								$("div")[0].innerHTML=mes;
								}
							});	
				});
						
	
				});
			
		


</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ajax jquery</title>
</head>
<body>
			<form>
					账户	<input type="text"  />
					密码<input type="password"/>
					<div></div>
			</form>
</body>
</html>