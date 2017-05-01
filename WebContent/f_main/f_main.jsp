<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="f_main_css/main.css">
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script src="f_main_js/f_main.js"></script>
<!-- <script src="js/vendor/modernizr.custom.min.js"></script>
<script src="js/vendor/jquery-1.10.2.min.js"></script>
<script src="js/vendor/jquery-ui-1.10.3.custom.min.js"></script>
<script src="http://code.jquery.com/jquery-1.6.3.min.js"></script> -->

<title>Insert title here</title>
<script type="text/javascript">
google.charts.load('current', {packages: ['corechart', 'bar']});
google.charts.setOnLoadCallback(drawMultSeries);
 
function drawMultSeries() {
      var data = google.visualization.arrayToDataTable([
        ['주제', '주제', '주제'],
        ['Java', 1234, 0], /* DB통계? */
        ['C', 1958, 0],
        ['3', 0, 0],
        ['4', 0, 0],
        ['5', 1237, 88]
      ]);
 
      var options = {
        title: '차트주제',
        chartArea: {width: '50%'},
        hAxis: {
          title: '인기도?',
          minValue: 0
        },
        vAxis: {
          title: '차트주제'
        }
      };
 
      var chart = new google.visualization.BarChart(document.getElementById('chart_div'));
      chart.draw(data, options);
    }
   </script>
</head>
<body>
	<%@ include file="../c_common/header.jsp"%>
	<section id="slides">
	<div class="main_slide">
		<div class="slideshow_images">
			<a href="#" class="slide"><img src="f_main_img/bg_visual01.jpg"
				alt="" width="1911" height="432"></a> <a href="#" class="slide"><img
				src="f_main_img/bg_visual02.jpg" alt="" width="1911" height="432"></a>
			<a href="#" class="slide"><img src="f_main_img/bg_visual03.jpg"
				alt="" width="1911" height="432"></a> <a href="#" class="slide"><img
				src="f_main_img/bg_visual04.jpg" alt="" width="1911" height="432"></a>
		</div>
	</div>

	<div class="main_news">
		<!-- <h1>뉴스 영역 or 프리랜서/기업소개 영역((추후 h1영역 삭제))</h1> -->
		<div class="left_news">

			<ul>
				<li><a href="#"><h3>[자바] 자바경력 10년</h3>
						<br>프로젝트 다수</a></li>
				<li><a href="http://www.daum.net"><h3>[Daum뉴스] 웹 개발자
							선풍적인 인기~</h3>
						<br>ㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ<br>
					<br>
					<br></a></li>
				<li><a href="http://www.google.com"><h3>[google뉴스]
							Ajax를 활용한 비동기식 요청</h3>
						<br>ajax하세요<br>
					<br></a></li>
				<li>d</li>
			</ul>
		</div>
		<div id="chart_div"></div>
	</div>

	<div id="active_inf">
		<ul id="tabs">
			<li><a href="#" title="tab1">프리랜서</a></li>
			<li><a href="#" title="tab2">프로젝트</a></li>

		</ul>

		<div id="content">
			<div id="tab1">
				<h2>프리랜서 정보</h2>
				<img alt="" src="f_main_img/icon01_off.png"> <img alt=""
					src="f_main_img/icon02_off.png"> <img alt=""
					src="f_main_img/icon03_off.png"> <img alt=""
					src="f_main_img/icon04_off.png">
				<form action="" method="post">
					<table class="active_p">
						<tr>
							<th>
							<td>1 프리랜서DB</td>
							<td>2 프리랜서DB</td>
							<td>3 프리랜서DB</td>
							<td>4 프리랜서DB</td>
						</tr>
					</table>
				</form>
			</div>
			<div id="tab2">
				<h2>프로젝트 정보</h2>

				<img alt="" src="f_main_img/icon01_off.png"> <img alt=""
					src="f_main_img/icon02_off.png"> <img alt=""
					src="f_main_img/icon03_off.png"> <img alt=""
					src="f_main_img/icon04_off.png">
				<tr>
					<td>1 프로젝트DB</td>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<td>2 프로젝트DB</td>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<td>3 프로젝트DB</td>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<td>4 프로젝트DB</td>
				</tr>
			</div>

		</div>

	</div>
	<div id="introduce_site">
		<h2>드림랜서 시스템 장점</h2>
		<br>
		<br>
		<div id="introduce_img">

			<img alt="" src="f_main_img/cont04_icon01.png"> <img alt=""
				src="f_main_img/cont04_icon02.png"> <img alt=""
				src="f_main_img/cont04_icon03.png"> <img alt=""
				src="f_main_img/cont04_icon04.png">

		</div>
	</div>
	</section>
	<%@ include file="../c_common/footer.jsp"%>

</body>
</html>