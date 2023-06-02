<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function checkForm(){
		//alert("testing")
		alert("아이디: " + document.loginForm.userid.value + "\n"+
				"비밀번호: " +document.loginForm.passwd.valuedocument.loginForm. )
	}

</script>

</head>
<body>
	<form action="loginProcess.jsp" method="post" name="loginForm">
		<p> 
			<lebel for="userid">아이디 </lebel>
			<input type="text" id="userid" name="userid">
		</p>
		<p> 
			<lebel for="passwd">비밀번호</lebel>
			<input type="passwd" id="passwd" name="passwd">
		</p>
		<p><input type="submit" value="로그인" onclick="checkForm()"> </p>
	</form>
</body>
</html>