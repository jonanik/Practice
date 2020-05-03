<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="write.do" name="write">
<h3>작성자<input type="text" name="bName"></h3>
<h3>제목<input type="text" name="bTitle"></h3>
<h3>내용</h3>
<textarea name="bContent" rows="18" cols="80"></textarea>
<input type="submit" name="write" value="작성완료">
</form>
</body>
</html>