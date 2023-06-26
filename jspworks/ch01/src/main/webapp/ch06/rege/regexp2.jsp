<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 function checkMember(){
	let form = document.member;
	let id = form.id.value;
	let pw = form.passwd.value;
	

	 
	//정규 표현식
	let regExpId = /^[a-zA-Z가-힣]/;
	let regExpPasswd= /^[0-9]+$/;
	let regExpName = /^[a-zA-Z가-힣]+$;
	let regExpPhone = /^[a-zA-Z가-힣]+$;
	
	if(!regExpId.test(id)){
		alert("아이디는 문자로 시작해주세요.");
		form.id.select();
		return false;
	}

	if(pw == ""|| !regExpPasswd.test(pw)){
		
		alert("비밀번호는 숫자만 입력해주세요");
		form.passwd.select();
		return false;
		
	}
	if(name == "" || !regExpName.test(name)){
		alert("이름을 제대로 입력하세요");
		form.uname.select();
		return false;
	} 

	form.submit();
	 
	
	
}

</script>

</head>
<body>
<form action="validation_process.jsp" method="post" name="member">
     
		<p> 
			<label for="id">아이디 </label>
			<input type="text" id="id" name="id">
		</p>
		<p> 
			<label for="passwd">비밀번호</label>
			<input type="password" id="passwd" name="passwd">
		</p>
		<p> 
			<label for="uname">이름</label>
			<input type="text" id="uname" name="uname">
		</p>
		<p> 
		연락처<select name="phone1">
			<option>010</option>
			<option>02</option>
			<option>031</option>
			<option>041</option>
			</select>
			-<input type="text" id="pahone2" name="phone2" maxlength=4 size=4>
			-<input type="text" id="phone3" name="phone3" maxlength=4 size=4>
		</p>
		
		
		
		<input type="button" value="가입하기" onclick="checkMember()"> 
		<input type="reset" value="다시쓰기">
	</form>
</body>
</html>