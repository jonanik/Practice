<%@page import="jsp_0424.Login"%>
<%@page import="java.util.ArrayList"%>


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
		ArrayList list = new ArrayList();
		Login log = null;
		for (int i = 0; i < 5; i++) {
			log = new Login();
			log.setNum(i + 1);
			log.setId("admin" + i);//admin0,admin1,admin2,admin3....
			log.setPw("abc" + i);//abc0,abc1,.....
			list.add(log);
		}
		//ArrayList 객체
		request.setAttribute("test", list);//1
		
		Login lo1=new Login(90,"naver","12345");
		//class 객체 1개
		request.setAttribute("ldto",lo1);
		
		
		
// 		--------------------------------------------------------------------------
  		//변수 1개
		request.setAttribute("user_id", "admin");//2
		request.setAttribute("user_pw", "1234");//3
		request.setAttribute("user_name", "홍길동");//4

		RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
		dispatcher.forward(request, response);
	%>
</body>
</html>