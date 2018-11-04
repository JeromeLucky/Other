<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login form easy UI</title>
<link rel="stylesheet" type="text/css" href="../../css/easyui.css">
<link rel="stylesheet" type="text/css" href="../../css/mobile.css">
<link rel="stylesheet" type="text/css" href="../../css/icon.css">

<script src="../../js/jquery.min.js" type="text/javascript"></script>
<script src="../../js/jquery.easyui.min.js" type="text/javascript"></script>
<script src="../../js/jquery.easyui.mobile.js" type="text/javascript"></script>
<script type="text/javascript">
			$(function(){
				
			 $('#birth').datebox({    
				    required:true,
				    onSelect: function(date){
				       /*  alert(date.getFullYear()+":"+(date.getMonth()+1)+":"+date.getDate()); */
				    }
				});  

				/*one method    ajax 验证 某个字符是否ok */
				$("#account").onChange=function(){
								alert("点击提交按钮");
					 $('#ff').form({    
										 url:"<c:url value='/do/formUI'/>",    
						 				 onSubmit: function(param){    
															  param.method='verif';
						  									 param.user = 'value1';    
	      												     param.sex = 'value2-sex';  
	        												 param.account = 'value2-account';  
	     													 param.password = 'value2-password';  
	      													 param.mail = 'value2-mai';  
	  					  								     param.birth = 'value2-birth';  
										  },    
														 success:function(data){    
							  							   alert(data)    
													  }    
									});    
						    	//提交
		    						   	$('#ff').submit();  	//可以是某个文件全部输入完时提交		 
						}

			/*two method   submit the form      */

	$(".submit").click(function (){
	
	     	$.messager.progress();	// 显示进度条
	
					$('#ff').form('submit', {    
						url:"<c:url value='/do/formUI'/>",    
				  		onSubmit: function(param){    
				  			var isValid = $(this).form('validate');
				  			if (!isValid){
				  				$.messager.progress('close');	// 如果表单是无效的则隐藏进度条
				  			 	 return isValid;	// 返回false终止表单提交
				  			}
				  					     param.method='submit'
				  					     param.user = 'value1';    
				      				     param.sex = 'value2-sex';  
				        				 param.account = 'value2-account';  
				     					 param.password = 'value2-password';  
				      					 param.mail = 'value2-mai';  
				  					     param.birth = 'value2-birth';  
							  					
									  },    
			 						 success:function(data){    
 									 $.messager.progress('close');	// 如果提交成功则隐藏进度条
						   	   }     
					});  
			});
				
				//验证 秘密
				$.extend($.fn.validatebox.defaults.rules, {    
	 			   equals: {    
	    					    validator: function(value,param){    
	       					     return value == $(param[0]).val();    
	     				  },    
	      				  message: 'Field do not match.'   
	 				   }    
				});  
				// 自定义 验证 用户 数据
			/* 	$.extend($.fn.validatebox.defaults.rules, {    
  				  verif: {      
       							 validator: function(){       
       								
      							  },    
      							  message: '该用户已存在'   
   						 }    
				});   */
				
		//---------------------------------------------------------------------------------------------------		
			//邮箱 只需要改变  validType="email"
			/*  自定义验证规则  修改 
			$.extend($.fn.validatebox.defaults.rules, {    
  				  minLength: {      指定函数名
       							 validator: function(value, param){       value为 本 文本框的 value  Parma为 函数传入的参数
           					 return value.length >= param[0];       函数的返回值  都是boolean值
      					  },    
      				  message: 'Please enter at least {0} characters.'   
   			 }    
	});  
		使用规则        validType="minlength[5]"  或  data-options="validType:'minLength[5]'"
			*/
	});
	
		
	
</script>
</head>
<body>
<div>
		<div class="easyui-panel" title="my form UI" style="width:100%;max-width:400px;padding:30px 60px;">
		<form  method="post" id="ff">
			<input type="text"  class="easyui-textbox"  style="width:100%" name="username" data-options="label:'Name:',required:true"/></br>
			<input type="text"  class="easyui-textbox" name="sex" style="width:100%"  data-options="label:'sex:',required:true"/></br>
			<input type="text" class="easyui-textbox"  id="account" name="account" style="width:100%"  data-options="label:'account:',required:true" /></br>
			<input type="password" class="easyui-textbox" name="password"  id="password" style="width:100%"  data-options="label:'password:',required:true"/></br>
			<input type="password" class="easyui-textbox" name="confirm" id="confirm" style="width:100%"  data-options="label:'confirm:',required:true"  validType="equals['#password']"/></br>
			<input type="text" class="easyui-textbox" name="mail" id="email" style="width:100%"  data-options="label:'mail:',required:true" validType="email"/></br>
			<input type="text" id="birth" name="birth" style="width:100%"  data-options="label:'birth:'"/></br>
			<button class="submit"> 提交</button><button>重置</button>
			</form>
		</div>
</div>
</body>
</html>