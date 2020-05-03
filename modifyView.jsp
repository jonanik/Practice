<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%--     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="modify.do" name="modify">
<input type="hidden" name="bId" value="${modify.bId }">
<h3>${modify.bId }</h3><h3>제목<input type="text" name="bTitle" value="${modify.bTitle }"></h3>
<h3>내용</h3>
<textarea name="bContent" rows="18" cols="80">${modify.bContent }</textarea>
<input type="submit" name="modify" value="수정완료">
</form>
</body>
</html>