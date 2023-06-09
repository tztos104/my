<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점 처리</title>
<script>
	//점수를 입력하지 않았거나 문자인 경우 처리
	function checkScore(){
		let form= document.form1;
		let score = form.score;
		
		if(score.value.trim() == "" || isNaN(score.value) ){
			alert("숫자를 입력해 주세요");
			score.focus();
			return false;
		}else if(score.value < 0 || score.value >100){
			alert("0~100점까지 입력해주세요.");
			score.focus();
			return false;
		}else{
			form.submit();
		}
		
	}
	function submitForm(event) {
		event.preventDefault(); // 폼 제출 동작 막기
		checkScore(); // 점수 유효성 검사
	}

</script>
</head>
<body>
	<h3>점수를 입력해 주세요.</h3>
	<form action="scoreTest.jsp" method="get" name="form1" onsubmit="submitForm(event)">
		<p>점수: <input type="text" name="score">
				<input type="button" value="학점 출력" onclick="checkScore()">
		</p>
	
		
	
	</form>
	
</body>
</html>