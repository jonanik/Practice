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
<c:set var="check" value="4"/>
<c:choose>
<c:when test="${check==1 }">
SUV�� �����ϼ̽��ϴ�.
</c:when>
<c:when test="${check==2 }">
������ī�� �����ϼ̽��ϴ�.
</c:when>
<c:when test="${check==3 }">
����Ʈ���� �����ϼ̽��ϴ�.
</c:when>
<c:otherwise>
�߸��Է��ϼ̽��ϴ�.
</c:otherwise>
</c:choose>

</body>
</html>