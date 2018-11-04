<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../../js/jquery-3.2.0.js"></script>
<script>
			$(function(){
				
				$("input[type=text]").keyup(function(){ 
					$.ajax({
									type:"POST",
									url:"<c:url value='/do/select'/>",
									data:"name="+$("input[type=text]").val(),
							success:function(mess){
								if(mess!=""){
									$("div.value")[0].innerHTML="";
										var strarr=mess.split(","); 
												for(var  i=0;i<strarr.length;i++){	
															$("div.value").append($("<div onclick='change()'>"+strarr[i]+"</div>"));
												 		}
													}
												}
											});
							});
			
					
			});
			function change(){	
			
					$("input[type=text]")[0].value=this.innerText;
					$("div.value")[0].innerHTML="";
			}
			
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div  class="wrap">
				<input type="text"><button>查询</button>
				<div class="value"></div>
		</div>
</body>
</html>