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
<%if(session.getAttribute("user")==null){%>
<!-- �α��� �ȵ� ȭ�� -->
<div>
<button onclick="location.href='login.html'">�α����ϱ�</button>
</div>
	���̵�<%=mem1.getId() %><br>
��й�ȣ<%=mem1.getPw() %><br>
�̸�<%=mem1.getName() %><br>
�г���<%=mem1.getNickName() %><br>	
<%}else{%>
<!-- �α��� �� ȭ�� -->
<div>
<p><%=mem1.getNickName() %>�� ȯ���մϴ�!</p>
<button onclick="location.href='logout.jsp'">�α׾ƿ�</button>
</div>
</body>
</html>
<%} %>

