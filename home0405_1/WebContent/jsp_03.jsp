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
String name=request.getParameter("name");
String id=request.getParameter("id");
String pw=request.getParameter("pw");
%>
<%
if(id.equals("admin")&&pw.equals("1234")){
	response.sendRedirect("pass.jsp ");
}else if(!(id.equals("admin")&&pw.equals("1234"))){
	response.sendRedirect("error.jsp ");
}
%>

</body>
</html>