
<%@page import="lancer.c_join.model.e_joinDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("utf-8");
    %>
    <jsp:useBean id="e_join" class="lancer.c_join.model.e_join"></jsp:useBean>
    <jsp:setProperty property="*" name="e_join"/>
    <%
    	e_joinDAO dao = e_joinDAO.getInstance();
    	dao.insert_e_join(e_join);
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>