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
���̵�<%=mem1.getId() %><br>
��й�ȣ<%=mem1.getPw() %><br>
�̸�<%=mem1.getName() %><br>
�г���<%=mem1.getNickName() %><br>

<a href="main.jsp">����ȭ������ �̵�</a>
</body>
</html>