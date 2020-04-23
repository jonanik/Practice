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
<c:set var="id" value="admin"/>
<c:set var="pw" value="1234"/>
<c:set var="pw2" value="1234"/>
<c:remove var="pw"/>
<c:set var="str" value="&a&"/>
<h2>jstl core태그</h2>
아이디:<c:out value="${id }"/><br>
remove된 비밀번호:<c:out value="${pw }"/><br>
비밀번호2:<c:out value="${pw2 }"/><br>
문자:<c:out value="${str }"/><br>
--------------------------------------------<br>
<c:catch var="err">
<%=2/0 %>
</c:catch>
<c:out value="${err }"/><br>
<c:if test="${id=='admin' }">
아이디가 일치합니다. 아이디는 <c:out value="${id}"/>
</c:if>
<c:if test="${id!='admin' }">
아이디가가 일치하지 않습니다. 입력된 아이디<c:out value="${id }"/>
</c:if>

</body>
</html>