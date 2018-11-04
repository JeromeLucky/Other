<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>注册界面</title>
		<link rel="stylesheet" href="css/reset.css" />	
		<style>
			.wrap{
				/*border:1px solid black;*/
				width:600px;
				margin: 0 auto;
				min-height: 390px;
				background-color:white ;
			}
			.wrap .title{
				height: 50px;
				border-bottom: 1px solid grey;
				
			}
			.wrap .title span{
				display: inline-block;
				margin-top: 10px;
				width:110px;
				height:35px;
				line-height: 35px;
				text-align: center;
				font-family: "微软雅黑";
				font-size: 22px;
				border-left: 3px solid deepskyblue;
			}
			.wrap form table {
				width:600px;
				/*border:1px dashed black;*/
				
			}
			.wrap form table tr {
					display: block;
					/*border:1px dashed black;*/
					margin:5px 0;
					height:40px;
					
				
			}
			
			
			.wrap form table tr td{
				display: inline-block;
				height: 30px;
				line-height: 30px;
				/*margin-top:5px;*/
			}
			.wrap form table tr td.one {
					
					/*border:1px dashed green;*/
					width: 110px;
					text-align: right;
					
				
			}
			.wrap form table tr td.two {
					
					/*border:1px dashed yellow;*/
					width: 350px;
								
			}
			.wrap form table tr td.three {
					/*border:1px dashed deeppink;*/
					width: 110px;
					text-align: left;
					font-size: 3px ;
				
			}
			.wrap form table tr td select{
				height:25px ;
			}
			.wrap form table tr td select.type{
				width:60px;
				
			}
			.wrap form table tr td select.year{
				width:110px;
			}
			.wrap form table tr td select.month{
				width:80px;
			}
			.wrap form table tr td select.date{
				width:80px;
			}
			.wrap form table tr td select.info{
				width:111px;
			}
			
			
			.wrap form table tr td input {
				
					height:25px;
					width:340px;
				
			}
			.wrap form table tr td input.sex {	
					height:15px;
					width:15px;	
					position: relative;
					top:2px;
			}
			.wrap form table tr td span {	
					display: inline-block;
					height:15px;
					width:40px;	
			}
			
			/*下半部分 文字部分*/
			.wrap form  ul{
				
				width:340px;
				height:70px;
			
				position:relative;
				left:110px;
				top:0px;
			}
			.wrap form ul li{
				width:340px;
				height: 40px;
				margin:15px 0px;
				font-family: arial;
				color: gray;
				font-size: 14px;
				line-height: 20px;
				
			}
			.wrap form ul li select{
					color: gray;
					border: 0;
					position: relative;
					top:-2px;
					left:0px;
			}
			.wrap form ul li span{
					position: relative;
					left:2px;
					top:-2px;
			}
		
			.wrap form ul li input.one{
				display: block;
				width:340px;
				height:50px;
				border-radius: 10px;
				font-size: 20px;
				font-weight: bold;
				color: white;
				background-color: green;
			}
		</style>
		
		<script type="text/javascript" src="js/jquery-3.2.0.js" ></script>
		<script type="text/javascript">
					
					var user=false;
					var pwd=false;
					var vPwd=false;
					var pwdF;
		$(document).ready(function(){
					
				var userT=$("td.two input")[0];
				var pwdT=$("td.two input")[1];
				var vPwdT=$("td.two input")[2];
				var tdArr=$("td.three:lt(3)");
			/* 	alert(tdArr.length); */
		/* 	alert($("td.two  input:lt(3)").length); */
			
			$("td.two  input:eq(0)").on({
				"change":function(){	
					var rex=/^\w{3}\d{7}$/;
					if(rex.test(this.value)){
						user=true;
						tdArr[0].innerHTML="ok";
						tdArr[0].style.color="green";
					
					}else{
						tdArr[0].innerText="格式不正确";
						tdArr[0].style.color="red";
								this.value="";
							}
						},
				"blur":function(){
					tdArr[0].innerText="";
				}
			});
		
			$("td.two  input:eq(1)").on({
				"change":function(){
					pwdF=undefined;
					tdArr[1].innerText="密码为6位"
					var rex=/^\w{6}$/;
			
					if(rex.test(this.value)){
						
						pwd=true;
						pwdF=this.value;
						tdArr[1].innerText="格式正确";
						tdArr[1].style.color="green";
						
					}else{
						
						tdArr[1].innerText="格式不正确,不可有特殊字符";
						tdArr[1].style.color="red";
						this.value="";
						}
				
				},
				"blur":function(){
					tdArr[1].innerText="";
				}
			});
			
			$("td.two  input:eq(2)").on({
				"change":function(){
			
					if(pwdF==undefined){
								tdArr[2].innerText="原密码未输入";
								this.value="";
					}else if(this.value==pwdF){
								tdArr[2].innerText="密码输入正确";
								vPwd=true;
							
						}else{
							tdArr[2].innerText="密码输入不正确";
							tdArr[2].style.color="red";
							this.value="";
						}
				},
				"blur":function(){
					tdArr[2].innerText="";
				}
			});

		function login(){
				if(userT!=undefined&&vPwd==true){
						alert("注册成功");
						document.getElementById("qq").submit();
				
					}
			}
			document.getElementById("register").onclick=login;
		
		document.onkeydown=function(OEven){
				if(window.event){
					OEven=window.event;
				}

				var code=OEven.keyCode;
//						alert(typeof(code));
					if(code==32||code==13){
						if(userT!=undefined&&vPwd==true){
							alert("注册成功");
						document.getElementById("qq").submit();
						}
				}		
			} 
		
		});	
				
			</script>
	</head>
	<body>
		
		<div class="wrap">
			<div class="title">
				<span>注册账号</span>
			</div>
			<form name="qq" id="qq" action="loginS.jsp" method="post" onsubmit="return false">
				<table id="table">
					<tr>
						<td class="one" >昵称</td> <td class="two" ><input type="text"  maxlength="10"  name="usId" id="user"size="10" placeholder="账户为10位，开头数字、字母、下划线" /> </td> <td class="three" ></td>
					</tr>
					<tr>
						<td class="one" >密码</td> <td class="two" ><input type="password"  maxlength="6" name="usPwd" id="userPwd" size="10" placeholder="密码6位" /> </td> <td class="three" ></td>
					</tr>
					<tr>
						<td class="one" >确认密码</td> <td class="two" ><input type="password"  maxlength="6" name="VusPwd" id="VuserPwd"size="10"  /> </td> <td class="three" ></td>
					</tr>
					<tr>
						<td class="one" >性别</td> <td class="two" ><input type="radio" checked="checked"   name="sex" class="sex" value="male"  /><span>男</span> <input type="radio" name="sex" class="sex" value="female" /><span>女</span></td> <td class="three" ></td>
					</tr>
						<tr>
						<td class="one" >生日</td> <td class="two" >
							<select name="type"class="type">
								<option value="0">农历</option>
								<option value="1">公历</option>
							</select>
							<select name="year" class="year">
								<option value="0">年</option>
								<option value="1">2018</option>
							</select>
							<select name="month"class="month">
								<option value="0">月</option>
								<option value="1">1月</option>
							</select>
							<select name="date"class="date">
								<option value="0">日</option>
								<option value="1">1</option>
							</select>
							</td> <td class="three" ></td>
					</tr>
					<tr>
						<td class="one" >所在地</td> <td class="two" >
								<select name="country" class="info">
								<option value="0">中国</option>
								<option value="1">美国</option>
							</select>
							<select name="city" class="info">
								<option value="0">北京</option>
								<option value="1">江苏</option>
							</select>
							<select name="address" class="info">
								<option value="0">门头沟</option>
								<option value="1">南京</option>
							</select>
							
						</td> <td class="three" ></td></tr>
					<tr>
						<td class="one" >手机号</td> <td class="two" ><input type="text" maxlength="12" name="usPwd" size="10" /> </td> <td class="three" ></td>
					</tr>
				</table>

					<ul>
						<li><input class="one" type="button" id="register" value="立即注册"></li>
					</ul>
				</form>
		</div>
	</body>
</html>