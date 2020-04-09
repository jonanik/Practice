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
<!-- 로그인 안된 화면 -->
<div>
<button onclick="location.href='login.html'">로그인하기</button>
</div>
	아이디<%=mem1.getId() %><br>
비밀번호<%=mem1.getPw() %><br>
이름<%=mem1.getName() %><br>
닉네임<%=mem1.getNickName() %><br>	
<%}else{%>
<!-- 로그인 된 화면 -->
<div>
<p><%=mem1.getNickName() %>님 환영합니다!</p>
<button onclick="location.href='logout.jsp'">로그아웃</button>
</div>
</body>
</html>
<%} %>

