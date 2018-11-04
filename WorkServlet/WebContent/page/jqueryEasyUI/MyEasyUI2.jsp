<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../../css/easyui.css">
<link rel="stylesheet" type="text/css" href="../../css/mobile.css">
<link rel="stylesheet" type="text/css" href="../../css/icon.css">

<script src="../../js/jquery.min.js" type="text/javascript"></script>
<script src="../../js/jquery.easyui.min.js" type="text/javascript"></script>
<script src="../../js/jquery.easyui.mobile.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyEasy UI</title>
<script>
	$(function(){
				$('#cc').combogrid({    
				    panelWidth:450,    
		 		   value:'006',    
		     
		 		 	  idField:'code',    
		 		 	  textField:'name',    
					    url:'datagrid_data.json',    
		    columns:[[    
		      			  {field:'code',title:'Code',width:60},    
		     			   {field:'name',title:'Name',width:100},    
		      			  {field:'addr',title:'Address',width:120},    
		     			   {field:'col4',title:'Col41',width:100}    
		 		   ]]    
			});  

		$('#cc').combogrid({    
				    delay: 500,    
		 			   mode: 'remote',    
					    url: 'get_data.php',    
					    idField: 'id',    
					    textField: 'name',    
		 		   columns: [[    
		    				    {field:'code',title:'Code',width:120,sortable:true},    
		  				      {field:'name',title:'Name',width:400,sortable:true}    
		 			   ]]    
			});  


		});  
			
		

		
</script>
</head>
<body>
				<div>
							<input id="cc" name="dept" value="01" />  
				</div>
</body>
</html>