<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="mem1" class="home0409.Member" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
아이디<%=mem1.getId() %><br>
비밀번호<%=mem1.getPw() %><br>
이름<%=mem1.getName() %><br>
닉네임<%=mem1.getNickName() %><br>
<%

String id=request.getParameter("id1");
String pw=request.getParameter("pw1");
if(id.equals(mem1.getId())&&pw.equals(mem1.getPw())){
	session.setAttribute("user",id);
	session.setAttribute("nickName",mem1.getNickName());
	response.sendRedirect("main.jsp");%>
<%}else{%>

<%response.sendRedirect("login.html"); }%>



</body>
</html>