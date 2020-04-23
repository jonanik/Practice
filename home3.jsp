<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="home3_ok.jsp" name="home3" method="post">
이름<input type="text" name="name"><br>
아이디<input type="text" name="id"><br>
패스워드<input type="text" name="pw"><br>
<input type="submit" value="전송">
</form>
<%
application.setAttribute("appUser_id","app_admin");
session.setAttribute("sessUser_id","sess_admin");
pageContext.setAttribute("pageUser_id","page_admin");
request.setAttribute("reqUser_id","req_admin");

%>

</body>
</html>