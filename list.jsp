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
	margin-left: 10px;
}
</style>
</head>
<body>
	<form action="search.do" name="search" method="post">
		<select name="opt">
			<option value="all">전체</option>
			<option value="tit">제목</option>
			<option value="con">내용</option>
		</select> <input type="text" name="search"> <input type="submit"
			value="검색">
	</form>

	<table border="1">
		<tr>
			<th>No.</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.bId}</td>
				<td>${list.bTitle}</td>
				<td>${list.bContent}</td>
				<td>${list.bName}</td>
				<td>${list.bDate}</td>
			</tr>
		</c:forEach>
	</table>

<c:choose>	
<c:when test="${searchFlag!=null }">
<ul>
		<a href="list.do?searchFlag=${searchFlag}&opt=${opt }&search=${search }&page=1"><li name="first">◀◀</li></a>
		<c:if test="${page<=1 }">
			<li name="prev">◀</li>
		</c:if>
		<c:if test="${page>1 }">
			<a href="list.do?searchFlag=${searchFlag}&opt=${opt }&search=${search }&page=${page-1 }"><li name="prev">◀</li></a>
		</c:if>
		<c:forEach var="a" begin="${startPage }" end="${endPage }" step="1">
			<c:choose>
				<c:when test="${a==page }">
					<li name="num">${a }</li>
				</c:when>
				<c:when test="${a!=page }">
					<a href="list.do?searchFlag=${searchFlag}&opt=${opt }&search=${search }&page=${a }"><li name="num">${a }</li></a>
				</c:when>
			</c:choose>
		</c:forEach>
		<c:if test="${page>=maxPage }">
			<li name="next">▶</li>
		</c:if>
		<c:if test="${page<maxPage }">
			<a href="list.do?searchFlag=${searchFlag}&opt=${opt }&search=${search }&page=${page+1 }"><li name="next">▶</li></a>
		</c:if>
		<a href="list.do?searchFlag=${searchFlag}&opt=${opt }&search=${search }&page=${maxPage }"><li name="last">▶▶</li></a>
	</ul>
</c:when>

	<c:otherwise>
	<ul>
		<a href="list.do?page=1"><li name="first">◀◀</li></a>
		<c:if test="${page<=1 }">
			<li name="prev">◀</li>
		</c:if>
		<c:if test="${page>1 }">
			<a href="list.do?page=${page-1 }"><li name="prev">◀</li></a>
		</c:if>
		<c:forEach var="a" begin="${startPage }" end="${endPage }" step="1">
			<c:choose>
				<c:when test="${a==page }">
					<li name="num">${a }</li>
				</c:when>
				<c:when test="${a!=page }">
					<a href="list.do?page=${a }"><li name="num">${a }</li></a>
				</c:when>
			</c:choose>
		</c:forEach>
		<c:if test="${page>=maxPage }">
			<li name="next">▶</li>
		</c:if>
		<c:if test="${page<maxPage }">
			<a href="list.do?page=${page+1 }"><li name="next">▶</li></a>
		</c:if>
		<a href="list.do?page=${maxPage }"><li name="last">▶▶</li></a>
	</ul>
	</c:otherwise>
	</c:choose>
</body>
</html>