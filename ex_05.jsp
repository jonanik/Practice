<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String uri=(String)request.getRequestURI();
//uri=/jsp_0424/ex_05.jsp
String conPath=request.getContextPath();
//conPath=/jsp_0424  프로젝트명이라 같다.
String com=uri.substring(conPath.length());
//19.substring(9)   /ex_05.jsp
String str="abcdefg";
String result=str.substring(4);//efg

%>
</body>
</html>