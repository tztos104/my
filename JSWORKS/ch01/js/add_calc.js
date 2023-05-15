let n1 =prompt("첫번째 수 입력:", "1~50")
let n2 =prompt("두번째 수 입력:", "1~50")
let n3 =prompt("세번째 수 입력:", "1~50")
let n4 =prompt("네번째 수 입력:", "1~50")
let sum_v;

sum_v = parseFloat(n1) +parseFloat(n2) + parseFloat(n3) + parseFloat(n4)

document.write(sum_v.toFixed(2))
// tofixed 소수자리 설정

