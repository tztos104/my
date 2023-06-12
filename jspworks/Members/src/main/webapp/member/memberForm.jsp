<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"/> <!-- 해더 삽입 -->
	<div id = "container">
		<section id="register">
			<h3> 회원 가입</h3>
			<form action="addMember.do" method="post">
			<fieldset>
			<ul>
                    <li>
                        <label>아이디</label>
                        <input type="text" name="memberId">
                    </li>
                    <li>
                        <label>비밀번호</label>
                        <input type="password" name="passwd1">
                    </li>
                    <li>
                        <label>비밀번호 확인</label>
                        <input type="password" name="passwd2">
                    </li>
                    <li>
                        <label>이름</label>
                        <input type="text" name="name">
                    </li>
                    <li>
                        <label>성별</label>
                        <label class="radio">
                            <input type="radio" name="gender" value="남" checked>남
                        </label>
                        <label class="radio">
                            <input type="radio" name="gender" value="여">여
                        </label>
                    </li>
                </ul>
			
			</fieldset>
			     <div class="button">
                <input type="submit" value="가입">
                <input type="reset" value="취소">
            </div>
			</form>
		
		
		</section>
	
	
	</div>

</body>
<jsp:include page="../footer.jsp"/> <!-- 푸더 삽입 -->
</html>