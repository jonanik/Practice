<%@page import="home.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    request.setCharacterEncoding("utf-8");
    String id=request.getParameter("id");
    String pw=request.getParameter("pw");
    MemberDao mdao= MemberDao.getInstance();
   int check= mdao.loginCheck(id, pw);
    
if(check==1){
	session.setAttribute("userId",id);
	response.sendRedirect("main.jsp");
}else if(check==-1){%>
	<script type="text/javascript">
	alert("���̵� Ʋ�Ƚ��ϴ�.");
	
	history.back();
	</script>
<%}else if(check==-2){ %>
<script type="text/javascript">
	alert("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
	history.back();
	</script>
<%}else if(check==0){ %>
<script type="text/javascript">
	alert("�����Ͱ� �����ϴ�.");
	history.back();
	</script>
<%} %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>