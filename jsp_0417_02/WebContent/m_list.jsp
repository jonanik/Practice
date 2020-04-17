<%@page import="java.sql.Timestamp"%>
<%@page import="com.javalec.ex.JoinDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javalec.ex.JoinDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
						<tr>
							<th>회원번호</th>
							<th>아이디</th>
							<th>패스워드</th>
							<th>이름</th>
							<th>이메일</th>
							<th>주소</th>
							<th>전화번호</th>
							<th>생년월일</th>
							<th>성별</th>
							<th>뉴스레터</th>
							<th>SMS</th>
							<th>가입일</th>		
						</tr>
<%
JoinDao jdao=new JoinDao();
JoinDto jdto;
ArrayList<JoinDto> list;
list=jdao.member_list();
int m_num;
String id,pw,name,email,address,phone,gender,news,sms; 
String sql;
Timestamp birth,m_date;

for(int i=0;i<list.size();i++){
	jdto=(JoinDto)list.get(i);
	m_num=jdto.getM_num();
	id=jdto.getId();
	pw=jdto.getPw();
	name=jdto.getName();
	email=jdto.getEmail();
	address=jdto.getAddress();
	phone=jdto.getPhone();
	birth=jdto.getBirth();
	gender=jdto.getGender();
	news=jdto.getNews();
	sms=jdto.getSms();
	m_date=jdto.getM_date();
	%>
	<tr>
							<td><%=m_num %></td>
							<td><%=id %></td>
							<td><%=pw %></td>
							<td><%=name %></td>
							<td><%=email %></td>
							<td><%=address %></td>
							<td><%=phone %></td>
							<td><%=birth %></td>
							<td><%=gender %></td>
							<td><%=news %></td>
							<td><%=sms %></td>
							<td><%=m_date %></td>
						
							
						</tr>			
	
	
<%} %>	
	</table>
	






</body>
</html>