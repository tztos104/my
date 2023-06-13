<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>

	<jsp:include page="../header.jsp"/> <!-- 해더 삽입 -->

	<div id="container">
			<section id="memberlist">
	<h3> 회원목록입니다</h3>
	<div class="Logout">
		<p><a href="/logout.do">[관리자 로그아웃]</a></p>
	</div>
	<table id="tbl_list">
		<thead>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>성별</th>
				<th>가입일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${memberList}" var="member">
			<tr>
				<td><a href="/memberView.do?memberId=${member.memberId}">
				<c:out value="${member.memberId}"/></a></td>
				<td><c:out value="${member.passwd}"/></td>
				<td><c:out value="${member.name}"/></td>
				<td><c:out value="${member.gender}"/></td>
<%-- 				<td><c:out value="${member.joinDate}"/></td> --%>
				<td><f:formatDate value="${member.joinDate}"
						pattern="yyyy-MM-dd a hh:mm:ss"/></td>
				<td><a href="/deleteMember.do?memberId=${member.memberId}" onclick="return confirm('정말로 삭제하시겠습니까?')"><button type="button">삭제</button></a></td>
				
			</tr>
			</c:forEach>
		</tbody>
	
	</table>
	
	
		
	
		</section>
	</div>
</body>
<jsp:include page="../footer.jsp"/> <!-- 푸더 삽입 -->
</html>