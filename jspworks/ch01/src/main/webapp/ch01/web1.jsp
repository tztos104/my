<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>hello</title>
<style>
	#content{width: 90%; margin: 20px auto; text-allign: center;}
</style>
<script>
	//디지털 시계
	setInterval(myWatch, 1000);
	function myWatch() {
		let date = new Date();
		let now = date.toLocaleTimeString();
		document.getElementById("demo").innerHTML = now;
		
	}
		
</script>

</head>
<body>
	<div id="content">
	<h1> 처음 만드는 웹페이지</h1>
	<h3> 현재 날짜와 시간은 <%= LocalDateTime.now() %></h3>
	<% 
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		String current_time = now.format(datetime);
		
		//5초후 새로고침
		//response.setIntHeader("Refresh", 5);
		
	%>
	<h3> 현재 날짜와 시간은 <%= current_time %></h3>
	<img src="../resources/images/time.jpg" alt="손시계">
	<p id ="demo"></p>
	</div>
</body>
</html>