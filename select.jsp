<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>No.</th>
<th>����</th>
<th>����</th>
<th>�ۼ���</th>
<th>�ۼ���</th>
<th>��ȸ��</th>
</tr>
<c:forEach var="print" items="${list }">

<tr>
<td>${print.num }</td>
<td><a href="content.do?num=${print.num}">${print.title }</a></td>
<td>${print.content }</td>
<td>${print.name}</td>
<td>${print.wdate }</td>
<td>${print.hit }</td>
</tr>
</c:forEach>
</table>

</body>
</html>