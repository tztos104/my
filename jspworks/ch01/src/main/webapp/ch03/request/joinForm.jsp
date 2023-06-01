<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
     <h3>회원가입</h3>
     <form action="joinProcess.jsp" method="post">
     
		<p> 
			<lebel for="userid">아이디 </lebel>
			<input type="text" id="userid" name="userid">
		</p>
		<p> 
			<lebel for="passwd">비밀번호</lebel>
			<input type="passwd" id="passwd" name="passwd">
		</p>
		<p> 
			<lebel for="uname">이름</lebel>
			<input type="text" id="uname" name="uname">
		</p>
		<p> 
			<lebel for="phone">연락처</lebel>
			<input type="text" id="phone1" name="phone1" maxlength=3 size=3>
			-<input type="text" id="phone2" name="phone2" maxlength=4 size=4>
			-<input type="text" id="phone3" name="phone3" maxlength=4 size=4>
		</p>
		<p> 
			<lebel for="gender">성별</lebel>
			<input type="radio" value="남" id="gender" name="gender">남
			<input type="radio" value="여" id="gender" name="gender">여
		</p>
		<p> 
			<lebel for="hobby">취미</lebel>
			<input type="checkbox" id="hobby1" name="hobby" value="독서" checked>독서
			<input type="checkbox" id="hobby2" name="hobby" value="영화감상" >영화감상
			<input type="checkbox" id="hobby3" name="hobby" value="수영" >수영
			<input type="checkbox" id="hobby4" name="hobby" value="바둑" >바둑
			<input type="checkbox" id="hobby4" name="hobby" value="방탈출" >방탈출
			
		</p>
		<textarea row="3" cols="30" name="comment"></textarea> 
		
		<p><input type="submit" value="가입하기"> </p>
		<p><input type="reset" value="다시쓰기"> </p>
	</form>
     
     
     
     </form>

</body>
</html>