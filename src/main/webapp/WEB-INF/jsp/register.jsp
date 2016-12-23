<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>用户登录</title>
	<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body onload="onload()">
	<div class="form-inline">
		<div class="login">
		<form action="${pageContext.request.contextPath }/login/registerCheck">
			<fieldset>	
			<div>欢迎注册</div>
			<input type="text" class="form-control" id="id" name="id" placeholder="用户id"><br>
			<input type="text" class="form-control" id="userName" name="userName" placeholder="用户名"><br>
			<input type="text" class="form-control" id="password" name="password" placeholder="密码"><br>
			<input type="text" class="form-control" id="age" name="age" placeholder="年龄"><br>
			<button type="submit">注册</button>
			</fieldset>
		</form>
		</div>
	</div>
</body>
<script type="text/javascript">
	function onload(){
		var msg = "${msg}";
		if(msg!=""){
			alert(msg);	
		}
		
	}

</script>	


</html>