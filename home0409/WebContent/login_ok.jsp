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
���̵�<%=mem1.getId() %><br>
��й�ȣ<%=mem1.getPw() %><br>
�̸�<%=mem1.getName() %><br>
�г���<%=mem1.getNickName() %><br>
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