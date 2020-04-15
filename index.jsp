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
if(session.getAttribute("userId")==null){%>
<button onclick="location.href='login.html'">로그인페이지</button>
<%}else{ %>	
<p><%=session.getAttribute("nickName")%>님 환영합니다.</p>
<button onclick="location.href='logout.jsp'">로그아웃</button>
<button onclick="location.href='modify.jsp'">개인정보수정</button>
<%} %>
</body>
</html>