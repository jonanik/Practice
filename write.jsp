<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="write.do" name="write">
<h3>제목</h3>
<input type="text" name="btitle">
<h3>작성자</h3>
<input type="text" name="bname">
<h3>내용</h3>
<textarea name="bcontent" rows="18" cols="80"></textarea>
<input type="submit" value="글 저장">
<input type="reset" onclick="location.href='list.do'" value="취소">
</form>
</body>
</html>