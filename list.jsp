<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/custom.css">
</head>
<body>
<table border="1">
<tr>
<th>No.</th>
<th>제목</th>
<th>내용</th>
<th>작성일</th>
<th>작성자</th>
<th>조회수</th>
</tr>
<c:forEach var="list" items="${list }">


<tr>
<td>${list.bid }</td>
<td><c:forEach begin="1" end="${list.bindent }">▶</c:forEach><a href="contentView.do?bid=${list.bid }">${list.btitle }</a></td>
<td>${list.bcontent }</td>
<td>${list.bdate }</td>
<td>${list.bname }</td>
<td>${list.bhit }</td>
</tr>
</c:forEach>
</table>
<button onclick="location.href='write.jsp'">글쓰기</button>
</body>
</html>