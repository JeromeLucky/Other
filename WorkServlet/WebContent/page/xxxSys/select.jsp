<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    	
    		div.left{
    			position:relative;
    			margin:20px auto;
    			width:70%;
    			height:500px;
    			overflow: auto;
    			
    		}
    		div.left table{
    			width:500px;
 				height:500px;
 				border:1px solid black;
 				margin:0 auto;
 				table-layout: fixed;
 			
    		}
    		
    		
    		div.left table th,div.left table td{
    			border:1px solid green;
    			height:10px;
    			
    		}	
    	
    		div.left table th select{
    				border: none;
    				font-size: 16px;
    				font-weight: bold;
    		}
    		div.search{
    			margin:0 auto;
    			width:70%;
    			position:relative;
    			left:470px;
    		}
    </style>
    <body>
    
    			<div class="left">
    					<table>
    						<caption>员工信息</caption>
    				
    						<thead>
    							<th>学号</th>
    							<th>姓名</th>
    							<th>身份证</th>
    							<th><select id="marjor">
    									<option>专业</option>
    								</select>
    							</th>
    							<th><select id="school">
    									<option>学校</option>
    								</select></th>
    						</thead>
    						<tbody >
    						</tbody>		
    				</table>	
    			</div>
  				<div class="search">
    				<label>工号</label><input type="text" class="workId"/><input type="button" value="查询"/>
    						
    				</div>
 	</body>
</html>