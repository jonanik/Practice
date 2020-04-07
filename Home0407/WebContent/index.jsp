<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body{
background:  #f5f6f7;
}
#big {
	width: 320px;
	height: 120px;
	box-sizing: border-box;
	margin:0 auto;
	position:relative;
	top:150px;
	background-color: white;
	padding-top:2px;
}

#div1 {
	width: 320px;
	heigth: 90px;
	box-sizing: border-box;
	
}


#div2 {
	width: 320px;
	height: 30px;
	box-sizing: border-box;
}
#to_login{
width:280px;
height:37px;
border:0px;
background-image: url("images/naver_button.png");
background-repeat: no-repeat;
background-position: 0px -47px; 
position:relative;
left:20px; 
cursor: pointer;

}
#logout{
width:280px;
height:37px;
border:0px;
background:background:  #f5f6f7;
position:relative;
left:20px; 
cursor: pointer;
}
p{font-size:12px; color:#888888; margin:20px; auto;  }
</style>
</head>
<body>
<%


if(session.getAttribute("naver_id")==null){%>
	<div id="big">
		<div id="div1">
			<p>네이버를 더 안전하고 편리하게 이용하세요.</p>
			<button id="to_login" onclick="location.href='login.html'"></button>
		</div>
		<div id="div2"></div>
	</div>
	<%}else {
		
		
		
		
		%>
	<div id="big">
		<div id="div1">
			<h3>환영합니다.<%=session.getAttribute("nick_name") %>님</h3>
			<button id="logout" onclick="location.href='logout.jsp'">로그아웃</button>
		</div>
		<div id="div2"></div>
	</div>
	
	<%} %>


</body>
</html>