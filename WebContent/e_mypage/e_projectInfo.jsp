<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="e_mypage_css/e_projectInfo.css"
	type="text/css" media="screen" />
<link rel="stylesheet" href="e_mypage_css/e_leftmenu.css"
	type="text/css" media="screen" />
<link rel="stylesheet" href="e_mypage_css/memberlist.css"
	type="text/css" media="screen" />

<script src="http://code.jquery.com/jquery-1.6.3.min.js"></script>
<script type="text/javascript" src="e_mypage_js/tabs.js"></script>

<title>Insert title here</title>

</head>
<body>
	<%@include file="../c_common/header_enterprise.jsp"%>

	<nav class="left_menu">
	<div class="left_menu_title">
		<h2>마이 페이지</h2>
	</div>
	<div class="left_menu_content">
		<ul class="left_menu_contents">
			<li><a href="">기업 정보</a></li>
			<li><a href="">프로젝트 관리</a></li>
		</ul>
	</div>
	</nav>

	<!-- //header_wrap : e -->
	<div id="conainer">
		<div id="nav">
			<div class="nav_txt">
				<p>
					<a href="/e_lan/index.php">Home</a> <span class="padd">&gt;</span>
					<span>프로젝트 상세</span>
				</p>
			</div>
		</div>


		<div id="content">
			<div class="tit_box">
				<h2>디비에서가져올프로젝트이름</h2>
			</div>

			<div class="table_tit">
				<h3>프로젝트 상세내용</h3>
			</div>
			<!-- table_tit : e -->

			<div class="tb_box">
				<h4>담당자 정보</h4>
				<table class="tb_st01">
					<colgroup>
						<col style="width: 15%" />
						<col style="width: 35%" />
						<col style="width: 15%" />
						<col style="width: 35%" />
					</colgroup>
					<tbody>
						<tr>
							<th scope="row"><span class="txt_or">*</span><label
								for="fm_comname">회사명</label></th>
							<td colspan="3">회에에사사아아</td>
						</tr>
						<tr>
							<th scope="row"><span class="txt_or">*</span> <label
								for="fm_korname">담당자명</label></th>
							<td colspan="3">담당자아아아ㅏ</td>
						</tr>
						<tr>
							<th scope="row"><span class="txt_or">*</span> 담당자 연락처</th>
							<td><label for="fm_tel1"></label> 02 <span>-</span> 828 <span>-</span>
								1234</td>
							<th scope="row"><span class="txt_or">*</span> 담당자 휴대폰</th>
							<td>010 <span>-</span> 8282 <span>-</span> 1234
							</td>
						</tr>
						<tr>
							<th scope="row"><span class="txt_or">*</span> 담당자 이메일</th>
							<td colspan="3">wlwlwlwl@naver.com</td>
						</tr>
					</tbody>
				</table>
			</div>
			<!-- //tb_box : e -->

			<div class="tb_box">
				<h4>프로젝트 키워드</h4>
				<table class="tb_st01">
					<caption></caption>
					<colgroup>
						<col style="width: 13%" />
						<col style="width: 16%" />
						<col style="width: 17%" />
						<col style="width: 15%" />
						<col style="width: 15%" />
						<col style="width: 15%" />
						<col style="width: 16%" />
					</colgroup>
					<tbody>
						<tr>
							<th scope="row" colspan="2" class="ac"><span class="txt_or">*</span><label
								for="fm_name">프로젝트 명</label></th>
							<td colspan="5">재밌는프로젝트</td>
						</tr>
						<tr>
							<th scope="row" rowspan="3" class="ac"><span class="txt_or">*</span>기본분야</th>
							<th scope="row" class="ac"><span class="txt_or"></span>개발</th>
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
									<tr class="che_list011">
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
									<tr class="che_list011">
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
									<tr class="che_list011">
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
									<tr class="che_list011">
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
									<tr class="che_list011">
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="POWER BUILDER"> POWER
											BUILDER</td>
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="PYTHON"> PYTHON</td>
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="QA"> QA</td>
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="RUBY"> RUBY</td>
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="SERVER개발"> SERVER개발</td>
									</tr>
									<tr class="che_list011">
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
						<tr class="line_bottom" style="border-top: solid 1px #d6d6d6">
							<th scope="row" class="ac"><span class="txt_or"></span>디자인/퍼블리싱</th>
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
									<tr class="che_list011">
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
									<tr class="che_list011">
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
									<tr class="che_list011">
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
							<th scope="row" class="ac"><span class="txt_or"></span>기획/컨설턴트</th>
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
									<tr class="che_list011">
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="Oracle컨설턴트">
											Oracle컨설턴트</td>
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="PM"> PM</td>
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="PMO"> PMO</td>
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="SAP컨설턴트"> SAP컨설턴트</td>
										<td class="td_bor_bott"><input type="checkbox"
											name="fm_new_keyword[]" value="기획"> 기획</td>
									</tr>
									<tr class="che_list011">
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


						<tr>
							<th scope="row" colspan="2" class="ac"><span class="txt_or">*</span><label
								for="fm_content">상세내용</label></th>
							<td colspan="5"><textarea id="fm_content" name="fm_content"
									class="txt_area" disabled="disabled">
1.프로젝트명:

2.현재개발진행사항
1)총투입인력:
2)현재설계개발상태:

3.담당업무
1)

4.업무범위:

5.전달사항또는(개발)우대사항:
1)

6.필요인력:명

7.개발자필요Spec
1)
2)

8.근무지:

9.개발기간:

10.월단가:제시바람

11.장비지참여부:


                                </textarea></td>
						</tr>
						<tr>
							<th scope="row" colspan="2" class="ac"><span class="txt_or">*</span>
								연령</th>
							<td colspan="2">23세(1995년생) <span>~</span> 35세(1983년생)
							</td>
							<th scope="row" class="ac"><span class="txt_or"></span> 학력</th>
							<td colspan="2">학력무관</td>
						</tr>
						<tr>
							<th scope="row" colspan="2" class="ac"><span class="txt_or">*</span>
								인원</th>
							<td colspan="2">15명</td>
							<th scope="row" class="ac"><span class="txt_or">*</span>모집마감일자</th>
							<td colspan="2">2017년 4월 27일</td>
						</tr>
						<tr>
							<th scope="row" colspan="2" class="ac"><span class="txt_or">*</span>프로젝트
								금액(월단위)</th>
							<td colspan="5"><span>2,000,000원 ~ </span> <span>3,000,000원
									&nbsp;</span> <span class="txt_red">* VAT별도 금액입니다.</span></td>
						</tr>

						<tr>
							<th scope="row" colspan="2" class="ac"><span class="txt_or">*</span>근무기간</th>
							<td colspan="5">2017년 4월 29일 <span> ~ </span> 2018년 9월 20일
							</td>
						</tr>

						<tr>
							<th scope="row" colspan="2" class="ac"><span class="txt_or">*</span>
								근무지</th>
							<td colspan="5">서울특별시 금천구
						</tr>
						<tr>
							<th scope="row" colspan="2" class="ac"><span class="txt_or">*</span>
								희망 경력년수</th>
							<td colspan="5">3 년차 <span>~</span> 7 년차
							</td>
						</tr>

					</tbody>
				</table>
			</div>
			<!-- //tb_box : e -->

			<div class="btn_box">
				<input class="btn btn-lg btn-default js-disable-on-click"
					autocomplete="off" data-loading-text="저장 중" name="save_for_later"
					value="수정하기" type="submit">
			</div>



			<div class="table_tit">
				<h3>프리랜서 목록</h3>
			</div>

			<!-- 프리랜서 목록 -->
			<section>
			<ul id="tabs">
				<li><a href="#" title="tab1">목록</a></li>
				<li><a href="#" title="tab2">참가신청 관리</a></li>
			</ul>

			<div id="tcontent">
				<div id="tab1">
					<div class="tb_box">
						<table class="tb_st01 tb_st03">
							<colgroup>
								<col style="width: 15%">
								<col style="width: 10%">
								<col style="width: 15%">
								<col style="width: 10%">
								<col style="width: 25%">
								<col style="width: 25%">
							</colgroup>
							<thead>
								<tr>
									<th scope="col">아이디</th>
									<th scope="col">이름</th>
									<th scope="col">분야</th>
									<th scope="col">경력</th>
									<th scope="col">참가일</th>
									<th scope="col">멤버 관리</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td class="ac">wldnjf2000</td>
									<td class="ac">강지원</td>
									<td class="ac">개발</td>
									<td class="ac">2년</td>
									<td class="ac">2017-4-26</td>
									<td class="ac"><a href="#" class="accept">계약해지</a></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div>
						<a href="" class="additional">추가모집</a>
					</div>
					<div class="num_box">
						<span class="btn_lef"> <a href="" class="first" alt="처음으로"></a>
						</span> <span class="btn_rit"> <a href="" class="last" alt="마지막으로"></a>
						</span>
					</div>
				</div>



				<div id="tab2">
					<div class="tb_box">
						<table class="tb_st01 tb_st03">
							<colgroup>
								<col style="width: 15%">
								<col style="width: 10%">
								<col style="width: 15%">
								<col style="width: 10%">
								<col style="width: 25%">
								<col style="width: 25%">
							</colgroup>
							<tbody>
								<tr>
									<td class="ac"><a href="#">wldnjf2000</a></td>
									<td class="ac">강지원</td>
									<td class="ac">개발</td>
									<td class="ac">2년</td>
									<td class="ac">2017-4-26</td>
									<td class="ac"><a href="#" class="accept">수락</a> <a
										href="#" class="deny">거절</a></td>
								</tr>
								<tr>
									<td class="ac"><a href="#">GangSa</a></td>
									<td class="ac">김강사</td>
									<td class="ac">디자인</td>
									<td class="ac">6년</td>
									<td class="ac">2017-4-25</td>
									<td class="ac"><a href="#" class="accept">수락</a> <a
										href="#" class="deny">거절</a></td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="num_box">
						<span class="btn_lef"> <a href="" class="first" alt="처음으로"></a>
						</span> <span class="btn_rit"> <a href="" class="last" alt="마지막으로"></a>
						</span>
					</div>
				</div>

			</div>

			</section>
			<!-- 프리랜서 목록 끝 -->
		</div>
	</div>

	<%@include file="../c_common/footer.jsp"%>
</body>
</html>