

$(window).load(function() {
	alert('as'+$('.header_welcome_content span').val()+'as');
	alert('');
	if($('.header_welcome_content span').val() != ''){
		$('.header_welcome_content span').append("<span>님 환영합니다</span>");
	}
	
});
