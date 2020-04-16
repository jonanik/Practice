<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String authUser=(String)session.getAttribute("authUser");
    if(authUser==null){
    	out.println("<script>alert('로그인이 되어 있지 않습니다. 로그인을 해주세요.');");
    	out.println("location.href='login.jsp';</script>");
    	
    }
    %>
    <%!
    Connection con=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    String id,pw,name,email,address,phone,gender,news,sms;
    Timestamp birth;
    
    String sql;
    int check;
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%//main.jsp에서 파라미터 값으로 넘어옴

try{
id=request.getParameter("id");
out.println("아이디:"+id);
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
sql="select * from lms_member where id=?";
out.println("sql구문:"+sql);
pstmt=con.prepareStatement(sql);
pstmt.setString(1,id);
rs=pstmt.executeQuery();

while(rs.next()){
	pw=rs.getString("pw");
	name=rs.getString("name");
	email=rs.getString("email");
	address=rs.getString("address");
	phone=rs.getString("phone");
	birth=rs.getTimestamp("birth");
	gender=rs.getString("gender");
	news=rs.getString("news");
	sms=rs.getString("sms");
	%>
	<%--html 프로그램 부분 추가 --%>
	<h2>회원정보수정</h2>
<form action="Modify_Ok" name="modify" method="post">
아이디:<input type="text" name="id" value=<%=id %> readonly ><br>  <!--  readonly 는 파라미터값으로 값이 넘어감  disalbed는 파라미터값으로 안넘어감//-->
패스워드:<input type="password" name="pw" value=<%=pw %> ><br>
이름:<input type="text" name="name" value=<%=name %>><br>
이메일:<input type="text" name="email" value=<%=email %>><br>
주소:<input type="text" name="address" value=<%=address %>><br>
전화번호:<input type="text" name="phone" value=<%=phone %>><br>
생일:<input type="date" name="birth" value=<%=birth %>><br>
<p>성별</p>
<%
switch(gender){
case "남성":%>
	<input type="radio" name="gender" value="남성" checked>남성
	<input type="radio" name="gender" value="여성">여성<br>
	<%break;
case "여성":%>
	<input type="radio" name="gender" value="남성">남성
	<input type="radio" name="gender" value="여성" checked>여성<br>
	<%break;
}
%>

<p>뉴스레터 받기 여부</p>
<%
switch(news){
case "예":%>
	<input type="radio" name="news" value="예" checked>예
	<input type="radio" name="news" value="아니오">아니오<br>
	<%break;
case "아니오":%>
	<input type="radio" name="news" value="예" >예
	<input type="radio" name="news" value="아니오" checked>아니오<br>
	<%break;
}
%>

<p>SMS 받기 여부</p>
<%
switch(sms){
case "예":%>
	<input type="radio" name="sms" value="예" checked>예
	<input type="radio" name="sms" value="아니오">아니오<br>
	<%break;
case "아니오":%>
	<input type="radio" name="sms" value="예" >예
	<input type="radio" name="sms" value="아니오" checked>아니오<br>
	<%break;
}
%>
<input type="submit" value="저장">
<input type="reset" value="취소"><br>
</form>
	<%
}
	
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(con!=null) con.close();
	}catch(Exception e1){
		e1.printStackTrace();
	}
}


%>


</body>
</html>