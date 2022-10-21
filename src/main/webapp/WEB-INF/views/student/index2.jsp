<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thyme Leaf.org">
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<fmt:setLocale value="vi-VN" scope="session" />
 <c:set var="cLat" value="69.420"/>
 <head> 
 <meta charset="utf-8"> 
 <title>Spring MVC</title> 
 <base href="$(pageContent.servletContext.contextPath)" /> 
 <style> 
li{
	list-style: none; 
	line-height: 25px; 
}

li>label{ 
	display: inline-block; 
	text-align: right;
	width: 150px; 
	font-variant: small-caps; 
	font-weight: bold;
}
</style> 
</head> 
<body> 
	<h1>EL & JSTL</h1> 
	<ul> 
		<li><label> Ho Ten:</label> ${bean.name}</li> 
		<li><label>Diem TB: </label> ${bean.mark}</li> 
		<li><label>Chuyen Ngành:</label> ${bean.major}</li>
		<li><label>Danh Hieu:</label> ${bean.danhhieu}</li>
		<li><label>Xep loai:</label> ${bean.xeploai}</li>
		
	</ul> 
	
	<ul> 
		<li><label>Ho Ten:</label> ${list[1].name}</li> 
		<li><label>Diem TB:</label> ${list[1].mark}</li> 
		<li><label>Chuyen Nganh:</label> ${list[1].major}</li>
		<li><label>Danh Hieu:</label> ${list[1].danhhieu}</li>
		<li><label>Xep loai:</label> ${list[1].xeploai}</li>
	</ul> 
	
	<ul> 
		<li><label>Ho Ten:</label> ${list[2].name}</li> 
		<li> <label>Diem TB:</label> ${list[2].mark}</li> 
		<li><label>Chuyen Nganh:</label> ${list[2].major}</li>
		<li><label>Danh Hieu:</label> ${list[2].danhhieu}</li> 
		<li><label>Xep loai:</label> ${list[2].xeploai}</li>
		
	</ul> 
</body> 
</html>
		
 
