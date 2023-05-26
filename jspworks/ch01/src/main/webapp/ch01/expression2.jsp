<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>짝수 홀수 프로그램</title>
</head>
<body>
	<h2>짝수/홀수 판정 프로그램</h2>
	<% 
	String result = "";
	int Num = 17;	
	if(Num % 2 == 0){
	result = "짝수";
	}else if(Num % 2 != 0){
	result = "홀수"; 
		}else{
		
	}
	
		
	%>
	<p>결과는 <%= result %></p>
</body>
</html>