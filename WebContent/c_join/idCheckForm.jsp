<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="c_join_css/join.css" type="text/css" media="screen" />
<link rel="stylesheet" href="c_join_css/reset.css" type="text/css" media="screen" />
<title>아이디 중복확인</title>
<script type="text/javascript" src="c_join_js/c_join_step3.js"></script>
</head>
<body onload="pValue()">
<div id="wrap">
	<br>
	<br><font size="4" color="gray" >아이디 중복체크</font><br>
	<hr size="1">
	<br>
	<div id="chk">
		<form id="checkForm" action="check.e_join">
			<input type="text" name="idinput" id="userId">
			<input type="submit" value="중복확인" onclick="idCheck()">
        </form>
    <div id="msg"></div>
        <br>
        <input id="cancelBtn" type="button" value="취소" onclick="window.close()"><br>
        <input id="useBtn" type="button" value="사용하기" onclick="sendCheckValue()">
	</div>
</div>
</body>
</html>