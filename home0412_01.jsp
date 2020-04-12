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
    
    String name;
    int age;
    String address;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
h2{width:1000px; margin: 30px auto; text-align: center; font-size: 30px;}
table{width:1000px; border-collapse: collapse;
text-align: center; font-size: 20px; margin: 50px auto;}
tr,th,td{border:1px solid black;}
</style>
</head>
<body>

<table>
<tr>
<th>이름</th>
<th>나이</th>
<th>주소</th>
</tr>
<%
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user1","1234");
stmt=con.createStatement();
String sql="select * from friend";
rs=stmt.executeQuery(sql);

while(rs.next()){
	out.println("<tr>");
	out.println("<td>"+rs.getString("name")+"</td>");
	out.println("<td>"+rs.getInt("age")+"</td>");
	out.println("<td>"+rs.getString("address")+"</td>");
	out.println("</tr>");
}
	
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