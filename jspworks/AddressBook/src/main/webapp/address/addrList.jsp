<%@page import="address.AddrBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="adDAO" class="address.AddrBookDAO" scope="application"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소 목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<div id="container">
		<h2>주소록</h2>
		<hr>
		<p><a href="addrForm.jsp">주소추가</p>
		<table id="tbl_list">
			<thead>
			<tr>
				<th>이름</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th>성별</th>
			</tr>
		</thead>
		<tbody>
		<!-- ArrayList를 축력  -->
		<% 
			for(int i=0; i<adDAO.getList().size(); i++){
				AddrBook aB = adDAO.getList().get(i);
			
		%>
		<tr>
			<td><%= aB.getUsername() %></td>
			<td><%= aB.getTel() %></td>
			<td><%= aB.getEmail() %></td>
			<td><%= aB.getGender() %></td>
		
		</tr>
		<% } %>
		</tbody>
		</table>
	
	</div>
</body>
</html>