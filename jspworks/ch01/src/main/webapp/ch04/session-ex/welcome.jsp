<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=session.getAttribute("userId") %>임 환영합니다.</h3>
	<h3><a href="session_out.jsp">로그아웃</a></h3>
</body>
</html>