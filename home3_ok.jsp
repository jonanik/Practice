<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%request.setCharacterEncoding("utf-8"); %>
<%--     <jsp:useBean id="ldto" class="home.javalec.ex.MemberInfo" scope="page"/> --%>
<%--     <jsp:setProperty property="*" name="ldto"/> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>EL�±� ���</h2>
�̸�:${ldto.name }<br>
���̵�:${ldto.id }<br>
�н�����:${ldto.pw }<br>
<hr>
<h2>EL�±� ���2</h2>
�̸�:${param.name }<br>
���̵�:${param.id }<br>
�н�����:${param.pw }<br>
<hr>
<h2>��ũ��Ʈ�� �±�</h2>
�̸�:<%=request.getParameter("name") %><br>
���̵�:<%=request.getParameter("id") %><br>
�н�����:<%=request.getParameter("pw") %><br>
<hr>
applicationScope:${applicationScope.appUser_id }<br>
sesstionScope:${sessionScope.sessUser_id }<br>
pageScope:${pageScope.pageUser_id }<br>
requestScope:${requestScop.reqUser_id }<br>
</body>
</html>