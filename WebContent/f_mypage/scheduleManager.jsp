<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	
	var arrContents= new Array();
	var arrStart= new Array();
	var arrEnd= new Array();
	
	<c:forEach var="item" items="${scheduleList}">
		arrContents.push("${item.contents}");
		arrStart.push("${item.startdate}");
		arrEnd.push("${item.enddate}");
	</c:forEach>

/* 	$.ajax({
		url:'temp.jsp',
		type: 'get',
		datatType : 'json',
		success : function(data){
			setCalendar(data);
		}
		
	}); */
	
	   newJquery('#calendar').fullCalendar({
		    
	    	eventSources: '/temp.jsp'
		/* 	events: [
					{	      
			            title  : arrContents[i],
			            start  : arrStart[i],
			            end : arrEnd[i]
					}
		    ] */
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
				<li><a href="showScheduleInfo.f_mypage?f_num=${client.f_num}">일정 관리</a></li>
				<li><a href="">회계 관리</a></li>
				<li><a href="showFreelancerInfo.f_mypage?f_num=${client.f_num}">내 정보</a></li>
			</ul>
		</div>
	</div>

	<section id="firstsection">
	<div id="calendar"></div>

	<div id="list">
		<table border="1px solid" cellpadding="0" cellspacing="0">
			<tr><td>${proName}</td></tr>
			<c:forEach var="schedule" items="${scheduleList}" varStatus="status">
			<%-- <input type="text" hidden name="calendar_num" value="${status.index+1}"> --%>
				<tr><td><input type="text" hidden id="sch_num" name="calendar_num${status.index+1}">${schedule.contents}</td></tr>
			</c:forEach>
		</table>
	</div>
	<div id="space"></div>

	</section>

	<%@include file="../c_common/footer.jsp"%>
</body>
</html>