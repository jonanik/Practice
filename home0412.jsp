<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%!Connection con;
	Statement stmt;
	ResultSet rs;

	String code;
	String id;
	String pw;%>
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
	<h2>테스트</h2>
	<table>
		<tr>
			<th>코드</th>
			<th>아이디</th>
			<th>패스워드</th>
		</tr>

	
	<%
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ora_user1", "1234");
			stmt = con.createStatement();
			String sql = "select * from member";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>" + rs.getString("code") + "</td>");
				out.println("<td>" + rs.getString("id") + "</td>");
				out.println("<td>" + rs.getString("pw") + "</td>");
				out.println("</tr>");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	%>
	</table>
</body>
</html>