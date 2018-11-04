<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
	height:500px;
	position:absolute;
	top:100px;
	left:0;
	background-color:blue;
}
div.right{
	width:20%;
	height:500px;
	position:absolute;
	top:100px;
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
		<div class="head"></div>
		<div class="left"></div>
		<div class="right"></div>
		
		<div class="page">
					<ul class="pagestyle">
							<li><a href=“userlist.jsp?start=0”>1</a></li>
							<li><a href=“userlist.jsp?start=10”>2</a></li>
							<li><a href=“userlist.jsp?start=15”>3</a></li>
							<li><a href=“userlist.jsp?start=20”>4</a></li>
			</ul>
			</div>
		</div>
</body>
</html>