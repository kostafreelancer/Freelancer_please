<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"

import="java.lang.*, java.util.*, java.util.Date, java.text.*, java.text.SimpleDateFormat, java.text.ParseException"

import="java.sql.*, java.net.*, javax.mail.*, javax.mail.internet.*, javax.activation.*" %>

<html><head><title>메일 작성 폼</title></head>
<body>
<form action="sendMail.jsp" method="post">
<table border="1" cellpadding="0" cellspacing="0">
<tr>
   <td>SMTP서버</td>
   <td><input type="text" name="smtpServer" size="20"></td>
</tr>
<tr>
   <td>STMP 서버 계정</td>
   <td><input type="text" name="serverAccount" size="10"></td>
</tr>
<tr>
   <td>보내는 이메일</td>
   <td><input type="text" name="senderEmail" size="30"></td>
</tr>
<tr>
   <td>받는 이메일</td>
   <td><input type="text" name="receiverEmail" size="30"></td>
</tr>
<tr>
   <td>제목</td>
   <td><input type="text" name="subject" size="50"></td>
</tr>
<tr>
   <td>내용</td>
   <td><textarea name="content" rows="8" cols="50"></textarea></td>
</tr>
<tr>
   <td colspan="2"><input type="submit" value="전송"></td>
</tr>
</table>
</form>
</body></html>




