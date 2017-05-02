
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
        var e_mail = $(this).val();
        if(e_mail == ""){
           $('#fm_email12').removeAttr('readonly');
        }else{
           $('#fm_email12').attr('readonly', 'true')
        }
        $('#fm_email12').val(e_mail);
     });

  

    	
    
    
});


