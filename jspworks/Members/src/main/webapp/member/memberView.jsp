<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"/> <!-- 해더 삽입 -->
	<div id = "container">
		<section id="register">
			<h3> 회원 정보</h3>
			<table>
				<tbody>
					<tr>
						<td><label>아이디</label></td>
						<td><input type="text" name="memberId" value="${member.memberId }" readonly="readonly"></td>
					</tr>
					<tr>
						<td><label>비밀번호</label></td>
						<td><input type="password" name="passwd" value="${member.passwd }" readonly="readonly"></td>
					</tr>
					<tr>
						<td><label>이름</label></td>
						<td><input type="text" name="name" value="${member.name }" readonly="readonly"></td>
					</tr>
					<tr>
						<td><label>성별</label></td>
						<td>
						<c:if test="${member.gender eq '남' }">
						<input type="radio" name="gender" value="남" checked readonly="readonly">남
						<input type="radio" name="gender" value="여" readonly="readonly" >여</td>
						</c:if>
						<c:if test="${member.gender eq '여' }">
						<input type="radio" name="gender" value="남" readonly="readonly" >남
						<input type="radio" name="gender" value="여" checked readonly="readonly">여</td>
						</c:if>
					</tr>
					<tr>
						<td><label>가입일</label></td>
						<td><input type="text" name="joindata" value="${member.joinDate }" readonly="readonly"></td>
					</tr>
					<tr>
						<td colspan="2"><a href="/memberList.do"></a><button type="button">목록</button></td>
						
					</tr>
				</tbody>
			</table>	
		
		</section>
	
	
	</div>

</body>
<jsp:include page="../footer.jsp"/> <!-- 푸더 삽입 -->
</html>