<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
table{border:1px solid black;
border-collapse:collapse;}
th,td{border:1px solid black;}
th{width:80px; height:40px;}
td{width:200px;}

</style>
</head>
<body>
<%
int num1= Integer.parseInt(request.getParameter("start"));
int num2=Integer.parseInt(request.getParameter("end"));
%>


<%!
public int sum(int a,int b){
	int sum=0;
	for(int i=a; i<=b;i++){
		sum+=i;
	}
	return sum;
}
%>
<%!
public double multi(int a,int b){
	int multi=1;
	for(int i=a;i<=b;i++){
		multi*=i;
	}
	return multi;
}
%>

<h2>계산 결과값</h2>
	<table>
		<tr>
			<th>더하기</th>
			<td><%=sum(num1,num2) %></td>
		</tr>
		<tr>
			<th>곱하기</th>
			<td><%=multi(num1,num2) %></td>
		</tr>
	</table>
</body>
</html>