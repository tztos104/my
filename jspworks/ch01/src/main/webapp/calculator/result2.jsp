<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <jsp:useBean id="calc" class="beans.Calculator"/>
   <jsp:setProperty property="num1" name="calc"/>
   <jsp:setProperty property="num2" name="calc"/>
   <jsp:setProperty property="op" name="calc"/>
   
<link rel="stylesheet" href="../resources/css/style.css">
	<div id="container">
		<h2>계산기</h2>
		<hr>
 <% 
  	//계산하는 함수 호출
 	calc.calculate();
  %>
  <!--result는 getResult()와 같음  -->
 <p> 계산결과 :<jsp:getProperty property="result" name="calc"/> </p>
 </div>
 