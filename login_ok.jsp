<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
      <jsp:useBean id="mem1" class="home0412.Member" scope="session"/>
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
if(id.equals(mem1.getId())&&pw.equals(mem1.getPw())){
	session.setAttribute("userId",mem1.getId());
	session.setAttribute("nickname",mem1.getNickname());
	response.sendRedirect("main.jsp");
}else{
	response.sendRedirect("login.html");
}

%>
</body>
</html>