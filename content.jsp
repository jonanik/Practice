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
<h1>${content.num} ${content.title } ${content.name }</h1>
<p>${content.content }</p>
<p>${content.wdate }</p>
<p>${content.hit }</p>
<button onclick="location.href='select.do'">글목록</button>
<button onclick="location.href='write.do'">글쓰기</button>
</body>
</html>