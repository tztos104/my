window.onload = function(){

//체크박스 속성에 이벤트 처리하기
let check = document.querySelector("#shippingInfo");

check.addEventListener("click", checkBox);

let billibgName= document.getElementById("billingName")
let shippingName= document.getElementById("shippingName")
let billibgTel= document.getElementById("billingTel")
let shippingTel= document.getElementById("shippingTel")
let billibgAddr= document.getElementById("billingAddr")
let shippingAddr= document.getElementById("shippingAddr")

function checkBox(){
    if(check.checked== true){
     shippingName.value= billibgName.value;
     shippingTel.value= billibgTel.value;
     shippingAddr.value= billibgAddr.value;

    }else{
        shippingName.value= "";
        shippingTel.value= "";
        shippingAddr.value= "";
    }
}}