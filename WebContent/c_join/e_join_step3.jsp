<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="c_join_css/join.css" type="text/css" media="screen" />
<link rel="stylesheet" href="c_join_css/reset.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../common/header.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../common/footer.css" type="text/css" media="screen" />
<title>회원가입</title>
<script src="http://code.jquery.com/jquery-1.6.3.min.js"></script>
<script type="text/javascript" src="../common/header.js"></script>
<script type="text/javascript" src="c_join_js/c_join_step3.js"></script>
</head>
<body>
<%@include file="../c_common/header.jsp" %>

	<div id="conainer">
		<div id="nav">
			<div class="nav_txt">
				<p>
					<a href="/index.php">Home</a> <span class="padd">&gt;</span> <span>회원가입</span>
				</p>
			</div>
		</div>
		<div id="content">
			<div class="tit_box">
				<h2>회원가입</h2>
				<p class="tit_txt">
					성공적인 프로젝트를 원하시나요?<span>검증된 IT 인재가 대기중입니다.</span>
				</p>


			</div>
			<!-- //tit_box : e -->
			<ul class="step_cont03">
				<li class="step01"><span>Step01</span>회원안내</li>
				<li class="step02"><span>Step02</span>실명확인/약관동의</li>
				<li class="step03"><span>Step03</span>회원정보입력</li>
				<li class="step04"><span>Step04</span>가입완료</li>
			</ul>
			<div class="tb_box">
				<div class="ct overf">
					<h4 class="fl">아이디 및 비밀번호</h4>
					<p class="star_txt">
						<span class="color_or">(*)</span>표시는 필수 입력사항입니다
					</p>
				</div>
				<table class="tb_st01">
					<form name="MemberWriteFm" method="post" action="member_write.php">
						<input type="hidden" name="fm_type" value="바이어"> <input
							type="hidden" name="fm_format" value="기업"> <input
							type="hidden" name="fm_str"
							value="Zm1fbmFtZT0mZm1fanVtaW49LTk5OTk5OSZzdHJWbm89"> <input
							type="hidden" name="fm_keyword" value=""> <input
							type="hidden" name="strPageCode1"
							value="ZXdMZjhRelA5Z1FXbTJWZ0Zpa0R2SzRMSWU="> <input
							type="hidden" name="fm_join" value="">
						<caption></caption>
						<colgroup>
							<col style="width: 16%" />
							<col style="width: 34%" />
							<col style="width: 16%" />
							<col style="width: 34%" />
						</colgroup>
						<tbody>
							<tr>
								<th scope="row" class="ac"><label for="fm_id"><span
										class="txt_or">*</span> 회원아이디</label></th>
								<td colspan="3"><input type="text" id="fm_id" name="fm_id"
									class="" /> <a href="javascript:IDCheckIt();"
									class="btn_overlap">중복확인</a> <input type="hidden" name="idcheck" id="idcheck"> 
									* 6~15자의 영문, 영문+숫자, 일부 특수문자( _ - )만 사용 가능합니다.</td>
							</tr>
							<tr>
								<th scope="row" class="ac"><label for="fm_passwd1"><span
										class="txt_or">*</span> 비밀번호</label></th>
								<td><input type="password" id="fm_passwd1"
									name="fm_passwd1" class="wid02" /></td>
								<th scope="row" class="ac"><label for="fm_passwd2"><span
										class="txt_or">*</span> 비밀번호 확인</label></th>
								<td><input type="password" id="fm_passwd2"
									name="fm_passwd2" class="wid02" /></td>
							</tr>
						</tbody>
				</table>
			</div>
			<!-- //tb_box01 : e -->
			<div class="tb_box">
				<h4 class="fl">기업정보</h4>
				<table class="tb_st01">
					<caption></caption>
					<colgroup>
						<col style="width: 16%" />
						<col style="width: 35%" />
						<col style="width: 17%" />
						<col style="width: *" />
					</colgroup>
					<tbody>
						<tr>
							<th scope="row"><label for="fm_name"><span
									class="txt_or">*</span> 가입자명</label></th>
							<td colspan="3"><input type="text" id="fm_name"
								name="fm_name" class="wid04" /></td>
						</tr>
						<tr>
							<th scope="row"><label for="fm_comname"><span
									class="txt_or">*</span> 회사명</label></th>
							<td colspan="3"><input type="text" id="fm_comname"
								name="fm_comname" class="wid" /></td>
						</tr>
						<tr>
							<th scope="row"><label for="fm_ceoname"><span
									class="txt_or">*</span> 대표자명</label></th>
							<td><input type="text" id="fm_ceoname" name="fm_ceoname"
								class="wid" /></td>
							<th scope="row"><span class="txt_or">*</span> 사업자 등록번호</th>
							<td><label for="fm_comssn1"></label> <input type="text"
								id="fm_comssn1" name="fm_comssn1" class="wid03" maxlength="3" />
								- <label for="fm_comssn2"></label> <input type="text"
								id="fm_comssn2" name="fm_comssn2" class="wid03" maxlength="2" />
								- <label for=""></label> <input type="text" id="fm_comssn3"
								name="fm_comssn3" class="wid03" maxlength="5" /></td>
						</tr>
						<tr>
							<th scope="row"><label for="fm_bizcontents"><span
									class="txt_or">*</span> 주요사업내용</label></th>
							<td colspan="3"><input type="text" id="fm_bizcontents"
								name="fm_bizcontents" class="wid" /></td>
						</tr>
						<tr>
							<th scope="row"><label for="fm_managername"><span
									class="txt_or">*</span> 담당자명</label></th>
							<td><input type="text" id="fm_managername"
								name="fm_managername" class="wid04" /></td>
							<th scope="row"><label for="fm_phone1"><span
									class="txt_or">*</span> 담당자 연락처</label></th>
							<td><label for="fm_phone1"></label> <select class="wid03"
								name="fm_phone1" id="fm_phone1">
									<option value="">----</option>
									<option value="010">010</option>
									<option value="011">011</option>
									<option value="016">016</option>
									<option value="017">017</option>
									<option value="018">018</option>
									<option value="019">019</option>
							</select> <span>-</span> <label for=""></label> <input type="text"
								id="fm_phone2" name="fm_phone2" class="wid03" maxlength="4">
								<span>-</span> <label for=""></label> <input type="text"
								id="fm_phone3" name="fm_phone3" class="wid03" maxlength="4">
							</td>
						</tr>
						<tr>
							<th scope="row"><label for="fm_tel1"><span
									class="txt_or">*</span> 연락처(대표전화)</label></th>
							<td colspan="3"><label for="fm_tel1"></label> <select
								class="wid03" name="fm_tel1" id="fm_tel1">
									<option value="">----</option>
									<option value="02">02</option>
									<option value="031">031</option>
									<option value="032">032</option>
									<option value="033">033</option>
									<option value="041">041</option>
									<option value="042">042</option>
									<option value="043">043</option>
									<option value="051">051</option>
									<option value="052">052</option>
									<option value="053">053</option>
									<option value="054">054</option>
									<option value="055">055</option>
									<option value="061">061</option>
									<option value="062">062</option>
									<option value="063">063</option>
									<option value="064">064</option>
									<option value="070">070</option>
									<option value="0502">0502</option>
									<option value="0504">0504</option>
									<option value="0505">0505</option>
									<option value="0506">0506</option>
									<option value="0130">0130</option>
							</select> <span>-</span> <label for="fm_tel2"></label> <input type="text"
								id="fm_tel2" name="fm_tel2" class="wid03" maxlength="4">
								<span>-</span> <label for="fm_tel3"></label> <input type="text"
								id="fm_tel3" name="fm_tel3" class="wid03" maxlength="4">
							</td>
						</tr>
						<tr>
							<th><span class="txt_or">*</span> 이메일</th>
							<td colspan="3"><label for="fm_email11"></label> <input
								type="text" id="fm_email11" name="fm_email11" class="wid04">
								<span>@</span> <label for="fm_email12"></label> <input
								type="text" id="fm_email12" name="fm_email12" class="wid04">
								<label for="fm_emailSel1"></label> <select class="wid04"
								name="fm_emailSel1" id="fm_emailSel1"
								onChange="javascript:ChangeEMailIt('1');">
									<option value="">선택해주세요.</option>
									<option value="etc">직접입력</option>
									<option value="gmail.com">gmail.com</option>
									<option value="naver.com">naver.com</option>
									<option value="nate.com">nate.com</option>
									<option value="daum.net">daum.net</option>
									<option value="dreamwiz.com">dreamwiz.com</option>
									<option value="lycos.co.kr">lycos.co.kr</option>
									<option value="empal.com">empal.com</option>
									<option value="yahoo.co.kr">yahoo.co.kr</option>
									<option value="chol.com">chol.com</option>
									<option value="korea.com">korea.com</option>
									<option value="paran.com">paran.com</option>
									<option value="hanafos.com">hanafos.com</option>
									<option value="hanmir.com">hanmir.com</option>
									<option value="hotmail.com">hotmail.com</option>
									<option value="hanmail.net">hanmail.net</option>
							</select></td>
						</tr>
						<tr>
							<th><span class="txt_or">*</span> 회사주소</th>
							<td colspan="3">
								<div class="mb10">
									<label for="fm_zip"></label> <input type="text" id="fm_zip"
										name="fm_zip" class="wid60"
										onclick="openDaumPostCode(); return false;" readonly>
									<a href="#" onclick="openDaumPostCode(); return false;"
										class="btn_add">우편번호찾기</a>
								</div>
								<div>
									<label for="fm_address"></label> <input type="text"
										id="fm_address" name="fm_address" class="wid">
								</div>
							</td>
						</tr>

						<tr>
							<th><label for="fm_homepage">회사 홈페이지</label></th>
							<td colspan="3">
								<div>
									<span>http://</span> <input type="text" id="fm_homepage"
										name="fm_homepage" class="wid06">
								</div>
							</td>
						</tr>
						<tr>
							<th><span class="txt_or">*</span> 사업자등록증</th>
							<td colspan="3">
								<div>
									<input type="file" id="fm_file3" name="fm_file3" class="wid06">
								</div>
							</td>
						</tr>

					</tbody>
				</table>
			</div>

			<div class="btn_box">
				<a href="c_join_step4.jsp" class="btn_check04">회원가입</a> <a
					href="javascript:MemberWriteFm.reset();" class="btn_check02">초기화</a>
			</div>
		</div>



<%@include file="../c_common/footer.jsp" %>

</body>
</html>