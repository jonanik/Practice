<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="euc-kr"%>
<%request.setCharacterEncoding("utf-8"); %>
 <jsp:useBean id="mem1" class="home0411.Member" scope="session"/>
 <jsp:setProperty property="*" name="mem1"/>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������ Ȯ��������</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

h1 {width:400px;
	margin: 20px auto;
	text-align: center;
}

form {
width:400px;
	margin: 0 auto;
}

table {
	border-collapse: collapse;
	width: 400px;
}

tr, th, td {
	border: 1px solid black;
}

th {
	width: 100px;
	height: 30px;
}
td{padding-left:10px;}
input{position:relative;
left:170px;
top:10px;
}

</style>
</head>
<body>
	<h1>[ȸ������ Ȯ��]</h1>
<form>
<table>
			<tr>
				<th>���̵�</th>
				<td><%=mem1.getId()%></td>
			</tr>
			<tr>
				<th>�н�����</th>
				<td><%=mem1.getPw()%></td>
			</tr>
			<tr>
				<th>�̸�</th>
				<td><%=mem1.getName()%></td>
			</tr>
			<tr>
				<th>����</th>
				<td><%=mem1.getNickName()%></td>
			</tr>
			<tr>
				<th>���</th>
				<td><%=Arrays.toString(mem1.getHobby())%>
				</td>
			</tr>
			<tr>
				<th>�ּ�</th>
				<td><%=mem1.getAddress()%></td>
			</tr>
		</table>
		<input type="button" onclick="location.href='main.jsp'" value="�������� �̵�">
		</form>
</body>
</html>