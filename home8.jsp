<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:set var="money1" value="100000"/><br>
<jsp:useBean id="t_date" class="java.util.Date"/>
날짜:<fmt:formatDate value="${t_date }" pattern="yyyy/MM/dd"/><br>
<fmt:formatDate value="<%=new Date() %>" type="both"/><br>
<fmt:formatDate value="<%=new Date() %>" type="date"/><br>
<fmt:formatDate value="<%=new Date() %>" type="time"/><br>
<hr>
<fmt:formatNumber value="${money1 }" groupingUsed="true"/><br>
<fmt:formatNumber value="1" pattern="0000"/>
<fmt:formatNumber value="341" pattern="####"/>

</body>
</html>