<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:set var="check" value="4"/>
<c:choose>
<c:when test="${check==1 }">
SUV를 구매하셨습니다.
</c:when>
<c:when test="${check==2 }">
스포츠카를 구매하셨습니다.
</c:when>
<c:when test="${check==3 }">
덤프트럭을 구매하셨습니다.
</c:when>
<c:otherwise>
잘못입력하셨습니다.
</c:otherwise>
</c:choose>

</body>
</html>