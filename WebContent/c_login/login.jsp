<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../c_join/c_join_css/join.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../c_join/c_join_css/reset.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../common/header.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../common/footer.css" type="text/css" media="screen" />
<title>로그인</title>
<script src="http://code.jquery.com/jquery-1.6.3.min.js"></script>
<script type="text/javascript" src="../common/header.js"></script>
</head>


<body onload = 'document.MemberLoginFm.fm_id.focus();'>
<%@include file="../c_common/header.jsp" %>
    <div  id="conainer">
    	<div id="nav">
        	<div class="nav_txt">
            	<p>
                	<a href="/index.php">Home</a>
                    <span class="padd">&gt;</span>
                	<span>로그인</span>
            	</p>
            </div>
        </div>
        <!-- //nav : e -->
        <div id="content">
        	<div class="login_cont">
            	<h2>LOGIN<span>DreamLancer 1TO1 로그인</span></h2>
                	<div class="log_box">
                    	<div class="log_lef">
                        	<p>로그인을 위해 아이디와 패스워드를 입력해 주세요.</p>
							<form method="post" name="MemberLoginFm" action="checking.c_login" >
							<input type="hidden" name="fm_url" value="">
							<input type="hidden" name="fm_str" value="">
                            <label for="fm_id" class="tx_skip">아이디 입력</label>
                            <div><input type="text" id="fm_id"  class="log_inp01" name="c_id" /></div>
                            <div><input type="password" id="fm_passwd" class="log_inp02" name="pwd" onKeyPress="javascript:LoginEnterCheck();" /></div>
                            <label for="fm_passwd" class="tx_skip">비밀번호 입력</label>
                            <div class="login_check">
                                <p class="fl">
                                    <input type="checkbox" id="saveID" name="saveID" value="Y" checked="checked"/>
                                    <label for="saveID">로그인 상태유지</label>
                                </p>
                                <a href="javascript:FindID();" class="pass_find">아이디 패스워드 찾기 &gt;</a>
                             </div>
                            <p>
                                <!-- <a href="javascript:LoginCheckIt();" class="btn_login">로그인</a> -->
                                <input type="submit" value="로그인 ">
								<a href="/08_MELC/member/member_join.php" class="btn_join">회원가입</a>
                            </p>
							</form>
                        </div>
                       
                    </div>
                    <!-- log_box : e -->
            </div>
            <!-- login_cont : e -->
        </div>
    </div>
	<form method="post" name="HiddenFrame" style="display:inline;" onSubmit="return false;">
	<input type="hidden" name="fm_type" value="">
	<input type="hidden" name="fm_format" value="">
	</form>
	<!-- container : e -->


	</div>


   
    </div>
 
  
</div>
<!-- //wrap : e -->
<%@include file="../c_common/footer.jsp" %>
</body>
</html>