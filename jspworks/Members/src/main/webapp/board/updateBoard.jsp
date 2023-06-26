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
			<h3>게시글 수정</h3>
			<form action="/updateProcess.do" method="post">
			<input type="hidden" name="bnum" value="${board.bnum }">
			<table>
				<tbody>
					<tr>					
						<td>
							<input type="text" name="title" value="${board.title }" > 
						</td>
					</tr>
					<tr>
						<td>
							<textarea rows="8" cols="100" name="content" >${board.content }</textarea>
						</td>
					</tr>
					
					<tr>
						<td>
					 		<a href="/boardList.do"><button type="button">목록</button></a>
					 		
					 		<button type="submit">저장</button></a>
					 		<button type="reset">취소</button></a>
																		
						</td>
					</tr>
				</tbody>
			
			</table>
			</form>
			    
               
           
           
           
           
		
		
		</section>
	
	
	</div>

</body>
<jsp:include page="../footer.jsp"/> <!-- 푸더 삽입 -->
</html>