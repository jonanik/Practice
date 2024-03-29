<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>글수정</title>
  <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700,900&display=swap&subset=korean" rel="stylesheet">
  <link rel="stylesheet" href="css/style.css">
  <link rel="stylesheet" href="css/write.css">
</head>
<body>
<section>
    <h1>게시글 수정</h1>
    <hr>

    <form action="reply.do" name="reply" method="post">
      <table>
      <input type="hidden" name="bId" value="${reply_view.bId }">
      <input type="hidden" name="bGroup" value="${reply_view.bGroup }">
      <input type="hidden" name="bStep" value="${reply_view.bStep }">
      <input type="hidden" name="bIndent" value="${reply_view.bIndent }">
        <colgroup>
          <col width="15%">
          <col width="85%">
        </colgroup>
        <tr>
          <th>작성자</th>
          <td>
            <input type="text" name="bName"  >
          </td>
        </tr>
        <tr>
          <th>제목</th>
          <td>
            <input type="text" name="bTitle" value="<답변>${reply_view.bTitle }" >
          </td>
        </tr>
        <tr>
          <th>내용</th>
          <td>
            <textarea name="bContent" cols="50" rows="10">
            
            ----------------------------------
     		  [답글]
     		  ${reply_view.bContent }
            </textarea>
          </td>
        </tr>
        <tr>
          <th>이미지 표시</th>
          <td>
            <input type="file" name="file" id="file">
          </td>
        </tr>
      </table>
      <hr>
      <div class="button-wrapper">
        <button class="write">답변완료</button>
        <button class="cancel" onclick="javascript:location.href='list.do'">취소</button>
      </div>
    </form>

  </section>
</body>
</html>