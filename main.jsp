<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="home.javalec.ex.MemberDto"%>
<%@page import="home.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!String pw, name, address;
	Timestamp birth;
	%>

<%
	String id = (String) session.getAttribute("userId");
	if (id == null) {
%>
<script type="text/javascript">
	alert("로그인이 되지 않았습니다. 로그인해주세요.");
	location.href = "login.jsp"
</script>
<%
	} else if (!(id == null)) {
		MemberDao mdao = MemberDao.getInstance();
		MemberDto mdto = mdao.onemem(id);

		id = mdto.getId();
		pw = mdto.getPw();
		name = mdto.getName();
		address = mdto.getAddress();
		birth = mdto.getBirth();

	}

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>관리자님 환영합니다!</h2>
	<h3>멤버 한명 출력</h3>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>주소</th>
			<th>생년월일</th>
		</tr>
		<tr>
			<td><%=id%></td>
			<td><%=pw%></td>
			<td><%=name%></td>
			<td><%=address%></td>
			<td><%=birth%></td>

		</tr>
	</table>
	<br>
	<h3>모든 멤버 출력</h3>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>주소</th>
			<th>생년월일</th>
		</tr>
		<%
		MemberDao mdao = MemberDao.getInstance();
		MemberDto mdto = mdao.onemem(id);
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		list=mdao.mem();
		
		for(int i=0; i<list.size();i++){
			mdto=list.get(i);
		
		%>
		
		<tr>
			<td><%=mdto.getId()%></td>
			<td><%=mdto.getPw()%></td>
			<td><%=mdto.getName()%></td>
			<td><%=mdto.getAddress()%></td>
			<td><%=mdto.getBirth()%></td>
		</tr>
		<%} %>
	</table>
	<button onclick="location.href='logout.jsp'">로그아웃</button>
</body>
</html>