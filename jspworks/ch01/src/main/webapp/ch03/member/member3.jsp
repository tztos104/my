<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Java Beans</title>
</head>
<body>
	<jsp:useBean id="member" class="beans.MemberBeen"/>
	<jsp:setProperty property="id" name="member" value="2023777"/>
	  <jsp:setProperty property="name" name="member" value="이땡땡"/>
	<p> 아이디:<jsp:getProperty property="id" name="member"/> </p>
	<p> 이 름: <jsp:getProperty property="name" name="member"/> </p>
</body>
</html>