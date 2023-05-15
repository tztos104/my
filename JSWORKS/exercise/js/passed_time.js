//Date 객체 생성
let today = new Date(); //현재일
let theDay = new Date("2023-1-1"); //1월 1일

let passedTime = today.getTime() - theDay.getTime();
console.log(passedTime+"ms")

//일로 환산
passedTime = Math.round(passedTime/(24*60*60*1000))

document.getElementById("day").innerHTML = passedTime
