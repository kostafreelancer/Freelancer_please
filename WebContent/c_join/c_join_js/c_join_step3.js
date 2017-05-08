$(function(){
	
	//아이디 중복확인 창 띄우기
/*	$('#idCheckbox').click(function(){
		  window.name = "parentForm";
		  window.open("idCheckForm.jsp",
		            "chk", "width=500, height=300, resizable = no, scrollbars = no"); 
		  

			if(userInfo.e_id.value == "") {
				alert("id를 입력하시오.");
				userInfo.e_id.focus();
			} else {
				url = "check_id.jsp?id=" + userInfo.e_id.value;
				window.open(
						url, 
						"id check", "toolbar=no, width=350, height=150, top=150, left=150");
			}
	});*/
	
	
	//사진이미지 미리보기

	
	//이메일 주소
	   $('#manager_mail3').change(function(){
		      var e_mail = $(this).val();
		      if(e_mail == ""){
		         $('#manager_mail2').removeAttr('readonly');
		      }else{
		         $('#manager_mail2').attr('readonly', 'true')
		      }
		      $('#manager_mail2').val(e_mail);
		   });
	   $('#e_mail3').change(function(){
		   var e_mail = $(this).val();
		   if(e_mail == ""){
			   $('#e_mail2').removeAttr('readonly');
		   }else{
			   $('#e_mail2').attr('readonly', 'true')
		   }
		   $('#e_mail2').val(e_mail);
	   });

	
	
	
	
	
	
	//회원가입 빈칸 확인
	$('#checkValue').click(function(){
		var form = document.userInfo;
        
        if(!form.e_id.value){
            alert("아이디를 입력하세요.");
            return false;
        }
        
/*        if(form.idDuplication.value != "idCheck"){
            alert("아이디 중복체크를 해주세요.");
            return false;
        }*/
        
        if(!form.e_pwd.value){
            alert("비밀번호를 입력하세요.");
            return false;
        }
        
        if(form.e_pwd.value != form.e_pwdcheck.value ){
            alert("비밀번호를 동일하게 입력하세요.");
            return false;
        }    
        
        if(!form.e_ename.value){
            alert("회사명을 입력하세요.");
            return false;
        }
        
        if(!form.e_owner.value){
            alert("대표자명을 입력하세요.");
            return false;
        }
        if(!form.e_mail1.value){
        	alert("회사이메일을 입력하세요.");
        	return false;
        }
        if(!form.e_mail2.value){
        	alert("회사이메일을 입력하세요.");
        	return false;
        }
        if(!form.e_regno1.value){
        	alert("사업자등록번호를 입력하세요.");
        	return false;
        }
        
        if(isNaN(form.e_regno1.value)){
            alert("사업자등록번호는 숫자만 입력가능합니다.");
            return false;
        }
        if(!form.e_regno2.value){
        	alert("사업자등록번호를 입력하세요.");
        	return false;
        }
        
        if(isNaN(form.e_regno2.value)){
        	alert("사업자등록번호는 숫자만 입력가능합니다.");
        	return false;
        }
        if(!form.e_regno3.value){
        	alert("사업자등록번호를 입력하세요.");
        	return false;
        }
        
        if(isNaN(form.e_regno3.value)){
        	alert("사업자등록번호는 숫자만 입력가능합니다.");
        	return false;
        }

        
        if(!form.e_bf.value){
            alert("주요사업내용을 입력하세요.");
            return false;
        }
        if(!form.manager_name.value){
        	alert("담당자이름을 입력하세요.");
        	return false;
        }
        
        if(form.manager_hphone1.value == ""){
            alert("번호를 선택하세요.");
            return false;
        }
        if(!form.manager_hphone2.value){
        	alert("담당자연락처를 입력하세요.");
        	return false;
        }
        if(isNaN(form.manager_hphone2.value)){
            alert("담당자연락처는 숫자만 입력해주세요.");
            return false;
        }

        if(!form.manager_hphone3.value){
        	alert("담당자연락처를 입력하세요.");
        	return false;
        }
        if(isNaN(form.manager_hphone3.value)){
            alert("담당자연락처는 숫자만 입력해주세요.");
            return false;
        }
        
        if(form.e_phone1.value == ""){
        	alert("대표전화번호를 선택하세요.");
        	return false;
        }
        if(!form.e_phone2.value){
        	alert("대표전화를 입력하세요.");
        	return false;
        }
        if(isNaN(form.e_phone2.value)){
        	alert("대표전화를 숫자만 입력해주세요.");
        	return false;
        }
        
        if(!form.e_phone3.value){
        	alert("대표전화를 입력하세요.");
        	return false;
        }
        if(isNaN(form.e_phone3.value)){
        	alert("대표전화를 숫자만 입력해주세요.");
        	return false;
        }
        
        if(!form.e_address.value){
        	alert("회사주소를 입력하세요.");
        	return false;
        }
/*        if(!form.e_licensefile.value){
        	alert("사업자등록증을 등록해주세요.");
        	return false;
        }*/
        
        
});
	
});







	




