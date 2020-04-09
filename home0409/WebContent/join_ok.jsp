<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="mem1" class="home0409.Member" scope="session"/>
    <jsp:setProperty property="*" name="mem1" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8"); %>
아이디<%=mem1.getId() %><br>
비밀번호<%=mem1.getPw() %><br>
이름<%=mem1.getName() %><br>
닉네임<%=mem1.getNickName() %><br>

<a href="main.jsp">메인화면으로 이동</a>
</body>
</html>