<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="styleSheet" href="css/admin.css">
</head>
<body>
<%
   if(session.getAttribute("aId")!=null){
 %> 
	<div id="div1">
		<button id="div1_logout" onclick="location.href='logout.do'">로그아웃</button>
		<div id="div1_1">
			<button id="div1_1_menu"></button>
			<img src="images/admin/logo.png">
			
		</div>
		<div id="div1_2">
			<ul>
				<li id="div1_2_img1"><a href=""></a></li>
				<li id="div1_2_img2"><a href="main.jsp"></a></li>
				<li id="div1_2_3"><a href="" target=""></a>부가서비스</li>
				<li><button id="div1_2_4">
						관리자
						<div id="op_btn"></div>
					</button></li>
			</ul>
		</div>
	</div>
	
	<div id="div2">
		<button id="menu1"></button>
		<h3>관리자 메인</h3>
	</div>
	<div id="big">
	<nav id="sidemenu">
		<div>
			<ul>
				<li id="menu2"></li>
				<li id="menu3"></li>
				<li id="menu4"></li>
				<li id="menu5"></li>
				<li id="menu6"></li>
			</ul>
		</div>
	</nav>
	<div id="div3">
		<h2>신규가입회원 목록</h2>
		<div id="div3-1">총회원수 2,248명 중 차단 0명, 탈퇴 : 34명</div>
		<div id="div3-2">
			<table id="div3-table1">
				<thead>
					<tr>
						<th id="th1">회원 아이디</th>
						<th id="th2">이름</th>
						<th id="th3">회원등급</th>
						<th id="th4">성별</th>
						<th id="th5">연락처</th>
						<th id="th6">주소</th>
						<th id="th7">SMS수신여부</th>
					</tr>
				</thead>
				<tbody>
					<!-- 1 -->
					<tr id="tr1">
						<td>anock5</td>
						<td><img class="noprofile" alt="사람모양" src="images/admin/no_profile.gif">조요한</td>
						<td>3</td>
						<td>남자</td>
						<td>010-5544-2361</td>
						<td>경기도 군포시 금정동 042-32번지</td>
						<td>아니오</td>
					</tr>
					<!-- 2 -->
					<tr id="tr2">
						<td>yehdf1</td>
						<td><img class="noprofile" alt="사람모양" src="images/admin/no_profile.gif">강감찬</td>
						<td>2</td>
						<td>남자</td>
						<td>010-4323-5312</td>
						<td>경기도 군포시 아무동 0-0번지</td>
						<td>예</td>
					</tr>
					<!-- 3 -->
					<tr id="tr3">
						<td>bidh3</td>
						<td><img class="noprofile" alt="사람모양" src="images/admin/no_profile.gif">이순신</td>
						<td>2</td>
						<td>남자</td>
						<td>010-4345-1264</td>
						<td>서울시 마포구 아무동 1-2번지</td>
						<td>아니오</td>
					</tr>
					<!-- 4 -->
					<tr id="tr4">
						<td>df3r4</td>
						<td><img class="noprofile" alt="사람모양" src="images/admin/no_profile.gif">안영미</td>
						<td>4</td>
						<td>여자</td>
						<td>010-5655-9864</td>
						<td>충북 아무구 아무동 3-2번지</td>
						<td>아니오</td>
					</tr>
					<!-- 5 -->
					<tr id="tr5">
						<td>fveff2</td>
						<td><img class="noprofile" alt="사람모양" src="images/admin/no_profile.gif">이순희</td>
						<td>1</td>
						<td>여자</td>
						<td>010-6964-7864</td>
						<td>제주시 아무구 아무동 65-3번지</td>
						<td>예</td>
					</tr>


				</tbody>

			</table>
			<div class="moreInfo"><a href="admin_memList.html"><button class=infobtn>회원 전체보기</button></a></div>
		</div>
		<h2>공지사항</h2>
		<div id="div3-3">
			<table id="div3-table1">
				<thead>
					<tr>
						<th id="th1">글 번호</th>
						<th id="th2">게시판</th>
						<th id="th3">글 제목</th>
						<th id="th4">조회수</th>
						<th id="th5">작성일</th>
						
					</tr>
				</thead>
				<tbody>
					<!-- 1 -->
					<c:forEach var="list" items="${list }" end="4">
					<tr id="tr1">
						<td>${list.bid }</td>
						<td>고객행복센터</td>
						<td>${list.btitle }</td>
						<td>${list.bhit }</td>
						<td>${list.bdate }</td>
					</tr>
					</c:forEach>	
				</tbody>

			</table>
			<div class="moreInfo"><a href="moreList.do"><button class=infobtn>공지사항 더 보기</button></a></div>
		</div>
		<h2>이벤트</h2>
		<div id="div3-4">
			<table id="div3-table1">
				<thead>
					<tr>
						<th id="th1">글번호</th>
						<th id="th2">이벤트 제목</th>
						<th id="th3">작성자</th>
						<th id="th4">이벤트기간</th>
						
					</tr>
				</thead>
				<tbody>
					<!-- 1 -->
					<tr id="tr1">
						<td>1</td>
						<td>[쿡킷]3월 돌밤돌밤 해결사 쿡킷!</td>
						<td>관리자</td>
						<td>2020.03.13~2020.03.31</td>
						
					</tr>
					<!-- 2 -->
					<tr id="tr2">
						<td>2</td>
						<td>[3월]힘내라! 대한민국! 프로모션</td>
						<td>관리자</td>
						<td>2020.03.03~2020.03.26</td>
						
					</tr>
					<!-- 3 -->
					<tr id="tr3">
						<td>3</td>
						<td>스탬프 쾅!쾅! 혜택이 팡!팡!</td>
						<td>관리자</td>
						<td>2020.03.04~2020.12.31</td>
						
					</tr>
					<!-- 4 -->
					<tr id="tr4">
						<td>4</td>
						<td>첫 구매시 무료배송&최대 만원 할인쿠폰 혜택</td>
						<td>관리자</td>
						<td>2019.06.24~2020.06.30</td>
						
					</tr>
					<!-- 5 -->
					<tr id="tr5">
						<td>5</td>
						<td>쿡킷 이달의 카드사 청구할인</td>
						<td>관리자</td>
						<td>2020.03.01~2020.03.31</td>
						
					</tr>


				</tbody>

			</table>
			<div class="moreInfo"><a href="adminEventTList.jsp"><button class=infobtn>이벤트 더보기</button></a></div>
		</div>
	</div>
	</div>
<footer>

<p>Copyright © demo.sir.kr. All rights reserved. YoungCart Version 5.4.2.3.1</p>
</footer>



<% }else{
 	response.sendRedirect("adminLogin.jsp");
}
%>
</body>

</html>