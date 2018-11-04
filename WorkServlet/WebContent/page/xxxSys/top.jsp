<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>top</title>
<link href="css/reset.css" rel="stylesheet"/>
<script type="text/javascript" src="js/jquery-3.2.0.js" ></script>
<style type="text/css">
	
	#uname
	{
		position: absolute;
		left:90%;
	
	}

</style>
<script>
	$(document).ready(function(){
			
			//top时间	
			time();
		 var t=window.setInterval(time,1000);	
			 
		function time(){
				var date=new Date();
				var hour=date.getHours();
				var minute=date.getMinutes();
				var seconds=date.getSeconds();

				var year=date.getFullYear();
				var mouth=date.getMonth()+1;
				var day=date.getDate();
				var week=date.getDay();
		
			switch(week){
				case 1:
				week="星期一";
				break;
				case 2:
				week="星期二";
				break;
				case 3:
				week="星期三";
				break;
				case 4:
				week="星期四";
				break;
				case 5:
				week="星期五";
				break;
				case 6:
				week="星期六";
				break;
				case 7:
				week="星期日";
				break;
				}
				if(hour<10){
					hour="0"+hour;
				}
				if(minute<10){
					minute="0"+minute;
				}
				if(seconds<10){
					seconds="0"+seconds;
				}
			
		$("span")[0].innerHTML=year+"年"+mouth+"月"+day+"日    "+week+" "+hour+":"+minute+":"+seconds;
				
				}

		});
</script>
</head>
<body>	
	<h1>Xxxxx系统</h1>
	<a id="uname">用户名:<%=session.getAttribute("username")%></a><span></span>
</body>
</html>