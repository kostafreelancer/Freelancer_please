$(function(){
	$('#checkValue').click(function(){
		var form = document.ProjectWriteFm;
	    
	    if(!form.p_name.value){
	        alert("프로젝트명를 입력하세요.");
	        return false;
	    }
	    
	    if(!form.p_content.value){
	        alert("상세내용를 입력하세요.");
	        return false;
	    }
	    
	    if(!form.p_lowerage.value){
	        alert("연령을 선택하세요.");
	        return false;
	    }
	    
	    if(!form.p_upperage.value){
	        alert("연령을 선택하세요.");
	        return false;
	    }
	    
	    if(!form.p_requirenum.value){
	        alert("모집인원을 입력하세요.");
	        return false;
	    }
	    if(!form.p_exdate.value){
	        alert("모집마감일자를 선택하세요.");
	        return false;
	    }
	    if(!form.p_lowercost.value){
	        alert("프로젝트 금액을 입력하세요.");
	        return false;
	    }
	    if(!form.p_upppercost.value){
	        alert("프로젝트 금액을 입력하세요.");
	        return false;
	    }
	    if(!form.p_startdate.value){
	        alert("근무기간을 선택하세요.");
	        return false;
	    }
	    if(!form.p_enddate.value){
	        alert("근무기간을 선택하세요.");
	        return false;
	    }
	    if(!form.p_location.value){
	        alert("근무지역을 선택하세요.");
	        return false;
	    }
	    if(!form.p_experience.value){
	        alert("희망 경력년수를 선택하세요.");
	        return false;
	    }
	    
	});
});
	