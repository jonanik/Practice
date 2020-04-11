<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="mem1" class="home0411.Member" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
String id=request.getParameter("id2");
String pw=request.getParameter("pw2");

if(id.equals(mem1.getId())&&pw.equals(mem1.getPw())){
	session.setAttribute("userId",mem1.getId());
	session.setAttribute("nickName",mem1.getNickName());
	response.sendRedirect("main.jsp");
}else{
	response.sendRedirect("login.html");
}
%>
</body>
</html>