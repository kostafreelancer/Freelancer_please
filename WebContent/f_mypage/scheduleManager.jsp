<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>일정관리</title>
<!-- 
<link rel="stylesheet" href="../common/header.css" type="text/css" media="screen" />
<link rel="stylesheet" href="../common/footer.css" type="text/css" media="screen" /> -->
<link rel="stylesheet" href="f_mypage_css/scheduleManager.css" type="text/css" media="screen" />
<link rel="stylesheet" href="f_mypage_css/fullcalendar.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/f_mypage/f_mypage_css/scheduleManager.css" type="text/css" media="screen" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/f_mypage/f_mypage_css/fullcalendar.css" type="text/css" media="screen" />

<script src="f_mypage_js/fullcalendar/jquery.min.js"></script>
<script src="f_mypage_js/fullcalendar/moment.min.js"></script>
<script src="f_mypage_js/fullcalendar/fullcalendar.js"></script>
<script src="f_mypage_js/fullcalendar/ko.js"></script>
<script type="text/javascript">
var newJquery = $.noConflict(true);

newJquery(document).ready(function() {

    // page is now ready, initialize the calendar...
	newJquery('#calendar').fullCalendar({
	    events: [
	        {
	            title  : '점심약속',
	            start  : '2017-05-07'
	        },
	        {
	            title  : 'event2',
	            start  : '2017-05-05',
	            end    : '2017-05-06'
	        },
	        {
	            title  : 'event3',
	            start  : '2017-05-09T12:30:00',
	            allDay : false // will make the time show
	        }
	    ]
        // put your options and callbacks here
    })
});

</script>
</head>
<body>

	<%@include file="../c_common/header.jsp"%>

	<div class="left_menu">
		<div class="left_menu_title">
			<h2>마이 페이지</h2>
		</div>
		<div class="left_menu_content">
			<ul class="left_menu_contents">
				<li><a href="">일정 관리</a></li>
				<li><a href="">회계 관리</a></li>
				<li><a href="">내 정보</a></li>
			</ul>
		</div>
	</div>

	<section id="firstsection">
	<div id="calendar"></div>

	<div id="list">
		<h5>프로젝트 이름</h5>
		<ul>
			<li>첫번째 할 일</li>
			<hr>
			<li>두번째 할 일</li>
			<hr>
			<li>세번째 할 일</li>
			<hr>
		</ul>
	</div>
	<div id="space"></div>

	</section>

	<%@include file="../c_common/footer.jsp"%>
</body>
</html>