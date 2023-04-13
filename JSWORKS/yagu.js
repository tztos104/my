// 1. 상대방이 선택한 3개의 숫자 생성
let answer = [];

function generateAnswer() {
    answer = [];
    while (answer.length < 3) {
        const randomNum = Math.floor(Math.random() * 10);
        if (!answer.includes(randomNum)) {
            answer.push(randomNum);
        }
    }
}

// 2. 플레이어가 입력한 3개의 숫자를 받아와, 상대방이 선택한 숫자와 비교
const input1 = document.getElementById('input-1');
const input2 = document.getElementById('input-2');
const input3 = document.getElementById('input-3');
const submitBtn = document.getElementById('submit-btn');
const resultBox = document.getElementById('result');
