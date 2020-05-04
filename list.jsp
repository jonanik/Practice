<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
ul {
	list-style: none;
}

li {
	float: left;
}
</style>
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
				<td><a href="contentView.do?bid=${list.bid }">${list.btitle }</a></td>
				<td>${list.bcontent }</td>
				<td>${list.bdate }</td>
				<td>${list.bname }</td>
				<td>${list.bhit }</td>
			</tr>
		</c:forEach>
	</table>
	<ul>
		<!-- 첫페이지로 -->
		<a href="list.do?page=1"><li name="first">◀◀</li></a>
		<!-- 이전페이지로 -->
		<c:if test="${page<=1 }">
			<li name="prev">◀</li>
		</c:if>
		<c:if test="${page>1 }">
			<a href="list.do?page=${page-1}"><li name="prev">◀</li></a>
		</c:if>
		<!-- 순차적으로 출력 -->
		<c:forEach var="a" begin="${startpage }" end="${endpage }" step="1">
			<c:choose>
				<c:when test="${a==page }">
					<li name=num>${a }</li>
				</c:when>
				<c:when test="${a!=page }">
					<a href="list.do?page=${a }"><li>${a}</li></a>
				</c:when>
			</c:choose>
		</c:forEach>
		<c:if test="${page>=maxpage }">
			<li name="last">▶</li>
		</c:if>
		<c:if test="${page<maxpage }">
			<a href="list.do?page=${page+1 }"><li name="next">▶</li></a>
		</c:if>
		<!-- 마지막 페이지 이동 -->
		<a href="list.do?page=${maxpage }"><li name="last">▶▶</li></a>

	</ul>
	<button onclick="location.href='write.jsp'">글쓰기</button>
</body>
</html>