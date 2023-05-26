<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문 테그</title>
</head>
<body>
<!-- 선언문 태그  -->
<%  int num1 = 10, num2 =-10;
	int sum;


 sum = num1 + num2;
out.println("합계: " + sum); //out -내장 객체(앞에 system 없어도됨)
out.println("<br>"); //한줄 공백
	for(int i=0; i<=10; i++){
		if(i % 2 == 0){
		out.println(i);}
			
	}

%>
<!--  표현문 태그 -->
<p>합계 : <%= sum %> </p>

</body>
</html>