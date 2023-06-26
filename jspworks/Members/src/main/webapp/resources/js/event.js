function play(){

            let name = ['이진성', '노승우', '박성호', '권지혜', '김은효', '이경철', '성의석', '이유진', '유성길', '한주훈', 
                '강정현', '김현우', '이영준', '김민정', '유세현', '윤기은', '오화룡', '조은별', '이가은', '안재훈'];
            let numbers = new Array(5); //랜덤 번호 5개 저장할 배열 선언
        
                for(let i = 0; i < numbers.length; i++){
                let num = Math.floor(Math.random() * name.length); //랜덤 번호
                numbers[i] = num;      
                console.log(numbers);

                // 중복 제거
                for(let j = 0; j < i; j++){
                    if(numbers[j] == numbers[i]){
                        console.log("중복 번호 : " + numbers[i])
                        i--;  //중복된 인덱스 삭제함
                    }
                }
            }

            //출력

            let winners = new Array(5); //당첨자 이름을 저장할 배열선언
            for(let i =0; i<winners.length; i++){
                winners[i]= name[numbers[i]];

            }
                document.getElementById("display").innerHTML = winners;
    }
    
   function checkMember(){
		let form = document.member;
		let id = form.memberId.value;
		let pw1 = form.passwd1.value;
		let pw2 = form.passwd2.value;
		let name = form.name.value;
		
		//정규 표현식
		let pw_pat1 = /[0-9]+/ //숫자만
		let pw_pat2 = /[a-zA-Z]+/ //영어만
		let pw_pat3 = /[~!@#$%^&*()_=/]+/ //특수문자만
		
		if(id.length <4 || id.lenfth > 15){
			alert("아이디는 4~15자까지 입력가능합니다");
			form.memberId.select();
			return false;
		}else if(pw1.length <8 || !pw_pat1.test(pw1)|| !pw_pat2.test(pw1) ||!pw_pat3.test(pw1)){
			alert("비밀번호는 영문자, 숫자, 특수문자 포함 8자 이상입니다.")
			form.passwd1.select();
			return false;
		}else if(pw1 != pw2){
			alert("비밀번호가 일치하지 않습니다.")
			form.passwd2.select();
			return false;
		}else if(pw_pat3.test(name) || name =="" || pw_pat1.test(name)){
			alert("이름을 정확히 입력해주세요.")
			form.passwd2.select();
			return false;
		}
		form.submit();
	}
