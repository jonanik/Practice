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
<button onclick="location.href='login.html'">로그인페이지</button>
<%}else{ %>
<h2>환영합니다.<%=mem1.getNickname() %>님</h2>
<button onclick="location.href='logout.jsp'">로그아웃</button>
<%} %>
</body>
</html>