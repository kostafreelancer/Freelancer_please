

$(window).load(function() {
	alert($('.header_welcome_content span').text());
	if($('.header_welcome_content span').text() != ''){
		$('.header_welcome_content span').append("<span>님 환영합니다</span>");
	}
	
});
