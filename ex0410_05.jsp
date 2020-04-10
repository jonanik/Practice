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

	String instrument;
	String code;
	String name;
	String landlord;
	String guarantee;
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
<h2>악기대여 현황</h2>
<table>
<tr>
<th>악기</th>
<th>상품코드</th>
<th>상품명</th>
<th>임대인</th>
<th>보증여부</th>
<th>전화번호</th>
</tr>

	<%

		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ora_user", "1234");
		stmt = con.createStatement();
		String sql = "select * from instrument";
		rs = stmt.executeQuery(sql);
		while(rs.next()){
			
			out.println("<tr>");
			out.println("<td>"+rs.getString("instrument")+"</td>");
			out.println("<td>"+rs.getString("code")+"</td>");
			out.println("<td>"+rs.getString("name")+"</td>");
			out.println("<td>"+rs.getString("landlord")+"</td>");
			out.println("<td>"+rs.getString("guarantee")+"</td>");
			out.println("<td>"+rs.getString("phone")+"</td>");
			out.println("</tr>");
			
			
		}

		} catch (Exception e) {

		} finally {
			try {

			} catch (Exception e2) {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			}
		}
	%>

</table>
</body>
</html>