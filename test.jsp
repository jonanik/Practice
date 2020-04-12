<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%!
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    String id;
    String pw;
    String name;
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>아이디</th>
<th>패스워드</th>
<th>이름</th>
</tr>
<%
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user1","1234");
	stmt=con.createStatement();
	String sql="select * from member1";
	rs=stmt.executeQuery(sql);
	
	while(rs.next()){
		out.println("<tr>");
		out.println("<td>"+rs.getString("id")+"</td>");
		out.println("<td>"+rs.getString("pw")+"</td>");
		out.println("<td>"+rs.getString("name")+"</td>");
		out.println("</tr>");
	}
	
	
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		
	}catch(Exception e1){
		e1.printStackTrace();
	}
}

%>
</table>
</body>
</html>