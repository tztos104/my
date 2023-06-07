<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 출력</title>
</head>
<%int dan =Integer.parseInt(request.getParameter("dan")); %>
<body>
	<h2><%= dan %>단 출력</h2>
	<%
		//int dan = 2;
		
		for(int i=1; i<10; i++){
			out.println( dan+ " x " + i + "=" + (dan * i)+"<br>" );
		}
	%>
	
	
</body>
</html>