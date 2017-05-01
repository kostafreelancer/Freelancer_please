<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="e_mypage_css/e_info.css" type="text/css"
	media="screen" />
<link rel="stylesheet" href="e_mypage_css/e_leftmenu.css"
	type="text/css" media="screen" />
<link rel="stylesheet" href="e_mypage_css/star.css" type="text/css"
	media="screen" />

<script src="http://code.jquery.com/jquery-1.6.3.min.js"></script>
<script type="text/javascript" src="e_mypage_js/e_info_star.js"></script>

</head>
<body>

	<%@include file="../c_common/header_enterprise.jsp"%>

	<nav class="left_menu">
	<div class="left_menu_title">
		<h2>마이 페이지</h2>
	</div>
	<div class="left_menu_content">
		<ul class="left_menu_contents">
			<li><a href="e_info.jsp">기업 정보</a></li>
			<li><a href="e_project.jsp">프로젝트 관리</a></li>
		</ul>
	</div>
	</nav>

	<div id="nav">
		<div class="nav_txt">
			<p>
				<a href="/e_lan/index.php">Home</a> <span class="padd">&gt;</span> <span>프로젝트
					상세</span>
			</p>
		</div>
	</div>

	<section>
	<div class="e_info_top">
		<h3>회원정보 입력</h3>
	</div>



	<div class="e_info_table1">
		<h4>아이디 및 비밀번호</h4>
		<form action="" method="post">
			<table class="tb_st01">
				<colgroup>
					<col style="width: 16%">
					<col style="width: 34%">
					<col style="width: 16%">
					<col style="width: 34%">
				</colgroup>
				<tr>
					<th scope="row" class="ac">회원아이디</th>
					<td colspan="3">데이터베이스에서거내올아이디</td>
				</tr>
				<tr>
					<th scope="row" class="ac">비밀번호</th>
					<td><input type="password" id="" name="" class="wid02">
					</td>
					<th scope="row" class="ac">비밀번호 확인</th>
					<td><input type="password" id="" name="" class="wid02">
					</td>
				</tr>
				<tr>
					<th scope="row" class="ac">이메일</th>
					<td colspan="3"><input type="text" id="" name="" class="wid04"
						value="wldnjf2000"> <span>@</span> <input type="text"
						id="" name="" class="wid04" value="naver.com"> <select
						class="wid04" name="" id="" onchange="">
							<option value="">선택해주세요.</option>
							<option value="etc">직접입력</option>
							<option value="chollian.net">chollian.net</option>
							<option value="daum.net">daum.net</option>
							<option value="dreamwiz.com">dreamwiz.com</option>
							<option value="empal.com">empal.com</option>
							<option value="freechal.com">freechal.com</option>
							<option value="hanafos.com">hanafos.com</option>
							<option value="hanmail.net">hanmail.net</option>
							<option value="hanmir.com">hanmir.com</option>
							<option value="hitel.net">hitel.net</option>
							<option value="hotmail.com">hotmail.com</option>
							<option value="korea.com">korea.com</option>
							<option value="kornet.net">kornet.net</option>
							<option value="lycos.co.kr">lycos.co.kr</option>
							<option value="nate.com">nate.com</option>
							<option value="naver.com" selected="">naver.com</option>
							<option value="nownuri.net">nownuri.net</option>
							<option value="paran.com">paran.com</option>
							<option value="unitel.co.kr">unitel.co.kr</option>
							<option value="yahoo.co.kr">yahoo.co.kr</option>
					</select></td>
				</tr>
				<tr>
					<th>평점</th>
					<td colspan="3"><span class="star_rating"> <a
							class="on" href="">★</a> <a class="on" href="">★</a> <a
							class="on" href="">★</a> <a href="">★</a> <a href="">★</a> 3.14
					</span></td>
				</tr>
			</table>
		</form>
	</div>



	<div class="e_info_table2">
		<h4>기업정보</h4>
		<table class="tb_st01">
			<colgroup>
				<col style="width: 16%">
				<col style="width: 17%">
				<col style="width: 17%">
				<col style="width: 15%">
				<col style="width: 13%">
				<col style="width: *">
			</colgroup>
			<tr>
				<td rowspan="5"><img name="IMG1" id="IMG1"
					src="e_mypage_img/item_noimage.gif">
					<div class="filebutton">
						<span>사진업로드</span> <input type="file" name="fm_file1"
							onchange="readURL(this);" class="searchfile" title="파일 찾기"
							style="width: 820px;">
					</div></td>
				<th scope="row">가입자 명</th>
				<td colspan="4"><input type="text" id="fm_korname"
					name="fm_korname" class="wid02" value=""></td>
			</tr>
			<tr>
				<th scope="row">회사명</th>
				<td colspan="4"><input type="text" id="fm_comname"
					name="fm_comname" class="wid" value=""></td>
			</tr>
			<tr>
				<th scope="row"><label for="fm_ceoname">대표자명</label></th>
				<td><input type="text" id="fm_ceoname" name="fm_ceoname"
					class="wid" value=""></td>
				<th scope="row">사업자등록번호</th>
				<td colspan="2"><input type="text" id="fm_comssn1"
					name="fm_comssn1" class="wid03" value="" maxlength="3"> <span>-</span>
					<input type="text" id="fm_comssn2" name="fm_comssn2" class="wid03"
					maxlength="2" value=""> <span>-</span> <input type="text"
					id="fm_comssn3" name="fm_comssn3" class="wid03" maxlength="5"
					value=""></td>
			</tr>
			<tr>
				<th scope="row">연락처(전화)</th>
				<td colspan="4"><select class="wid03" name="fm_tel1"
					id="fm_tel1">
						<option value="">--------</option>
						<option value="02" selected="">02 서울</option>
						<option value="031">031 경기</option>
						<option value="032">032 인천</option>
						<option value="033">033 강원</option>
						<option value="041">041 충남</option>
						<option value="042">042 대전</option>
						<option value="043">043 충북</option>
						<option value="051">051 부산</option>
						<option value="052">052 울산</option>
						<option value="053">053 대구</option>
						<option value="054">054 경북</option>
						<option value="055">055 경남</option>
						<option value="061">061 전남</option>
						<option value="062">062 광주</option>
						<option value="063">063 전북</option>
						<option value="064">064 제주</option>
						<option value="070">070</option>
						<option value="0502">0502</option>
						<option value="0504">0504</option>
						<option value="0505">0505</option>
						<option value="0506">0506</option>
						<option value="0130">0130</option>
				</select> <span>-</span> <input type="text" id="fm_tel2" name="fm_tel2"
					class="wid03" maxlength="4" value=""> <span>-</span> <input
					type="text" id="fm_tel3" name="fm_tel3" class="wid03" maxlength="4"
					value=""></td>
			</tr>
			<tr>
				<th scope="row"><label for="fm_bizcontents">주요사업내용</label></th>
				<td colspan="4"><input type="text" id="fm_bizcontents"
					name="fm_bizcontents" class="wid" value=""></td>
			</tr>
			<tr>
				<th scope="row"><label for="fm_managername">담당자명</label></th>
				<td><input type="text" id="fm_managername"
					name="fm_managername" class="wid07" value=""></td>
				<th scope="row"><label for="fm_phone1">담당자 핸드폰</label></th>
				<td colspan="3"><select class="wid03" name="fm_phone1"
					id="fm_phone1">
						<option value="">---</option>
						<option value="010" selected="">010</option>
						<option value="011">011</option>
						<option value="016">016</option>
						<option value="017">017</option>
						<option value="018">018</option>
						<option value="019">019</option>
				</select> <span>-</span> <input type="text" id="fm_phone2" name="fm_phone2"
					class="wid03" maxlength="4" value=""> <span>-</span> <input
					type="text" id="fm_phone3" name="fm_phone3" class="wid03"
					maxlength="4" value=""></td>
			</tr>
			<tr>
				<th>담당자 이메일</th>
				<td colspan="5"><input type="text" id="fm_email11"
					name="fm_email11" class="wid04" value=""> <span>@</span> <input
					type="text" id="fm_email12" name="fm_email12" class="wid04"
					value="" readonly=""> <select class="wid04"
					name="fm_emailSel1" id="fm_emailSel1"
					onchange="javascript:ChangeEMailIt('1');">
						<option value="">선택해주세요.</option>
						<option value="etc">직접입력</option>
						<option value="chollian.net">chollian.net</option>
						<option value="daum.net">daum.net</option>
						<option value="dreamwiz.com">dreamwiz.com</option>
						<option value="empal.com">empal.com</option>
						<option value="freechal.com">freechal.com</option>
						<option value="hanafos.com">hanafos.com</option>
						<option value="hanmail.net">hanmail.net</option>
						<option value="hanmir.com">hanmir.com</option>
						<option value="hitel.net">hitel.net</option>
						<option value="hotmail.com">hotmail.com</option>
						<option value="korea.com">korea.com</option>
						<option value="kornet.net">kornet.net</option>
						<option value="lycos.co.kr">lycos.co.kr</option>
						<option value="nate.com">nate.com</option>
						<option value="naver.com" selected="">naver.com</option>
						<option value="nownuri.net">nownuri.net</option>
						<option value="paran.com">paran.com</option>
						<option value="unitel.co.kr">unitel.co.kr</option>
						<option value="yahoo.co.kr">yahoo.co.kr</option>
				</select></td>
			</tr>
			<tr>
				<th>회사 주소</th>
				<td colspan="5">
					<div class="mb10">
						<input type="text" id="fm_zip" name="fm_zip" class="wid60"
							onclick="openDaumPostCode(); return false;" target="_blank"
							title="주소검색 새창" value="" readonly=""> <a
							href="javascript:void(0);" class="btn_add"
							onclick="openDaumPostCode(); return false;" target="_blank"
							title="주소검색 새창">우편번호찾기</a>
					</div>
					<div>
						<input type="text" id="fm_address" name="fm_address" class="wid"
							value="">
					</div>
				</td>
			</tr>
			<tr>
				<th>회사 홈페이지</label></th>
				<td colspan="5">
					<div>
						<span>http://</span> <input type="text" id="fm_homepage"
							name="fm_homepage" class="wid06" value="">
					</div>
				</td>
			</tr>
			<tr>
				<th scope="row" rowspan="2">기업정보</th>
				<th scope="col" class="ac">설립년도</th>
				<th scope="col" class="ac">사원수</th>
				<th scope="col" class="ac">상장여부</th>
				<th scope="col" class="ac">자본금</th>
				<th scope="col" class="ac">매출액</th>
			</tr>
			<tr>
				<td><input type="text" id="fm_foundyear" name="fm_foundyear"
					class="wid03" maxlength="4" value=""><label
					for="fm_foundyear"> 년</label></td>
				<td><input type="text" id="fm_employnum" name="fm_employnum"
					class="wid03" value=""><label for="fm_employnum"> 명</label>
				</td>
				<td><select class="wid07" name="fm_stockchk" id="fm_stockchk">
						<option value="비상장" selected="">비상장</option>
						<option value="코스피">코스피상장</option>
						<option value="코스닥">코스닥상장</option>
						<option value="나스닥">해외(나스닥)</option>
						<option value="자스닥">해외(자스닥)</option>
						<option value="해외기타">해외(기타)</option>
				</select></td>
				<td><input type="text" id="fm_capitalmoney"
					name="fm_capitalmoney" class="wid05" value=""><label
					for="fm_capitalmoney"> 만원</label></td>
				<td><input type="text" id="fm_sellingmoney"
					name="fm_sellingmoney" class="wid05" value=""> 만원/ <input
					type="text" id="fm_sellingyear" name="fm_sellingyear" class="wid03"
					value=""> 년</td>
			</tr>
			<tr>
				<th><label for="fm_comtype">기업 형태</label></th>
				<td colspan="5"><select class="wid07" name="fm_comtype"
					id="fm_comtype">
						<option value="">--기업형태--</option>
						<option value="M040100">일반기업</option>
						<option value="M040200">대기업</option>
						<option value="M040300">중소기업</option>
						<option value="M040400">외국기업</option>
						<option value="M040500">벤처기업</option>
						<option value="M040600">정부기관</option>
						<option value="M040700">공사/공기업</option>
						<option value="M040800">공공기관</option>
						<option value="M040900">교육기업</option>
						<option value="M041000">협회</option>
						<option value="M041100">개인</option>
						<option value="M049900">기타</option>
				</select></td>
			</tr>
			<tr>
				<th>사업자등록증</th>
				<td colspan="5"><input type="file" id="fm_file3"
					name="fm_file3" class="wid"></td>
			</tr>
		</table>
	</div>

	<div class="btn_box mb30 mb02">
		<a href="javascript:MemberModifyIt();" class="btn_check06">수정하기</a> <a
			href="javascript:MemberModifyFm.reset();" class="btn_check02">초기화</a>
	</div>

	</section>

	<%@include file="../c_common/footer.jsp"%>
</body>
</html>