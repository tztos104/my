<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
<c:if test="${empty sessionId}">
	<script >
	alert("로그인이 필요합니다.");
	location.href = "/loginForm.do";

	</script>

</c:if>
	<jsp:include page="../header.jsp"/> <!-- 해더 삽입 -->

	<div id="container">
		<section id="boardlist">
	<h3> 게시판목록입니다</h3>
	<table id="tbl_list">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>작성일</th>
				<th>조회수</th>
				<th>작성자</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach var="board" items="${boardList }">
				<tr>
				<td><c:out value="${board.bnum }"/> </td>
				<td><c:out value="${board.title }"/> </td>
				<td><c:out value="${board.regDate }"/> </td>
				<td><c:out value="${board.hit }"/> </td>
				<td><c:out value="${board.memberId }"/> </td>
				</tr>
				
				</c:forEach>
		
		</tbody>
	
	</table>
	
	
		
	
		</section>
	</div>
</body>
<jsp:include page="../footer.jsp"/> <!-- 푸더 삽입 -->
</html>