<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    		div.wrap{
    			position:relative;
    		}
    		div.left{
    			position:absolute;
    			left:0px;
    			top:0;
    			width:70%;
    			height:500px;
    			
    		}
    		div.left table{
    			width:70%;
 				height:100%;
 				border:1px solid black;
 				margin:0 auto;
    		}
    		div.left table th,div.left table td{
    			border:1px solid green;
    			height:10px;
    			
    		}
    		div.right{
    			position:absolute;
    			right:0;
    			top:0;
    			width:30%;
    			height:500px;
    			
    		}
    		div.right  ul{
    			position:absolute;
    			right:0;
    			top:0;
    			width:100%;
    			height:500px;
    		}
    		
    		div.right ul li {
    		width:100%;
    		list-style: none;
    		position:relative;
    		left:0px;
    		margin-top:30px;
    		}
    		
    		div.right ul li label{
  
    		position:relative;
    		left:20px;
    		}
    		div.right ul li input{
    		position:relative;
    		left:80px;
    		}
    </style>
    <body>
    	<div class="wrap">
    			<div class="left">
    					<table>
    						<caption>员工信息</caption>
    						<thead>
    							<th>学号</th>
    							<th>姓名</th>
    							<th>身份证</th>
    							<th>专业</th>
    							<th>学校</th>
    						</thead>
    						<tbody></tbody>
    					</table>	
    			</div>
    			
    			<div class="right">
    		<ul>
    			    <li><label>学&nbsp;&nbsp;&nbsp;号</label><input type="text" id="stuid" />	</li>
    			    	 <li><label>姓&nbsp;&nbsp;&nbsp;名</label><input type="text" id="name" />	 <li>
    			    	 <li><label>身份证</label><input type="text" id="infoid" />	 <li>
    			    	 <li><label>专&nbsp;&nbsp;&nbsp;业</label><input type="text" id="marjor" /> <li>	
    			    	 <li><label>学&nbsp;&nbsp;&nbsp;校</label><input type="text" id="school" /> <li>	
   	 			    	 <li><input style="left:130px "type="submit" value="新&nbsp;增"><input style="left:200px " type="reset" value="取&nbsp;消"> <li>
      		</ul>
    			</div>
    		
    	</div>
 	</body>
</html>