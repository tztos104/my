//유효성 검사
function checkMember(){
  let form =document.regForm
  let id= form.uid;
  let mail=form.email;
  let pw1 = form.pw1;
  let pw2 = form.pw2;

  let pw_pat1= /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}$/
//   let pw_pat2= /[!@#$%^&*]/ 

  if(id.value.length < 4){
    alert("아이디는 4~12자까지 가능합니다");
    id.select
    return false;
    }else if(mail.value == "" ){
        alert("이메일은 필수 입력항목입니다.")
        mail.focus();
        return false
    }else if(pw1.value.length<8 || !pw_pat1.test(pw1.value)
    ){
        alert("비밀번호는 영문자, 숫자 포함 8자리이상 입력해주세요")
        pw1.select();
        return false
    }else if(pw1.value != pw2.value ){
        alert("비밀번호는 동일해야합니다")
        pw2.select();
        return false
    }else{
        form.submit()
    }
}