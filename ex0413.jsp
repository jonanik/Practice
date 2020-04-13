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
    
    int imployee_id;
    String emp_name;
    float salary;
    String job_id;
    
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
<th>사원번호</th>
<th>사원이름</th>
<th>월급</th>
<th>부서명</th>
</tr>
<%
request.setCharacterEncoding("utf-8");

try{
	Class.forName("oracle.jdbc.driver.OracleDriver");//톰캣을 jdbc에 연결한다.
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");//jdbc를 오라클에 연결한다.
	stmt=con.createStatement();//statement 연결
	String in1=request.getParameter("salary1");
	String in2=request.getParameter("salary2");
	
	out.println(in1+"<br>");
	out.println(in2+"<br>");
	
	String sql="select employee_id,emp_name,salary,job_id from employees where salary between "+in1+" and "+ in2+" order by employee_id asc";	
	String sql2="select employee_id,emp_name,salary,job_id from employees where salary >="+in1+"and salary<="+ in2+" order by employee_id asc";	
// 	String sql2="select * from member where id= '"+in2+"'";
	rs=stmt.executeQuery(sql2);
	while(rs.next()){
		out.println("<tr>");
		out.println("<td>"+rs.getInt("employee_id")+"</td>");
		out.println("<td>"+rs.getString("emp_name")+"</td>");
		out.println("<td>"+rs.getFloat("salary")+"</td>");
		out.println("<td>"+rs.getString("job_id")+"</td>");
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