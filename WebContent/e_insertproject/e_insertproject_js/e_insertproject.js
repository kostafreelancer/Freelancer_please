// 이미지 파일 정의
function getImageFile() {
	var arr_image = new Array("GIF","JPG","JPEG","BMP","PNG");
	return arr_image;
}

// 압축 파일 정의
function getZipFile() {
	var arr_zip = new Array("ZIP","ALZ");
	return arr_zip;
}

// 문서 파일 정의
function getTextFile() {
	var arr_text = new Array("HWP","DOC","TXT","XLS","PPT","PDF");
	return arr_text;
}

// 브라우져 쿠키 생성하기
function setCookie(name, value, expires, path, domain, secure) {
	var curCookie = name + "=" + escape(value) +
	((expires) ? "; expires=" + expires.toGMTString() : "") +
	((path) ? "; path=" + path : "") +
	((domain) ? "; domain=" + domain : "") +
	((secure) ? "; secure" : "")
	
	document.cookie = curCookie
	return true;
}

// 브라우져 쿠키 정보 확인하기
function GetCookie(NameCookie) {
	var i = document.cookie.indexOf(NameCookie + '=' );
	if (i != -1) {
		i += NameCookie.length + 1;
		NameEnd = document.cookie.indexOf(';', i);
		if (NameEnd == -1) {
			NameEnd = document.cookie.length;
		}
		return  unescape(document.cookie.substring(i, NameEnd));
	} else {
		return "";
	}
}

// 플래시 태그 불러오기 함수1
function appendObjectCode(_code){
  document.writeln(_code);
}

// 새창띄우기 함수
function openWindow(theURL, winName, features) { 
   window.open(theURL,winName,features);
}

// 레이어 창 띄우기 함수
function ShowClosePannelLayer(PANNELName) {
	var PANNELName;
	
	SelectPANNELName = eval(document.getElementById(PANNELName));
	if (SelectPANNELName.style.display=="none") {
		SelectPANNELName.style.display = "inline";
	} else {
		SelectPANNELName.style.display = "none";
	}
}

function ShowPannelLayer(PANNELName) {
	var PANNELName;
	
	SelectPANNELName = eval(document.getElementById(PANNELName));
	if (SelectPANNELName.style.display=="none") {
		SelectPANNELName.style.display = "inline";
	}
}

function ClosePannelLayer(PANNELName) {
	var PANNELName;
	
	SelectPANNELName = eval(top.document.getElementById(PANNELName));
	SelectPANNELName.style.display ="none";
}

// 객체 활성,비활성 설정 함수
function ShowObject(type, Obj, Boolen) {
	if (Boolen) {                 //활성화
		if (type=="A") Obj.disabled = false;
		Obj.style.background = "#ffffff";
	} else {                      //비활성화
		if (type=="A") Obj.disabled = true;
		Obj.style.background = "#dddddd";
	}
}

// 토글 선택 조절 함수
function ToggleCheckAll(button, FormName, FieldName) {
	FormName = eval("document."+ FormName);
	with(FormName) {
		var sa=true;
		if(button.checked) sa=false;
		for (var i=0;i<FormName.elements.length;i++) {
			if (FormName.elements[i].name==FieldName+"[]") {
				var e = FormName.elements[i];
				if(sa) e.checked=false;
				else e.checked=true;
			}
		}
		if(sa) button.checked=false;
		else button.checked=true;
	}
}

// 공백 체크 함수
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

// 스트링 체크 함수
function checkstr(pstr, pvalid, han) {
	var valid = pvalid;
	var tmp;
	var flag = true;
	
	for (var i = 0; i < pstr.length; i++) {
		flag = true;
		tmp = "" + pstr.substring(i, i+1);
		if (han != 1) {
			if (valid.indexOf(tmp) == "-1") {
				return false;
			}
		} else {
			ch = escape(pstr.charAt(i));        //ISO-Latin-1 문자셋으로 변경
			if (valid.indexOf(tmp) == "-1" && strCharByte(ch) != 2) {
				return false;
			}
		}
	}
	return true;;
}

// 숫자 체크 함수
function IsNumber(checkStr){
    for (i=0; i < checkStr.length ;i++){
        if ((checkStr.substr(i,1) < '0' || checkStr.substr(i,1) > '9')){
            return false;
        }
    }
    return true;
}
function IsOnlyNumber(){
	if((event.keyCode<48)||(event.keyCode>57))
		event.returnValue=false;
}
function IsDigitStr(pstr) {
	var valid = "0123456789";
	return checkstr(pstr, valid, 0);
}

// 전화번호 체크 함수
function CheckPhoneNumber(checkStr){
	var checkOK = "0123456789-";
	for (i = 0; i < checkStr.length; i++){
		ch = checkStr.charAt(i);
		for (j = 0; j < checkOK.length; j++)
			if (ch == checkOK.charAt(j))
			break;
			if (j == checkOK.length){
				return (false);
				break;
			}
	}
	return (true);
}

// 영어 및 숫자 체크 함수
function IsAlphaNumeric(checkStr){
	var checkOK = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_@.";
	for (i = 0; i < checkStr.length; i++){
		ch = checkStr.charAt(i);
		for (j = 0; j < checkOK.length; j++)
			if (ch == checkOK.charAt(j))
			break;
			if (j == checkOK.length){
				return (false);
				break;
			}
	}
	return (true);
}

// 숫자에 콤마 찍어주는 함수
function Comma(checkStr) {
	checkStr = '' + checkStr;
	
	//--- 소수점 첫째자리에서 반올림해주는 기능 ---//
	numberTmp = checkStr.split(".");
	if(numberTmp[1]) {
		var c = numberTmp[1].substring(0,1);
		if(c >= 0 && c < 5)
			checkStr = eval(numberTmp[0]);
		else
			checkStr = eval(numberTmp[0]) + 1;
	}
	checkStr = ''+ checkStr +'';
	
	//--- Comma찍어주는 기능 ---//
	if (checkStr.length > 3) {
		var mod = checkStr.length % 3;
		var output = (mod > 0 ? (checkStr.substring(0,mod)) : '');
		for (i=0 ; i < Math.floor(checkStr.length / 3); i++) {
			if ((mod == 0) && (i == 0)) {
				output += checkStr.substring(mod+ 3 * i, mod + 3 * i + 3);
			} else {
				output+= ',' + checkStr.substring(mod + 3 * i, mod + 3 * i + 3);
			}
		}
		return (output);
	} else {
		return checkStr;
	}
}

// 숫자에 콤마를 없애주는 함수
function CommaDel(checkStr) {
	NumValue = "";
	NumArray = checkStr.split(",");
	aa = NumArray.length;
	if(aa > 1) {
		for(ii=0; ii < aa; ii++) {
			if(NumArray[ii] == '')
				break;
			else
				NumValue += NumArray[ii];
		}
	} else {
		NumValue = checkStr;
	}
	return(NumValue);
}

// 특정문자를 없애주는 함수
function StringDel(checkStr1, checkStr2) {
	StrValue = "";
	StrArray = checkStr1.split(checkStr2);
	aa = StrArray.length;
	if(aa > 1) {
		for(ii=0; ii < aa; ii++) {
			if(StrArray[ii] == '')
				break;
			else
				StrValue += StrArray[ii];
		}
	} else {
		StrValue = checkStr1;
	}
	return(StrValue);
}

// 금액 확인 함수
function CheckMoney(FormName, FieldName) {
	FormName = eval("document."+ FormName);
	with(FormName) {
		FieldName1 = eval(FieldName);
		FieldName2 = FieldName1.value;
		FieldValue1 = FieldName2.substring(0,1);
		if (FieldValue1=="-") FieldValue2 = FieldName2.substring(1);
		else FieldValue2 = FieldName2;
		//alert(FieldValue2);
		FieldValue3 = CommaDel(FieldValue2);
		if(!IsDigitStr(FieldValue3)) {
			alert("숫자만 입력 가능합니다.");
			FieldName1.focus();
			return;		
		}
		FieldValue4 = Comma(FieldValue3)
		if (FieldValue1=="-") FieldValue = FieldValue1 + FieldValue4;
		else FieldValue = FieldValue4;
		FieldName3 = eval(FieldName);
		FieldName3.value = FieldValue;
	}
}

// 메일 확인 함수
function CheckEmail(checkStr) {
	var checkflag = true;
	var retvalue;
	
	if(window.RegExp){
		var tempstring = "a"
		var exam = new RegExp(tempstring)
		if(tempstring.match(exam)){
			var ret1 = new RegExp("(@.*@)|(\\.\\.)|(@\\.)|(^\\.)");
			var ret2 = new RegExp("^.+\\@(\\[?)[a-zA-Z0-9\\-\\.]+\\.([a-zA-Z]{2,3}|[0-9]{1,3})(\\]?)$");
			retvalue=(!ret1.test(checkStr) && ret2.test(checkStr))
		}else{
			checkflag = false;	
		}
	}else{
		checkflag = false;
	}
	if(!checkflag){
		retvalue=((checkStr != "") && (checkStr.indexOf("@"))>0 && (checkStr.indexOf(".")>0));		
	}
	return retvalue
}

// 유효한 날짜인지 점검하는 함수
function CheckDate(pMonth, pDay, pYear){
    var ofd = new Date;
    ofd.setDate(1);

    pMonth = "" + pMonth;
    pDay = "" + pDay;
    pYear = "" + pYear;
    var Year = parseInt(rmleadzero(pYear));
    var Month = rmleadzero(pMonth);
    var Day = rmleadzero(pDay);

    if (isNaN(Year)) Year = 2000;
    if (Year <= 100) Year = Year + 1900;

    ofd.setYear(parseInt(Year));
    ofd.setMonth(parseInt(Month)-1);
    ofd.setDate(parseInt(Day));

    var vy = ofd.getYear();
    var vm = ofd.getMonth()+1;
    var vd = ofd.getDate();
    
    if (vy <= 200) vy = vy + 1900;

    fdate = Year+"/"+Month+"/"+Day;
    vdate = vy+"/"+vm+"/"+vd;
    if (fdate != vdate){
        return false;
    }
    return true;
}

// 기준 날짜와의 차이 구하기 함수
function CheckNextDate(v, t) {
	var str = new Array();
	var b = v.split("-");
	var c = new Date(b[0],b[1]-1,b[2]);
	var d = c.valueOf()+1000*60*60*24*t;
	var e = new Date(d);
		
	Year = e.getYear();
	Month = e.getMonth()+1;
	if (Month<10) Month = "0"+ Month;
	Day = e.getDate();
	if (Day<10) Day = "0"+ Day;
	SDate = Year +"-"+ Month +"-"+ Day;
			
	return SDate;
}


// 주민번호 확인 함수 1
function CheckJumin1(sid){
	var sid,sum,j,i,check		
	sum = 0	
	for(i=0;i<8;i++){		
		j = (i+2);		
		sum += parseInt(sid.substr(i,1)) * j;		
	}
	for(i=8;i<12;i++){
		j=(i+3)%9		
		sum += parseInt(sid.substr(i,1)) * j
	}
	check = sum % 11
	
	check = 11 - check
	if (check > 9) {
		check = check % 10
	}
	
	if (check == sid.substr(12)){
		if((parseInt(sid.substr(2,2))<13) && (parseInt(sid.substr(4,2))<32)){
			return true;
		}else{
			return false;
		}
	}else{
		return false;
	}
}

// 주민번호 확인 함수 2
function CheckJumin2(obj1, obj2) {
	var li_lastid,li_mod,li_minus,li_last;
	var value0,value1,value2,value3,value4,value5,value6;
	var value7,value8,value9,value10,value11,value12;
	var str1 = obj1.value ;
	var str2 = obj2.value ;
	
	if (IsInteger(str1) && IsInteger(str2)) {
		li_lastid = parseFloat(str2.substring(6,7));
		value0  = parseFloat(str1.substring(0,1)) * 2;
		value1  = parseFloat(str1.substring(1,2)) * 3;
		value2  = parseFloat(str1.substring(2,3)) * 4;
		value3  = parseFloat(str1.substring(3,4)) * 5;
		value4  = parseFloat(str1.substring(4,5)) * 6;
		value5  = parseFloat(str1.substring(5,6)) * 7;
		value6  = parseFloat(str2.substring(0,1)) * 8;
		value7  = parseFloat(str2.substring(1,2)) * 9;
		value8  = parseFloat(str2.substring(2,3)) * 2;
		value9  = parseFloat(str2.substring(3,4)) * 3;
		value10 = parseFloat(str2.substring(4,5)) * 4;
		value11 = parseFloat(str2.substring(5,6)) * 5;
		value12 = value0 + value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8 + value9 + value10 + value11;
		
		li_mod = value12 % 11;
		li_minus = 11 - li_mod;
		li_last = li_minus % 10;
		if (li_last != li_lastid)
			return false;
		else
			return true;
	} else
		return false;
}

// 업로드 파일체크 함수 (PHP/P/HTML/HTM/EXE)
function CheckFile(fileis) {
	var filename = fileis;

	if (!IsEmpty(filename)) {		// 파일 선택을 안한경우
	   return true;
	} else {						// 파일선택을 한 경우
		var ext = filename.split(".");
		if (ext[1].toUpperCase() == "PHP" || ext[1].toUpperCase() == "ASP" || ext[1].toUpperCase() == "HTML" || ext[1].toUpperCase() == "HTM" || ext[1].toUpperCase() == "EXE"){
			return false;
		}else{
			return true;
		}
	}
}

// 업로드 이미지체크 함수 (GIF/JPG/JPEG/BMP/PNG)
function CheckImage(fileis) {
	var filename = fileis;

	if (!IsEmpty(filename)) {			// 파일 선택을 안한경우
	   return true;
	} else {							// 파일선택을 한 경우
		var ext = filename.split(".");
		var extension = ext[ext.length-1];
		if (extension.toUpperCase()=="GIF" || extension.toUpperCase()=="JPG" || extension.toUpperCase()=="JPEG" || extension.toUpperCase()=="BMP" || extension.toUpperCase()=="PNG") {
			return false;
		}else{
			return true;
		}
	}
}

// 파일 사이즈 체크 : byte
function getFileSize(path, type)
{
	var img = new Image();
//	img.dynsrc = path;
	var size = img.fileSize;

	var resize;
	if (type =="k")
	{
		resize = size / 1024;
	} else if (type == "m")
	{
		resize = size / 1024 / 1024;
	} else {
		resize = size;
	}

	return resize;
}

// 파일 확장자 체크
function getFileExtension(inp)
{
	var lastidx = -1;
	lastidx = inp.lastIndexOf('.');
	var extension = inp.substring(lastidx+1, inp.length);

	return extension;
}

function CheckImage2(fileis) {
	var filename = fileis;

	if (!IsEmpty(filename)) {			// 파일 선택을 안한경우
	   return true;
	} else {							// 파일선택을 한 경우
		var ext = filename.split(".");
		var extension = ext[ext.length-1];
		if (extension.toUpperCase()=="GIF" || extension.toUpperCase()=="JPG" || extension.toUpperCase()=="JPEG" || extension.toUpperCase()=="BMP" || extension.toUpperCase()=="PNG") {
			return false;
		}else{
			return true;
		}
	}
}

// 새창띄우기 함수(사이즈 수동조절)
function PopupWin(url, name, width, height) {
	var url = url;
	var name = name;
	var width = width;
	var height = height;
	window.open(url, name,"toolbar=yes,location=no,directories=no,status=yes,menubar=no,scrollbars=yes,resizable=yes,width="+ width +",height="+ height +",left=100,top=100");
}

// 플래시 태그 불러오기 함수
function FlashTagChange(FileName, Width, Height) {
	document.write('<OBJECT codeBase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0"  width="'+ Width +'" height="'+ Height +'" classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000">');
	document.write('	<PARAM NAME="_cx" VALUE="25135">');
	document.write('	<PARAM NAME="_cy" VALUE="5927">');
	document.write('	<PARAM NAME="Movie" VALUE="'+ FileName +'">');
	document.write('	<PARAM NAME="Src" VALUE="'+ FileName +'">');
	document.write('	<PARAM NAME="WMode" VALUE="Window">');
	document.write('	<PARAM NAME="Play" VALUE="-1">');
	document.write('	<PARAM NAME="Loop" VALUE="-1">');
	document.write('	<PARAM NAME="Quality" VALUE="High">');
	document.write('	<PARAM NAME="Menu" VALUE="-1">');
	document.write('	<PARAM NAME="Scale" VALUE="ShowAll">');
	document.write('	<PARAM NAME="DeviceFont" VALUE="0">');
	document.write('	<PARAM NAME="EmbedMovie" VALUE="0">');
	document.write('	<PARAM NAME="SeamlessTabbing" VALUE="1">');
	document.write('	<PARAM NAME="Profile" VALUE="0">');
	document.write('	<PARAM NAME="ProfilePort" VALUE="0">');
	document.write('	<embed src="'+ FileName +'" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash"  width="'+ Width +'" height="'+ Height +'"> </embed>');
	document.write('</OBJECT>');
}

// 웹에디터 태그 불러오기 함수 (등록:A, 수정:B)
function WebEditTagChange(Type) {
	document.write('<OBJECT ID="MyunginWebEditor" TABINDEX="5" style="width:580; height:600;" CLASSID="CLSID:27E95E65-3DC4-4F49-A4CF-3B0610F6ACF6" CODEBASE="/Editor/miweadctrl.cab#Version=1,5,1,10">');
	if (Type=="B") {
		document.write('	<PARAM NAME="LoadURL" Value="'+ LoadURL +'">');
	}
	document.write('	<PARAM NAME="ShowPreview" Value="1">');
	document.write('	<PARAM NAME="ShowHelp" Value="0">');
	document.write('	<PARAM NAME="ViewType" Value="1">');
	document.write('	<PARAM NAME="MaxFileCount" Value="0">');
	document.write('	<PARAM NAME="MaxFileSize" Value="0">');
	document.write('	<PARAM NAME="MaxTotalSize" Value="1024">');
	document.write('	<PARAM NAME="AutoProxy" Value="1">');
	document.write('	<PARAM NAME="ShowInsertLayer" Value="1">');
	document.write('</OBJECT>');
}

// 각종 검색 파업창 띄우기 함수 (달력 검색) : http
function CalenderIt(formname, fieldname) {

	var url = "/00_include/global/Search_Calender.php?FormName="+ formname +"&FieldName="+ fieldname;
	window.open(url, 'CALENDER',"toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no,left=100,top=100,width=10,height=10");
}

// 각종 검색 파업창 띄우기 함수 (달력 검색) : https
function CalenderItSSL(formname, fieldname) {
	var url = "https://www.elancer.co.kr/00_include/global/Search_Calender.php?FormName="+ formname +"&FieldName="+ fieldname;
	window.open(url, 'CALENDER',"toolbar=no,location=no,directories=no,status=no,menubar=no,scrollbars=no,resizable=no,left=100,top=100,width=10,height=10");
}

function OnlyNumber()
{
	if((event.keyCode<48) || (event.keyCode>57))

	{
		event.returnValue=false;
    }
}

function new_bg(){
	var bg_html = "<div class='new_alert_bg' style='position: fixed; top: 0px; left: 0px; width: 100%; height: 100%; text-align: center; z-index: 5; display: inline; background: url(\"/images/popup/bg_popup.png\") repeat;'></div>";
	$("body").append(bg_html);
}

function new_alert(comment){
	var comment = comment;
	new_bg();
	var alert_html = "<div class='layer_pop_st03 layer_pop_st04' style='position:fixed;top:30%;left:40%;width:426px;height:281px;margin-top:-16px;'><div class='pop_header'><h3 class='popup_tit03'>알림!</h3><a href='javascript:void(0);' class='fr' id='close' onclick='alert_delete();'><img src='/images/popup/btn_popup_close.jpg' alt='닫기'></a></div><div class='body' style='text-align:center;'><p class='id_txt01' style='line-height:30px;'>"+comment+"</p></div></div>";
	$(".new_alert_bg").append(alert_html);
}

function alert_delete(){
	$('.new_alert_bg').remove();
}

// 
