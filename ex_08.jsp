<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="money1" value="10000000"/>
<jsp:useBean id="t_date" class="java.util.Date"/><!-- 자바.유틸 패키지에 데이트 클래스를 참조변수 t_date에 담았다. -->
날짜: <fmt:formatDate value="${t_date }" pattern="yyyy/MM/dd"/><br>
<fmt:formatDate value="<%=new Date() %>" type="both"/><br>
<fmt:formatDate value="<%=new Date() %>" type="date"/><br>
<fmt:formatDate value="<%=new Date() %>" type="time"/><br> 
<hr>
<fmt:formatNumber value="${money1 }" groupingUsed="true"/><br>
<fmt:formatNumber value="1" pattern="0000"/> <!-- 0000이라고 하면0001 이라고나옴 -->
<fmt:formatNumber value="341" pattern="####"/>
</body>										<!-- ####이라고 하면341 이라고나옴 -->						
</html>