<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    String id;
    String pw;
    String name;
    String phone;
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h2{width:1000px; margin: 30px auto; text-align: center; font-size: 30px;}
table{width:1000px; border-collapse: collapse;
text-align: center; font-size: 20px; margin: 50px auto;}
tr,th,td{border:1px solid black;}
</style>
</head>
<body>
<h2>회원 정보</h2>
<table>
<tr>
<th>아이디</th>
<th>패스워드</th>
<th>이름</th>
<th>전화번호</th>
</tr>
<%
request.setCharacterEncoding("utf-8");

try{
	Class.forName("oracle.jdbc.driver.OracleDriver");//톰캣을 jdbc에 연결한다.
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");//jdbc를 오라클에 연결한다.
	stmt=con.createStatement();//statement 연결
	String in1=request.getParameter("name");
	String in2=request.getParameter("id");
	out.println(in1+"<br>");
	String sql="select * from member where name like '%"+in1+"%' order by id desc";
	String sql2="select * from member where id= '"+in2+"'";
	rs=stmt.executeQuery(sql);
	while(rs.next()){
		out.println("<tr>");
		out.println("<td>"+rs.getString("id")+"</td>");
		out.println("<td>"+rs.getString("pw")+"</td>");
		out.println("<td>"+rs.getString("name")+"</td>");
		out.println("<td>"+rs.getString("phone")+"</td>");
		out.println("</tr>");
	}
	out.println("<a href='form.html'>다시 검색하기</a>");
	
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(con!=null) con.close();
	}catch(Exception e1){
		e1.printStackTrace();
	}
}


%>

</table>


</body>
</html>