<%@page import="java.sql.Timestamp"%>
<%@page import="com.javalec.home.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javalec.home.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>ȸ����ȣ</th>
<th>���̵�</th>
<th>�н�����</th>
<th>�̸�</th>
<th>�������</th>
<th>�ּ�</th>
<th>��ȭ��ȣ</th>
<th>����</th>
<th>��������</th>
<th>SMS</th>
<th>������</th>
</tr>

<%
MemberDao mdao=new MemberDao(); 
MemberDto mdto=new MemberDto();
ArrayList<MemberDto> mlist=new ArrayList<MemberDto>();
mlist=mdao.list();
int m_num;
String id,pw,name,address,phone,gender,news,sms;
Timestamp birth,m_date;

for(int i=0; i<mlist.size();i++){
	mdto=(MemberDto)mlist.get(i);
	
	m_num=mdto.getM_num();
	id=mdto.getId();
	pw=mdto.getPw();
	name=mdto.getName();
	birth=mdto.getBirth();
	address=mdto.getAddress();
	phone=mdto.getPhone();
	gender=mdto.getGender();
	news=mdto.getNews();
	sms=mdto.getSms();
	m_date=mdto.getM_date();
	%>
	<tr>
	<td><%=m_num %></td>
	<td><%=id %></td>
	<td><%=pw %></td>
	<td><%=name %></td>
	<td><%=birth %></td>
	<td><%=address %></td>
	<td><%=phone %></td>
	<td><%=gender %></td>
	<td><%=news %></td>
	<td><%=sms %></td>
	<td><%=m_date %></td>
	</tr>
	
	
	
	<%}%>
</table>
	
</body>
</html>