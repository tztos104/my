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
			<form action="j_security_check" method="post">
			<%
				String error= request.getParameter("error");
			if(error != null){
				out.println("<div class='error'>");
				out.println("아이디와 비밀번호를 확인해주세요");
				out.println("</div>");
			}
			
			%>
			
			
			<fieldset>
			<ul>
                    <li>
                        <label>아이디</label>
                        <input type="text" name="j_username" placeholder="ID" required="required" autofocus="autofocus">
                    </li>
                    <li>
                        <label>비밀번호</label>
                        <input type="password" name="j_password" placeholder="PASSWORD" required="required">
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