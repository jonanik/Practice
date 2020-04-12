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
    
    int num;
    String name;
    int kor;
    int eng;
    int total;
    
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
<h2>학생성적 정보</h2>
<table>
<tr>
<th>학번</th>
<th>이름</th>
<th>국어</th>
<th>영어</th>
<th>합계</th>
</tr>

<%
try{
Class.forName("oracle.jdbc.driver.OracleDriver");//톰캣이랑 오라클jdbc랑 연결된다.
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user1","1234");//jdbc랑 오라클 db연결
stmt=con.createStatement();
String sql="select * from student";
rs=stmt.executeQuery(sql);
	
while(rs.next()){
	out.println("<tr>");
	out.println("<td>"+rs.getInt("num")+"</td>");
	out.println("<td>"+rs.getString("name")+"</td>");
	out.println("<td>"+rs.getInt("kor")+"</td>");
	out.println("<td>"+rs.getInt("eng")+"</td>");
	out.println("<td>"+rs.getInt("total")+"</td>");
	out.println("</tr>");
}
	
	
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(rs!=null) rs.close();
		if(stmt!=null)stmt.close();
		if(con!=null)con.close();
	}catch(Exception e1){
		e1.printStackTrace();
	}
}






%>
</table>
</body>
</html>