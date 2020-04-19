<%@page import="java.sql.Timestamp"%>
<%@page import="home0419_01.MDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="home0419_01.MDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>

<table border="1">
<tr>
<th>회원번호</th>
<th>아이디</th>
<th>패스워드</th>
<th>이름</th>
<th>주소</th>
<th>생년월일</th>
<th>가입일</th>
</tr>
<%
MDao mdao=new MDao();
MDto mdto;
ArrayList<MDto> list=new ArrayList<MDto>();
list=mdao.mlist();

int mNum;
String id,pw,name,address;
Timestamp birth,mDate;
for(int i=0; i<list.size();i++){
	mdto=list.get(i);
	mNum=mdto.getmNum();
	id=mdto.getId();
	pw=mdto.getPw();
	name=mdto.getName();
	address=mdto.getAddress();
	birth=mdto.getBirth();
	mDate=mdto.getmDate();
	%>
	<tr>
<td><%=mNum %></td>
<td><%=id %></td>
<td><%=pw %></td>
<td><%=name %></td>
<td><%=address %></td>
<td><%=birth %></td>
<td><%=mDate %></td>
</tr>
	
	<%}%>
</table>
</body>
</html>