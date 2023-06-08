<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8"); %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<style>
#container{margin: 0 auto; text-align: center;}
select{padding: 5px;}
</style>
</head>
<jsp:useBean id="product" class="product.Product" scope="session"/>
<jsp:setProperty property="productList" name="product"/>
<body>
	<div id="container">
		<h2>상품 목록</h2>
		<hr>
		<form action="selProduct.jsp" method="post">
			<select name="select">
			<c:forEach var="product" items="${product.productList }">
				<option><c:out value="${product}"/> </option></c:forEach>
				
			
			</select>
			<button type="submit">선택</button>
		
		
		</form>
	
	</div>
</body>
</html>