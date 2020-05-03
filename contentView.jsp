<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>${content.bId }.${content.bTitle }</h1><h3>조회수:${content.bHit}</h3>
<textarea rows="17" cols="80" readonly>${content.bContent } </textarea><br>
<button onclick="location.href='modifyView.do?bId=${content.bId}'">수정</button>
<button onclick="location.href='delete.do?bId=${content.bId}'">삭제</button>
<button onclick="location.href='replyForm.do?bId=${content.bId}'">댓글달기</button>
<button onclick="location.href='list.do'">목록</button>
</body>
</html>