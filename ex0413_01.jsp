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
    String sort1;
    String sql;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
*{padding:0; margin:0;}
h2{width:400px; margin:20px auto; text-align: center; }
table{
width:800px; box-sizing:border-box;
border-collapse: collapse; border:1px solid black;
font-size:15px; margin:0 auto; }
th,td{border: 1px solid black; text-align: center;}
th{width:200px; height:50px;}
td{height:40px;}
</style>
</head>
<body>
<h2>사원정보</h2>
<table>
<tr>
<th>사원번호</th>
<th>사원이름</th>
<th>월급</th>
<th>직위</th>
</tr>
<%
request.setCharacterEncoding("utf-8");
String name=request.getParameter("name");
String input1=request.getParameter("input1");
String input2=request.getParameter("input2");
String select=request.getParameter("select");
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user1","1234");
stmt=con.createStatement();


String sort=request.getParameter("sort");
switch(sort){
case "emp_id_low":
	sort1="order by employee_id asc";
	break;
case "emp_id_high":
	sort1="order by employee_id desc";
	break;
case "salary_low":
	sort1="order by salary asc";
	break;
case "salary_high":
	sort1="order by salary desc";
	break;
}
switch(select){
case "name":
	sql="select * from employees where salary between "+input1+" and "+input2+" "+sort1+"";
break;
case "salary":
	sql="select * from employees where emp_name like '%"+name+"%' "+sort1+"";
break;
}
// String sql1="select * from employees where salary between "+input1+" and "+input2+" "+sort1+"";
// String sql="select * from employees where emp_name like '%"+name+"%' "+sort1+"";
rs=stmt.executeQuery(sql);
	while(rs.next()){
		out.println("<tr>");
		out.println("<td>"+rs.getInt("employee_id")+"</td>");
		out.println("<td>"+rs.getString("emp_name")+"</td>");
		out.println("<td>"+rs.getInt("salary")+"</td>");
		out.println("<td>"+rs.getString("job_id")+"</td>");
		out.println("<tr>");
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