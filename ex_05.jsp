<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2><c:out value="${param.user_id }"/></h2>

<!-- 89점 학점 B -->
<c:set var="name" value="${param.name }"/>
<c:set var="kor" value="${param.kor }"/>
<c:set var="eng" value="${param.eng }"/>
<c:set var="math" value="${param.math }"/>
<c:set var="avg" value="${(kor+eng+math)/3 }"/>
평균은<c:out value="${avg }"/>점 입니다.
<c:if test="${avg>=90&&avg<=100 }">
<p>A학점입니다.</p><br>
</c:if>
<c:if test="${avg>=80&&avg<=89 }">
<p>B학점입니다.</p>
</c:if>
<c:if test="${avg>=70&&avg<=79 }">
</c:if>
<c:if test="${avg>=60&&avg<69 }">
<p>C학점입니다.</p>
</c:if>
<c:if test="${avg<60 }">
<p>D학점입니다.</p>
</c:if>

<c:if test="${param.name=='홍길동'}">
<p>${param.name } 입니다.</p>
</c:if>
<c:if test="${param.name!='홍길동' }">
<p>홍길동이 아닙니다. 이름:${param.name }</p>
</c:if>

<%-- <c:set var="grade" value="B"/> --%>
<%-- <c:set var="score" value="85"/> --%>
<%-- <c:if test="${score>=90&&score<=100 }"> --%>
<!-- <p>A학점입니다.</p><br> -->
<%-- </c:if> --%>
<%-- <c:if test="${score>=80&&score<=89 }"> --%>
<!-- <p>B학점입니다.</p> -->
<%-- </c:if> --%>
<%-- <c:if test="${score>=70&&score<=79 }"> --%>
<!-- <p>C학점입니다.</p> -->
<%-- </c:if> --%>
<%-- <c:if test="${score>=60 &&score<=69}"> --%>
<!-- <p>D학점입니다.</p> -->
<%-- </c:if> --%>
</body>
</html>