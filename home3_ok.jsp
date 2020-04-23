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
<h2>EL태그 사용</h2>
이름:${ldto.name }<br>
아이디:${ldto.id }<br>
패스워드:${ldto.pw }<br>
<hr>
<h2>EL태그 사용2</h2>
이름:${param.name }<br>
아이디:${param.id }<br>
패스워드:${param.pw }<br>
<hr>
<h2>스크립트릿 태그</h2>
이름:<%=request.getParameter("name") %><br>
아이디:<%=request.getParameter("id") %><br>
패스워드:<%=request.getParameter("pw") %><br>
<hr>
applicationScope:${applicationScope.appUser_id }<br>
sesstionScope:${sessionScope.sessUser_id }<br>
pageScope:${pageScope.pageUser_id }<br>
requestScope:${requestScop.reqUser_id }<br>
</body>
</html>