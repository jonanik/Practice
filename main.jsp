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
	alert("�α����� ���� �ʾҽ��ϴ�. �α������ּ���.");
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
	<h2>�����ڴ� ȯ���մϴ�!</h2>
	<h3>��� �Ѹ� ���</h3>
	<table border="1">
		<tr>
			<th>���̵�</th>
			<th>�н�����</th>
			<th>�̸�</th>
			<th>�ּ�</th>
			<th>�������</th>
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
	<h3>��� ��� ���</h3>
	<table border="1">
		<tr>
			<th>���̵�</th>
			<th>�н�����</th>
			<th>�̸�</th>
			<th>�ּ�</th>
			<th>�������</th>
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
	<button onclick="location.href='logout.jsp'">�α׾ƿ�</button>
</body>
</html>