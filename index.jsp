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
<button onclick="location.href='login.html'">�α���������</button>
<%}else{ %>	
<p><%=session.getAttribute("nickName")%>�� ȯ���մϴ�.</p>
<button onclick="location.href='logout.jsp'">�α׾ƿ�</button>
<button onclick="location.href='modify.jsp'">������������</button>
<%} %>
</body>
</html>