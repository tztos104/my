window.onload= function(){
let id = document.getElementById("user-id");
let pw1 = document.getElementById("user-pw1");
let pw2 = document.getElementById("user-pw2");

id.onchange =checkId;
pw1.onchange =checkPw;
pw2.onchange =comparPw;

function checkId(){
    if(id.value.length<4 || id.value.length > 12){
        alert("4~12 자리로 입력해 주세요")
        id.select(); //현쟈 택스트 범위 선택
    }
}

function checkPw(){    
    if(pw1.value.length <8 ){
        alert("비밀번호는 8자리 이상입니다")
        pw1.select()

    }
}
function comparPw(){
    if(pw1.value != pw2.value){
        alert("비밀번호는 동일해야 합니다.");
        pw2.select();
    }
}
}