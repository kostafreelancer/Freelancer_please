<%@page import="net.sf.json.JSONArray"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="lancer.f_mypage.model.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	/* Calendar cal = new Calendar();
	cal.setCalendar_num(1);
	cal.setContents("약속이지롱");
	cal.setF_num(1);
	cal.setEnddate("2017-05-17");
	cal.setStartdate("2017-05-17");
	
	Calendar cal2 = new Calendar();
	cal2.setCalendar_num(2);
	cal2.setContents("두번째약속");
	cal2.setF_num(1);
	cal2.setEnddate("2017-05-19");
	cal2.setStartdate("2017-05-19");
	
	List<Calendar> list = new ArrayList<Calendar>();
	list.add(cal);
	list.add(cal2);
	
	String str = JSONArray.fromObject(list).toString();
	out.print(str); */
	
%>
[
	{
		title : '밥먹기',
		start : '2017-05-17',
		end : '2017-05-17'
	},
	{	
		title : '집가기',
		start : '2017-05-02',
		end : '2017-05-02'
	}
]
</head>
<body>

</body>
</html>