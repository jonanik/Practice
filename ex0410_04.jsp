<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
try{
Class.forName("oracle.jdbc.driver.OracleDriver");//톰캣과 jdbc를 연결한다.
//connection 연결  얘는 jdbc와 오라클 db를 연결한다.
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
stmt=con.createStatement(); //이 객체는 sql 구문을 실행 시킬수 있는 객체 생성
String sql="select * from member5";
rs=stmt.executeQuery(sql);
	
while(rs.next()){
	int stu_num=rs.getInt("stu_num");
	int grade=rs.getInt("grade");
	String name=rs.getString("name");
	int pay=rs.getInt("pay");
	String pay_str="";
	switch(pay){
	case 0:
		pay_str="아니오";
		break;
	case 1:
		pay_str="예";
		break;
	}
	String subject=rs.getString("subject");
	int fee=rs.getInt("fee");
	String method=rs.getString("method");
	
	out.println("학생번호:"+stu_num+"<br>");
	out.println("학년:"+grade+"<br>");
	out.println("이름:"+name+"<br>");
	out.println("지불여부:"+pay_str+"<br>");
	out.println("과목:"+subject+"<br>");
	out.println("수강료:"+fee+"<br>");
	out.println("납부방식:"+method+"<br>");
}

}catch(Exception e){
//jdbc연결하는 부분
	
}finally{
	try{
		if(rs !=null) rs.close();
		if(stmt !=null) stmt.close();
		if(con !=null) con.close();
	}catch(Exception e2){
		
	}
}

%>
</body>
</html>