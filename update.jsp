<%@page import="com.javalec.ex.boardDto"%>
<%@page import="com.javalec.ex.boardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int b_num=Integer.parseInt(request.getParameter("b_num"));
    boardDao bdao=boardDao.getInstance();
    boardDto bdto=bdao.getBoard(b_num);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update_ok.jsp" name="b_update" method="post" enctype="multipart/form-data">
<input type="hidden" name="b_num" value="<%=bdto.getB_num()%>">
제목<input type="text" name="b_title" value="<%=bdto.getB_title()%>"><br>
작성자<input type="text" name="b_user" value="<%=bdto.getB_user()%>" readonly><br>
<br>
내용<textarea rows="15" cols="80" name="b_content"><%=bdto.getB_content()%></textarea><br>
이전파일<input type="text" name="old_file" value="<%=bdto.getB_file()%>" readonly><br>
파일 <input type="file" name="b_file" ><br>
<input type="submit" value="수정">
<input type="button" onclick="javascript:window.location.href='list.jsp'" value="취소">
</form>
</body>
</html>