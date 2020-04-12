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

아이디: <%=mem1.getId() %><br>
비밀번호: <%=mem1.getPw()%><br>
이름: <%=mem1.getName() %><br>
닉네임: <%=mem1.getNickname() %><br>
취미: <%=Arrays.toString(mem1.getHobby()) %><br>
주소: <%=mem1.getAddress()%><br>
<button onclick="location.href='main.jsp'">메인으로</button>
</body>
</html>