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
<form action="modify.do" name="modify" method="post">
<input type="hidden" name="bid" value="${contentView.bid }">
<h2><input type="text" name="btitle" value="제목:${contentView.btitle }"></h2>
<p><input type="text" name="bname" value="작성자:${contentView.bname }" readonly></p>
<p><input type="text" name="bdate" value="작성일:${contentView.bdate }" readonly></p>
<h4>내용</h4>
<textarea name="bcontent" rows="18" cols="80">${contentView.bcontent }</textarea>
<h4>조회수</h4>
<input type="text" name="btitle" value="${contentView.bhit }">
<input type="submit" value="수정완료">
</form>
</body>
</html>