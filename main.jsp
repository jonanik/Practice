<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="mem1" class="home0411.Member" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
div{width:400px;
height:140px;
border:1px solid black;
margin:0 auto;
text-align: center;
box-sizing:border-box;
position: relative;
top:100px;}

button{
margin-top:10px;
margin:0 auto;
}
#btn{
margin-top:20px;
width:150px;
height:40px;
font-size:20px;
}
#div1{
width:400px;
height:80px;
border:1px solid black;
margin:0 auto;
text-align: center;
box-sizing:border-box;
position: relative;
top:100px;}

</style>
</head>
<body>

<%if(session.getAttribute("userId")==null){%>
<!-- �α��ξ������� -->
<div id="div1">
<button id="btn" onclick="location.href='login.html'">�α��� ������</button>
</div>
<%}else{ %>
<!-- �α��������� -->
<div>
<h1><%=mem1.getNickName()%>�� ȯ���մϴ�!</h1>
<button onclick="location.href='logout.jsp'">�α׾ƿ�</button>
</div>
<%} %>



</body>
</html>