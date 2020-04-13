<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="ex0413.jsp" name="form" method="post">
<%
String select=request.getParameter("select");
if(select.equals("name")){%>
<p>이름 입력</p>
<input type="text" name="name"><br>
<%}else if(select.equals("salary")){ %>
<p>월급입력</p>
<input type="text" name="salary1"><br>
<input type="text" name="salary2"><br>

<%} %>
	<input type="submit" value="검색">
</form>


</body>
</html>