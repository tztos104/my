<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<c:if test="${empty sessionId}">
		<script >
			alert("로그인을 해주세요")
			location.href = "/loginForm.do";
		</script>
	
	</c:if>

	<jsp:include page="../header.jsp"/> <!-- 해더 삽입 -->
	<div id = "container">
		<section id="board_detail">
			<h3>글쓰기</h3>
			<table>
				<tbody>
					<tr>					
						<td>
							<input type="text" name="title" value="${board.title }" readonly="readonly"> 
						</td>
					</tr>
					<tr>
						<td>
							<textarea rows="8" cols="100" readonly="readonly" >${board.content }</textarea>
						</td>
					</tr>
					<tr>					
						<td>
							
							<c:out value="글쓴이:  ${board.memberId}" /> 
							<c:if test="${empty board.modifyDate }">
							 (작성일: <f:formatDate value="${board.regDate}" 
	            				   	  				pattern="yyyy-MM-dd hh:mm:ss"/>)
	            			</c:if >
	            			<c:if test="${not empty board.modifyDate }">
	            			 (수정일: <f:formatDate value="${board.modifyDate}" 
	            				   	  				pattern="yyyy-MM-dd hh:mm:ss"/>)
	            			</c:if>
							 
													</td>
					</tr>
					<tr>
						<td>
					 		<a href="/boardList.do"><button type="button">목록</button></a>
					 		<c:if test="${sessionId == board.memberId}">
					 		<a href="/updateBoard.do?bnum=<c:out value='${board.bnum }'/>">
					 		<button type="button">수정</button></a>
					 		<a href="/deleteBoard.do?bnum=${board.bnum}"
					 		onclick="return confirm('정말로 삭제하시겠습니까?')"><button type="button">삭제</button></a>
							</c:if>
												
						</td>
					</tr>
				</tbody>
			
			</table>
			
			    
               
           
           
           
           
		
		
		</section>
	
	
	</div>

</body>
<jsp:include page="../footer.jsp"/> <!-- 푸더 삽입 -->
</html>