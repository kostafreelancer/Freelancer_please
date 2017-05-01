

$(window).load(function() {
	if($('.header_welcome_content span').text() != ''){
		$('.header_welcome_content span').append("<span>님 환영합니다</span>");
		$('.login_checking a').text('로그 아웃');
	}
	alert($('.login_checking a').text());
	$('.login_checking a').click(function(){
		alert("액션은 걸리지?");
		if($('.login_checking a').text() === "로그 아웃"){
			alert("여기 드와?");
			$('.login_checking a').text("로그인");
			location.href('/Matching_Project/f_main/f_main.jsp');
		}else{
			location.href('/Matching_Project/c_login/login.jsp');
		}
		return false;
	})
	
	
});
