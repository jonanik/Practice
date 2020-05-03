<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>No.</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="list" items="${list }">
			<tr>
				<td>${list.bId}</td>
				<td><c:forEach begin="1" end="${list.bIndent }">▶</c:forEach><a href="contentView.do?bId=${list.bId }">${list.bTitle}</a></td>
				<td>${list.bContent }</td>
				<td>${list.bName }</td>
				<td>${list.bDate }</td>
				<td>${list.bHit }</td>
			</tr>
		</c:forEach>
	</table>
	<button onclick="location.href='writeForm.do'">글쓰기</button>
	

</body>
</html>