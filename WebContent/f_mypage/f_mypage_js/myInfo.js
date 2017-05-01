$(document).ready(function() {
	$("#content>div").hide(); // Initially hide all content
	$("#tabs li:first").attr("id","current"); // Activate first tab
	$("#content>div:first").fadeIn(); // Show first tab content
    
    $('#tabs a').click(function(e) {
        e.preventDefault();        
        $("#content>div").hide(); //Hide all content
        $("#tabs li").attr("id",""); //Reset id's
        $(this).parent().attr("id","current"); // Activate this
        $('#' + $(this).attr('title')).fadeIn(); // Show content for current tab
    });
   
    $('#fm_emailSel1').change(function(){
    	   if($('#fm_emailSel1').val() == "1"){
    	    $("#fm_email12").val(""); //값 초기화
    	    $("#fm_email12").prop("readonly",false); //활성화
    	   } else if($('#fm_emailSel1').val() == ""){
    	    $("#fm_email12").val(""); //값 초기화
    	    $("#fm_email12").prop("readonly",true); //textBox 비활성화
    	   } else {
    	    $("#fm_email12").val($('#fm_emailSel1').val()); //선택값 입력
    	    $("#fm_email12").prop("readonly",true); //비활성화
    	   }
    });

    
});


