<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:include page="../header.jsp"/> <!-- 해더 삽입 -->
	<div id = "container">
		<section id="login">
			<h3> 로그인</h3>
			<form action="/loginProcess.do" method="post">
			<fieldset>
			<ul>
                    <li>
                        <label>아이디</label>
                        <input type="text" name="memberId">
                    </li>
                    <li>
                        <label>비밀번호</label>
                        <input type="password" name="passwd">
                    </li>
                    
                </ul>
			
			</fieldset>
			     <div class="button">
                <input type="submit" value="로그인">
                <input type="button" value="회원가입">
            </div>
			</form>
		
		
		</section>
	
	
	</div>

</body>
<jsp:include page="../footer.jsp"/> <!-- 푸더 삽입 -->
</html>