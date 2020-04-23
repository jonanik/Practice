<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%request.setCharacterEncoding("utf-8"); %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="${param.name }"/>
<c:set var="kor" value="${param.kor }"/>
<c:set var="eng" value="${param.eng }"/>
<c:set var="math" value="${param.math }"/>
<c:set var="avg" value="${(kor+eng+math)/3 }"/>

<c:if test="${avg>=90 && avg<=100 }">
A학점입니다.
</c:if>
<c:if test="${avg>=80 && avg<90 }">
B학점입니다.
</c:if>
<c:if test="${avg>=70 && avg<80 }">
C학점입니다.
</c:if>
<c:if test="${avg<70 }">
D학점입니다.
</c:if>
</body>
</html>