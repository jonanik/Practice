<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>�����̸�:${requestScope.sel_address}</h2>
<table border="1">
<tr>
<th>���̵�</th>
<th>�н�����</th>
<th>�̸�</th>
<th>���Գ�¥</th>
</tr>
<c:forEach var="memList" items="${memList}">
<tr>
<td>${memList.getId()}</td>
<td>${memList.getPw()}</td>
<td>${memList.getName()}</td>
<td>${memList.getB_date()}</td>
</tr>


</c:forEach>



</table>


</body>
</html>