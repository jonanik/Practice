<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/custom.js"></script>
</head>
<body>
<form action="login_ok.jsp" name="login" method="post">
아이디<input type="text" name="id">
패스워드<input type="password" name="pw">
<input type="button" onclick="loginCheck()" value="로그인">
</form>
</body>
</html>