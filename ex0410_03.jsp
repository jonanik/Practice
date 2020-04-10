<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    Connection conn;
    Statement stmt;
    ResultSet rs;
    
    String num;
    String grade;
    String name;
    String pay;
    String subject;
    String money;
    String method;
    
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
<h2>학생정보 현황</h2>
<table>
<tr>
<th>번호</th>
<th>학년</th>
<th>이름</th>
<th>납부여부</th>
<th>과목</th>
<th>금액</th>
<th>납부유형</th>
</tr>
<%
try{
	//jdbc 드라이버 연결
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
	stmt=conn.createStatement();
	String sql="select * from member3";
	rs=stmt.executeQuery(sql);
	
	while(rs.next()){
		num=rs.getString("num");
		grade=rs.getString("grade");
		name=rs.getString("name");
		pay=rs.getString("pay");
		subject=rs.getString("subject");
		money=rs.getString("money");
		method=rs.getString("method");
		
		out.println("<tr>");
		out.println("<td>"+num+"</td>");
		out.println("<td>"+grade+"</td>");
		out.println("<td>"+name+"</td>");
		out.println("<td>"+pay+"</td>");
		out.println("<td>"+subject+"</td>");
		out.println("<td>"+money+"</td>");
		out.println("<td>"+method+"</td>");
		out.println("</tr>");
	}
		
	
	
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(rs!=null) rs.close();
		if(stmt!=null) stmt.close();
		if(conn!=null) conn.close();
	}catch(Exception e2){
		e2.printStackTrace();
	}
}



%>

</table>
</body>
</html>