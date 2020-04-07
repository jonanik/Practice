<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
String id=request.getParameter("id");
String pw=request.getParameter("pw");

if(id.equals("admin")&&pw.equals("1234")){
	session.setAttribute("naver_id","admin");
	session.setAttribute("nick_name","wow");
	response.sendRedirect("index.jsp");
}else{
	response.sendRedirect("login.html");
}

%>

</body>
</html>