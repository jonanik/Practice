<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <style>
        body{
            background: #efefef;
            margin: 0px;
            padding: 0px;
        }
        .container{
            width: 700px;
            margin: 0 auto;
            font-size: 12.5px;
        }
        .log_area{
            box-sizing: border-box;
            margin: 100px auto;
            padding-left: 23px;
            border: 1px solid #e5e5e5;
            width: 330px;
            height: 120px;
            background: #fff;
        }
        button{
            outline: 0;
            border: 0;
            width: 280px;
            height: 37px;
            background-color: #1EC800;
            color: white;
            cursor: pointer;
            font-weight: bold;
        }
        .id_pw_jn{
            margin-top: 5px;
            font-size: 11.5px;
        }
         #nick_area{
            font-weight: bold;
        }
        .outBtn{
            position: absolute;
            display: inline-block;
            margin: 0 19px 19px;
            width: 70px;
            height: 25px;
            bottom: 0;
            right: 0;
            background: white;
            outline:0;
            border: 1px solid #e5e5e5;
        }
        .log_area2{
            box-sizing: border-box;
            margin: 100px auto;
            padding-top: 20px;
            padding-left: 23px;
            border: 1px solid #e5e5e5;
            width: 330px;
            height: 120px;
            background: #fff;
            position: relative;
        }
        a{
            text-decoration: none;
            color: black;
        }
    </style>
  </head>
  <body>

  <!-- 로그인 안된 페이지 -->
    <div class="container">
      <div class="log_area">
        <p>네이버를 더 안전하고 편리하게 이용하세요.</p>
        <div>
          <a href="login.html"><button>NAVER 로그인</button></a>
        </div>
        <div class="id_pw_jn">
          <span>아이디</span>
          <span>비밀번호 찾기</span>
          <span><a href="join.html">회원가입</a></span>
        </div>
      </div>
    </div>
  }
  

   
    <!-- 로그인 된 페이지 -->
     <div class="container">
      <div class="log_area2">
        <span id="nick_area"></span>닉네임<span> 님</span>
        <br>회원정보수정
        <button class="outBtn"><a href="">회원정보 수정</a></button><br>
        <button class="outBtn"><a href="">로그아웃</a></button>
      </div>
    </div>
 
    
  </body>
</html>