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
<c:set var="id" value="admin"/>
<c:set var="pw" value="1234"/>
<c:set var="pw2" value="1234"/>
<c:remove var="pw"/>
<c:set var="str" value="&a&"/>
<h2>jstl core�±�</h2>
���̵�:<c:out value="${id }"/><br>
remove�� ��й�ȣ:<c:out value="${pw }"/><br>
��й�ȣ2:<c:out value="${pw2 }"/><br>
����:<c:out value="${str }"/><br>
--------------------------------------------<br>
<c:catch var="err">
<%=2/0 %>
</c:catch>
<c:out value="${err }"/><br>
<c:if test="${id=='admin' }">
���̵� ��ġ�մϴ�. ���̵�� <c:out value="${id}"/>
</c:if>
<c:if test="${id!='admin' }">
���̵𰡰� ��ġ���� �ʽ��ϴ�. �Էµ� ���̵�<c:out value="${id }"/>
</c:if>

</body>
</html>