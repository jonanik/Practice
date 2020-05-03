<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="reply.do" name="modify">
<input type="hidden" name="bId" value="${replyView.bId }">
<input type="hidden" name="bHit" value="${replyView.bHit }">
<input type="hidden" name="bGroup" value="${replyView.bGroup }">
<input type="hidden" name="bStep" value="${replyView.bStep }">
<input type="hidden" name="bIndent" value="${replyView.bIndent }">

<h3>${modify.bId }</h3><h3>제목<input type="text" name="bTitle" value="<댓글>${replyView.bTitle }"></h3>
<h3>작성자<input type="text" name="bName" value="${replyView.bName}"></h3>
<h3>내용</h3>
<textarea name="bContent" rows="18" cols="80">
[댓글]
-----------------------------------------------
${replyView.bContent }</textarea>
<input type="submit" name="reply" value="답글달기">
</form>
</body>
</html>