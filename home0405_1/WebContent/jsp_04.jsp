<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
int age=Integer.parseInt(request.getParameter("age"));
if(age>=19){
	response.sendRedirect("ok.jsp");
}else if(age<19){
	response.sendRedirect("no.jsp");
}
%>


</body>
</html>