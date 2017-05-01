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
<link rel="stylesheet" href="f_mypage_css/scheduleManager.css"
	type="text/css" media="screen" />
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

	<div id="calendar">
		<table id="calendar_table" border="1px solid" cellpadding="0"
			cellspacing="0" height="250px">
			<tr height="50px">
				<th id="sun">일</th>
				<th>월</th>
				<th>화</th>
				<th>수</th>
				<th>목</th>
				<th>금</th>
				<th id="sat">토</th>
			</tr>
			<tr height="50px">
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>
				<td>6</td>
				<td>7</td>
			</tr>
			<tr height="50px">
				<td>8</td>
				<td>9</td>
				<td>10</td>
				<td>11</td>
				<td>12</td>
				<td>13</td>
				<td>14</td>
			</tr>
			<tr height="50px">
				<td>15</td>
				<td>16</td>
				<td>17</td>
				<td>18</td>
				<td>19</td>
				<td>20</td>
				<td>21</td>
			</tr>
			<tr height="50px">
				<td>22</td>
				<td>23</td>
				<td>24</td>
				<td>25</td>
				<td>26</td>
				<td>27</td>
				<td>28</td>
			</tr>
		</table>
		<br> <br> <br> <br> <br>
	</div>

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