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

<h2>제목:${contentView.btitle }</h2>
<p>작성자:${contentView.bname }</p>
<p>작성일:${contentView.bdate }</p>
<h4>내용</h4>
<p>${contentView.bcontent }</p>
<h4>조회수</h4>
<p>${contentView.bhit }</p>
<button onclick="location.href='replyView.do?bid=${contentView.bid}'">댓글달기</button>
<button onclick="location.href='modifyView.do?bid=${contentView.bid}'">수정</button>
<button onclick="location.href='delete.do?bid=${contentView.bid}'">삭제</button>
<button onclick="location.href='list.do'">목록</button>


</body>
</html>