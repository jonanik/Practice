<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>NO.</th>
<th>Title</th>
<th>작성일</th>
<th>작성자</th>
<th>조회수</th>
</tr>
<c:forEach var="list" items="${list }">
<tr>
<td>${list.bId}</td>
<td>${list.bTitle}</td>
<td>${list.bDate}</td>
<td>${list.bName}</td>
<td>${list.bHit}</td>

</tr>

</c:forEach>
</table>


</body>
</html>