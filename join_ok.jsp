<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%request.setCharacterEncoding("utf-8"); %>
    <jsp:useBean id="mem1" class="home0412.Member" scope="session"/>
    <jsp:setProperty property="*" name="mem1"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

���̵�: <%=mem1.getId() %><br>
��й�ȣ: <%=mem1.getPw()%><br>
�̸�: <%=mem1.getName() %><br>
�г���: <%=mem1.getNickname() %><br>
���: <%=Arrays.toString(mem1.getHobby()) %><br>
�ּ�: <%=mem1.getAddress()%><br>
<button onclick="location.href='main.jsp'">��������</button>
</body>
</html>