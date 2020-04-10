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
   
    String id;
    String pw;
    String name;
    int hobby1;
    int hobby2;
    int hobby3;
    int hobby4;
    String gender;
    String address;
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
<h2>KOITT 회원정보 현황</h2>
<table>
<tr>
<th>아이디</th>
<th>패스워드</th>
<th>이름</th>
<th>취미1</th>
<th>취미2</th>
<th>취미3</th>
<th>취미4</th>
<th>성별</th>
<th>주소</th>
</tr>
<%

try{
//jdbc 드라이버 연결
Class.forName("oracle.jdbc.driver.OracleDriver");//자바에 있는 톰캣 컨테이너가 jdbc에 연결이 된다.
//Connection 연결
conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234"); //jdbc와 오라클이 연결된다.
//sql 실행 객체 sql구문을 실행할 수 있는 객체이다.
stmt=conn.createStatement();//이제 sql구문을 넣을수 있는 창이 만들어지는 거다.
String sql="select * from member2";// 그래서 이렇게 sql구문을 이용해 자료를 가져온다.
rs=stmt.executeQuery(sql);// 그렇게 가져온 자료를 resultset에 담아서 톰캣에 넘겨준다.

while(rs.next()){// 그리고 rs.next()를 이용해서 자료가 있으면 자료를 전달한다. getString getInt... 등등으로 자료를 받아서 out.print
	
	out.println("<tr>");
	out.println("<td>"+rs.getString("id")+"</td>");
	out.println("<td>"+rs.getString("pw")+"</td>");
	out.println("<td>"+rs.getString("name")+"</td>");
	out.println("<td>"+rs.getInt("hobby1")+"</td>");
	out.println("<td>"+rs.getInt("hobby2")+"</td>");
	out.println("<td>"+rs.getInt("hobby3")+"</td>");
	out.println("<td>"+rs.getInt("hobby4")+"</td>");
	out.println("<td>"+rs.getString("gender")+"</td>");
	out.println("<td>"+rs.getString("address")+"</td>");
	out.println("</tr>");
}
	
}catch(Exception e){
	e.printStackTrace();
}finally{
	try{
		if(rs!=null) rs.close();//이 통로를 계속 유지하면 서버가 다운될 수 있다.그래서 연결한 역순으로 연결을 풀어준다.
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