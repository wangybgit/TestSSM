<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<title>/jsp/login</title>
	<link rel="stylesheet" href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="form-inline">
		<div class="login">
				<form id="login-form" role="form" action="${pageContext.request.contextPath}/login/logincheck" method="post">
					<c:if test="${not empty error_msg}">
						<div class="alert alert-danger" id="error-msg">${error_msg}</div>
					</c:if>
					<fieldset>
						<legend>用户登录</legend>
						<input type="text" class="form-control" name="username" id="username" placeholder="用户名"><br>
						<input type="password" class="form-control" name="password" id="password" placeholder="登录密码"><br>
						<button type="submit">登录</button>
						<input type="button" value="注册" onclick="window.location.href='${pageContext.request.contextPath}/login/register'">
					</fieldset>
				</form>
			<!-- /.well -->
		</div>
		<!-- /.login -->
	</div>    
</body>


</html>