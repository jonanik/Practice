<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ex_03_ok.jsp" name="ex03" method="post">
이름<input type="text" name="name"><br>
아이디<input type="text" name="id"><br>
패스워드<input type="password" name="pw"><br>
<input type="submit" value="전송">
</form>
<%
application.setAttribute("appUser_id1","app_admin");//서버죽을때까지 안사라진다.
session.setAttribute("sessUser_id","sess_admin");
pageContext.setAttribute("pageUser_id","page_admin");//다음페이지로 넘어가면 사라진다.
request.setAttribute("reqUser_id","req_admin");//다음페이지로 넘어가면 사라진다.
%>
</body>
</html>