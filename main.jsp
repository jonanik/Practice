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
if(session.getAttribute("userId")==null){%>
<button onclick="location.href='login.html'">�α���������</button>
<%}else{ %>
<h2>ȯ���մϴ�.<%=mem1.getNickname() %>��</h2>
<button onclick="location.href='logout.jsp'">�α׾ƿ�</button>
<%} %>
</body>
</html>