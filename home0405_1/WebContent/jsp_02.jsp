<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
table{border:1px solid black;
border-collapse: collapse;
}
th,td{border:1px solid black;}
th{width:80px; height:40px;}
td{width:200px;}
</style>
</head>
<body>

<%request.setCharacterEncoding("euc-kr"); %>
<%
String stuNum=request.getParameter("stuNum");
String name=request.getParameter("name");
int kor=Integer.parseInt(request.getParameter("kor"));
int eng=Integer.parseInt(request.getParameter("eng"));
int math=Integer.parseInt(request.getParameter("math"));
int sum=kor+eng+math;
double avg=sum/3;
%>

<h3>학생정보</h3>
<table>
			<tr>
				<th>학번</th>
				<td><%=stuNum %></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><%=name %></td>
			</tr>
			<tr>
				<th>국어</th>
				<td><%=kor %></td>
			</tr>
			<tr>
				<th>영어</th>
				<td><%=eng %></td>
			</tr>
			<tr>
				<th>수학</th>
				<td><%=math %></td>
			</tr>
			<tr>
				<th>합계</th>
				<td><%=sum %></td>
			</tr>
			<tr>
				<th>평균</th>
				<td><%=avg %></td>
			</tr>
		</table>


</body>
</html>