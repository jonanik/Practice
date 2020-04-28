<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="reply.do" name="reply" method="post">
<input type="hidden" name="bid" value="${replyView.bid }">
<input type="hidden" name="bgroup" value="${replyView.bgroup }">
<input type="hidden" name="bindent" value="${replyView.bindent }">
<input type="hidden" name="bdate" value="${replyView.bdate }">
<input type="hidden" name="bstep" value="${replyView.bstep }">
<h2>제목:<input type="text" name="btitle" value="<댓글>${replyView.btitle }"></h2>
<p>작성자:<input type="text" name="bname" value="${replyView.bname }"></p>
<p>작성일:${replyView.bdate }</p>
<h4>내용</h4>
<textarea name="bcontent" rows="18" cols="80" >
[댓글]


-----------------------------------------------------------------------------
[본문]
${replyView.bcontent }</textarea>
<h4>조회수</h4>
<p>${replyView.bhit }</p>
<input type="submit" name="replyView" value="댓글저장">
</form>
</body>
</html>