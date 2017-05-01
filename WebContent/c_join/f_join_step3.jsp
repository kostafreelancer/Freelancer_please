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

				<div class="content">

			<ul class="step_cont03">
            	<li class="step01"><span>Step01</span>회원안내</li>
                <li class="step02"><span>Step02</span>실명확인/약관동의</li>
                <li class="step03"><span>Step03</span>회원정보입력</li>
                <li class="step04"><span>Step04</span>가입완료</li>
            </ul>
       		 <div class="tb_box">
             	<div class="ct overf">
                    <h4 class="fl">아이디 및 비밀번호</h4>
                    <p class="star_txt"><span class="color_or">(*)</span>표시는 필수 입력사항입니다</p>
                </div>
                <table class="tb_st01">
				<form name="MemberWriteFm" method="post" action="member_write.php" onSubmit="return false;">
					<input type="hidden" name="fm_type" value="이랜서">
					<input type="hidden" name="fm_format" value="개인">
					<input type="hidden" name="fm_str" value="Zm1fbmFtZT0mZm1fanVtaW49LTk5OTk5OSZzdHJWbm89">
					<input type="hidden" name="fm_keyword" value="">
					<input type="hidden" name="strPageCode1" value="ZU1MMDhkekg5NFEybTBWc0ZRa3B2RDRMSWU=">
					<input type="hidden" name="fm_join" value="">
                    <colgroup>
                        <col style="width:16%" />
                        <col style="width:34%" />
                        <col style="width:16%" />
                        <col style="width:34%" />
                    </colgroup>
                    <tbody>
                        <tr>
                            <th scope="row" class="ac"><label for="fm_id"><span class="txt_or">*</span> 회원아이디</label></th>
                            <td colspan="3">
                               <input type="text" id="fm_id" name="fm_id" />
                               <a href="javascript:IDCheckIt();" class="btn_overlap">중복확인</a>
                                * 6~15자의 영문, 영문+숫자, 일부 특수문자( _ - )만 사용 가능합니다.
								<input type="hidden" name="f_id" id="idcheck">
                            </td>
                        </tr>
                        <tr>
                             <th scope="row" class="ac"><label for="fm_passwd1"><span class="txt_or">*</span> 비밀번호</label></th>
                            <td>
                                <input type="password" id="fm_passwd1" name="f_pwd1"  class="wid02"/>
                            </td>
                             <th scope="row" class="ac"><label for="fm_passwd2"><span class="txt_or">*</span> 비밀번호 확인</label></th>
                            <td>
                                <input type="password" id="fm_passwd2" name="f_pwd2"  class="wid02"/>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <!-- //tb_box01 : e -->
            <div class="tb_box">
             	<h4 class="fl">개인정보</h4>
                <table class="tb_st01">
                     <colgroup>
                        <col style="width:16%" />
                        <col style="width:17%" />
                        <col style="width:*" />
                    </colgroup>
                    <tbody>
                        <tr>
                            <td rowspan="5">
                              	<img src="c_join_img/join_photo.jpg" alt="사진" />
								<input type="file" name="fm_file1" onchange="PreView(this.value, 'IMG1', '132', '176');" style="width:130px;" />
                                <!--<a href="#" class="photo_up">사진업로드</a>-->
                                <span class="pho_txt">최적 해상도:132x176 pixel</span>
                            </td>
                            <th scope="row"><label for="fm_name"><span class="txt_or">*</span> 성명</label></th>
                            <td>
                            	<input type="text" id="fm_name" name="f_name"  class="wid04" value=""/>
                            </td>
                        </tr>
                         <tr>
                            <th scope="row"><label for="fm_birth"><span class="txt_or">*</span> 생년월일</label></th>
                            <td>
                            	<input type="text" id="fm_birth" name="f_birth"  class="wid04" maxlength="6"/>
                                <select name="f_sex">
                                	<option value="1" selected>남자</option>
                                    <option value="2">여자</option>
                                </select>
                                <span class="mail_ma"> * 주민번호 앞 6자리를 입력해주세요.</span>
                            </td>
                        </tr>
                         <tr>
                            <th scope="row"><label for="fm_phone1"><span class="txt_or">*</span> 연락처(휴대폰)</label></th>
                            <td>
								<select name="f_phone1">
									<option value="" selected>----</option>
									<option value="010">010</option>
									<option value="011">011</option>
									<option value="016">016</option>
									<option value="017">017</option>
									<option value="018">018</option>
									<option value="019">019</option>
								</select>
                                    <span>-</span>
                                    <label for="fm_phone2"></label>
                                    <input type="text" id="fm_phone2" name="f_phone2" class="wid03" maxlength="4">
                                    <span>-</span>
                                    <label for="fm_phone3"></label>
                                    <input type="text" id="fm_phone3" name="f_phone3" class="wid03" maxlength="4">
                            </td>
                        </tr>
                        <tr>
                            <th scope="row"><label for="fm_tel1">연락처(전화)</label></th>
                            <td>
                            	  <label for="f_tel1"></label>
                                    <select class="wid03" name="fm_tel1">
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
                                    </select>
                                    <span>-</span>
                                    <label for="fm_tel2"></label>
                                    <input type="text" id="fm_tel2" name="f_tel2" class="wid03"  maxlength="4">
                                    <span>-</span>
                                    <label for="fm_tel3"></label>
                                    <input type="text" id="fm_tel3" name="f_tel3" class="wid03"  maxlength="4">
                            </td>
                        </tr>
                        <tr>
                        	<th><span class="txt_or">*</span> 이메일</th>
                            <td>
                                <label for="fm_email11"></label>
                                <input type="text" id="fm_email11" name="f_email" class="wid04">
                                <span>@</span>
                                <label for="fm_email22"></label>
                                <input type="text" id="fm_email12" name="f_email2" class="wid04">
                                <label for="fm_emailSel1"></label>
                                <select class="wid04" name="f_emailSel1" id="fm_emailSel1" onChange="javascript:ChangeEMailIt('1');">
									<option value="">선택해주세요.</option>
									<option value="etc">직접입력</option>
									<option value="gmail.com"> gmail.com</option>
									<option value="naver.com"> naver.com</option>
									<!--<option value="nate.com"> nate.com</option>-->
									<option value="daum.net"> daum.net</option>
									<option value="dreamwiz.com"> dreamwiz.com</option>
									<option value="lycos.co.kr"> lycos.co.kr</option>
									<option value="empal.com"> empal.com</option>
									<option value="yahoo.co.kr"> yahoo.co.kr</option>
									<option value="chol.com"> chol.com</option>
									<option value="korea.com"> korea.com</option>										
									<option value="paran.com"> paran.com</option>
									<option value="hanafos.com"> hanafos.com</option>
									<option value="hanmir.com"> hanmir.com</option>								
									<option value="hotmail.com"> hotmail.com</option>
									<option value="hanmail.net"> hanmail.net</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                        	<th><span class="txt_or">*</span>주소</th>
                            <td colspan="2">
                            	<div class="mb10">
                                	 <label for="fm_zip"></label>
                                    <input type="text" id="fm_zip" name="f_zip" class="wid60" onclick="openDaumPostCode(); return false;" readonly>
                                    <a href="#"  onclick="openDaumPostCode(); return false;" class="btn_add">우편번호찾기</a>
                                </div>
                                <div>
                                	 <label for="fm_address"></label>
                                    <input type="text" id="fm_address" name="f_address" class="wid">
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            
            <!-- //tb_box02 : e -->
            <div class="tb_box">
            	<h4 class="fl">전문분야</h4>
            	<table class="tb_st01">
                   <colgroup>
                        <col style="width:14%" />
                        <col style="width:*" />
                        <col style="width:15%" />
                        <col style="width:15%" />
                        <col style="width:15%" />
                        <col style="width:15%" />
                        <col style="width:14%" />
                    </colgroup>
                    <tbody>
                    	<tr>
                    		<th scope="row" colspan="2" class="ac"><span class="txt_or">*</span>주 분야</th>
                    		<td><input type="checkbox" name="f_major" value="f_major" > 개발</td>
                    		<td><input type="checkbox" name="f_major" value="f_major" > 디자인</td>
                    		<td><input type="checkbox" name="f_major" value="f_major" > 기획</td>
                    		<td colspan="2"></td>
                    		
                    	</tr>
                    
								</tbody>
						</table>
					</div>
					<!-- //tb_box01 : e -->


					<!-- //tb_box02 : e -->
					<div class="tb_box">
						<h4 class="fl">전문분야</h4>
						<table class="tb_st01">
							<colgroup>
								<col style="width: 14%" />
								<col style="width: *" />
								<col style="width: 15%" />
								<col style="width: 15%" />
								<col style="width: 15%" />
								<col style="width: 15%" />
								<col style="width: 14%" />
							</colgroup>
							<tbody>
								<tr>
									<th scope="row" colspan="2" class="ac"><span
										class="txt_or">*</span>주 분야</th>
									<td><input type="checkbox" name="f_major" value="f_major">
										개발</td>
									<td><input type="checkbox" name="f_major" value="f_major">
										디자인</td>
									<td><input type="checkbox" name="f_major" value="f_major">
										기획</td>
									<td colspan="2"></td>

								</tr>
								<tr class="line_bottom">
									<th scope="row" rowspan="3" class="ac"><span
										class="txt_or">*</span>기본분야</th>
									<th scope="row" class="ac"><span class="txt_or">*</span>개발</th>
									<td colspan="5" style="border-bottom: solid 0px #dadada"
										bgcolor="#ffffff">

										<table width="100%">
											<colgroup>
												<col width="20%" />
												<col width="20%" />
												<col width="20%" />
												<col width="20%" />
												<col width="20%" />
											</colgroup>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value=".NET"> .NET</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="ABAP"> ABAP</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="ANDROID"> ANDROID</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="ASP"> ASP</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="ASP.NET"> ASP.NET</td>
											</tr>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="C"> C</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="C#"> C#</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="C++"> C++</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="COBOL"> COBOL</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="CSS"> CSS</td>
											</tr>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="DB"> DB</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="DELPHI"> DELPHI</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="HTML"> HTML</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="IOS"> IOS</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="JAVA"> JAVA</td>
											</tr>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="JS"> JS</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="JSP"> JSP</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="LINUX"> LINUX</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="NETWORK"> NETWORK</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="PHP"> PHP</td>
											</tr>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="POWER BUILDER">
													파워빌더</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="PYTHON"> PYTHON</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="QA"> QA</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="RUBY"> RUBY</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="SERVER개발"> SERVER개발</td>
											</tr>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="VB"> VB</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="VC++"> VC++</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="WINDOWS"> WINDOWS</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="임베디드"> 임베디드</td>
												<td class="td_bor_bott">&nbsp;</td>
											</tr>
										</table> <!--img src="../img/sb_category.gif" width="87" height="18" align="absmiddle"-->
									</td>
								</tr>
								<tr class="line_bottom">
									<th scope="row" class="ac"><span class="txt_or">*</span>디자인/퍼블리싱</th>
									<td colspan="5" style="border-bottom: solid 0px #dadada"
										bgcolor="#ffffff">

										<table width="100%">
											<colgroup>
												<col width="20%" />
												<col width="20%" />
												<col width="20%" />
												<col width="20%" />
												<col width="20%" />
											</colgroup>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="HTML5"> HTML5</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="그래픽디자인"> 그래픽디자인</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="모바일"> 모바일</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="액션스크립트"> 액션스크립트</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="웹디자인"> 웹디자인</td>
											</tr>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="웹표준"> 웹표준</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="파워포인트"> 파워포인트</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="퍼블리싱"> 퍼블리싱</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="포토샵편집"> 포토샵편집</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="플래시"> 플래시</td>
											</tr>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="3D"> 3D</td>
												<td class="td_bor_bott">&nbsp;</td>
												<td class="td_bor_bott">&nbsp;</td>
												<td class="td_bor_bott">&nbsp;</td>
												<td class="td_bor_bott">&nbsp;</td>
											</tr>
										</table> <!--img src="../img/sb_category.gif" width="87" height="18" align="absmiddle"-->
									</td>
								</tr>
								<tr class="line_bottom">
									<th scope="row" class="ac"><span class="txt_or">*</span>기획/컨설턴트</th>
									<td colspan="5" style="border-bottom: solid 0px #dadada"
										bgcolor="#ffffff">

										<table width="100%">
											<colgroup>
												<col width="20%" />
												<col width="20%" />
												<col width="20%" />
												<col width="20%" />
												<col width="20%" />
											</colgroup>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="Oracle컨설턴트"> DB컨설턴트</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="PM"> PM</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="PMO"> PMO</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="SAP컨설턴트"> SAP컨설턴트</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="기획"> 기획</td>
											</tr>
											<tr>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="모바일기획"> 모바일기획</td>
												<td class="td_bor_bott"><input type="checkbox"
													name="fm_new_keyword[]" value="웹기획"> 웹기획</td>
												<td class="td_bor_bott">&nbsp;</td>
												<td class="td_bor_bott">&nbsp;</td>
												<td class="td_bor_bott">&nbsp;</td>
											</tr>
										</table> <!--img src="../img/sb_category.gif" width="87" height="18" align="absmiddle"-->
									</td>
								</tr>

							</tbody>
						</table>
					</div>

					<!-- //tb_box01 : e -->
					<div class="btn_box">
						<a href="c_join_step4.jsp" class="btn_check04">회원가입</a>
						<a href="javascript:MemberWriteFm.reset();" class="btn_check02">초기화</a>
					</div>
				</div>
				<!-- //content : e -->

			</div>
			<!-- //container : e -->

		</div>
		<!-- 아이디 중복확인 팝업 : E -->

<%@include file="../c_common/footer.jsp" %>
</body>
</html>
