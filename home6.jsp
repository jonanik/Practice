<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>단</th>
<th>식</th>
<th>값</th>
</tr>

<c:set var="sum" value="0"/>
<c:forEach var="i" begin="2" end="5" step="1">
	<c:forEach var="j" begin="1" end="9" step="2">
<tr>
<td>${i }</td>
<td>${i}X${j }</td>
<td>=${i*j }</td>
</tr>
	</c:forEach>
</c:forEach>



</table>
</body>
</html>