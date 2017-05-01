function openWindow(theURL, winName, features) { 
   window.open(theURL,winName,features);
}

function IsEmpty(keyword) {
	if(!keyword)keyword='';
		var st_num, key_len;
		
		st_num = keyword.indexOf(" ");	
		
		while (st_num != -1) {
		
			keyword = keyword.replace(" ", "");
			st_num  = keyword.indexOf(" ");
		}
		key_len=keyword.length;
		return key_len;
	
}

function IDCheckIt() {
	with(document.MemberWriteFm) {
		if (!IsEmpty(fm_id.value)) {
			new_alert("먼저 아이디를 입력하세요.");
			fm_id.focus();
			return;
		}
		if (!IsAlphaNumeric(fm_id.value)) {
			new_alert("아이디는 6~15자의 영문이나, 영문+숫자만 가능합니다.");
			fm_id.focus();
			return;
		}
		if (fm_id.value.length<6 || fm_id.value.length>15) {
			new_alert("아이디는 6~15자의 영문이나, 영문+숫자만 가능합니다.");
			fm_id.focus();
			return;
		}
		openWindow('/00_include/global/BlankPage.php', '_IDCHECK', 'location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=no,width=430,height=350,left=100,top=100');
		target = "_IDCHECK";
		action = "pop_idcheck.php";
		method = "post";
		submit();
	}
}

function IDEnterCheck() {
	if (window.event.keyCode == 13) {
		IDCheckIt();
	}
	return;
}
function ChangeEMailIt(code) {
	with(document.MemberWriteFm) {
		var Email1 = eval("fm_email"+ code +"1");
		var Email2 = eval("fm_email"+ code +"2");
		var EmailSel = eval("fm_emailSel"+ code)
		if (EmailSel.value == "etc") {
			Email2.readOnly = false;
			Email2.value = "";
			Email2.focus();
		} else {
			Email2.readOnly = true;
			Email2.value = EmailSel.value;
			Email1.focus();
		}
	}
}