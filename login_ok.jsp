<%@page import="com.javalec.ex.MemberDto"%>
<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%//폼태그로 넘어온 데이터 한글처리
    request.setCharacterEncoding("utf-8");
    String id=request.getParameter("id");
    String pw=request.getParameter("pw");
    // MemberDao mdao= new MemberDao(); 와 같음
  MemberDao mdao=  MemberDao.getInstance();
  int check=  mdao.userCheck(id,pw);//리턴값 1,0,-1
  if(check==-1){
%>	 
<script type="text/javascript">
alert("아이디가 존재하지 않습니다. 다시 입력하세요.");
history.back();
</script>
 
  <%} else if(check==0){ %>
    <script type="text/javascript">
alert("패스워드가 일치하지 않습니다. 다시 입력하세요.");
history.back();
</script>
<%}else if(check==1){
	MemberDto mdto=mdao.getMember(id);
//<!--닉네임을 가져와야할 경우 -->
//<!-- id,pw,name,authUser -->
session.setAttribute("id",id);
session.setAttribute("pw",pw);
session.setAttribute("name",mdto.getName());
session.setAttribute("authUser",id);
response.sendRedirect("main.jsp");

}%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>