let playAgain = true;

while (playAgain) {
  console.log("가위바위보 게임을 시작합니다!");
  console.log("1: 가위, 2: 바위, 3: 보");

  // 사용자의 선택 받기
  let userChoice = parseInt(prompt("선택:?? "));

  // 컴퓨터의 선택 랜덤으로 받기
  let computerChoice = Math.floor(Math.random() * 3) + 1;

  // 선택에 따른 결과 출력하기
  if (userChoice === 1) { // 사용자가 가위를 선택한 경우
    if (computerChoice === 1) {
      document.write("비겼습니다!");
    } else if (computerChoice === 2) {
        document.write("컴퓨터가 이겼습니다!");
    } else {
        document.write("사용자가 이겼습니다!");
    }
  } else if (userChoice === 2) { // 사용자가 바위를 선택한 경우
    if (computerChoice === 1) {
        document.write("사용자가 이겼습니다!");
    } else if (computerChoice === 2) {
        document.write("비겼습니다!");
    } else {
        document.write("컴퓨터가 이겼습니다!");
    }
  } else if (userChoice === 3) { // 사용자가 보를 선택한 경우
    if (computerChoice === 1) {
        document.write("컴퓨터가 이겼습니다!");
    } else if (computerChoice === 2) {
        document.write("사용자가 이겼습니다!");
    } else {
        document.write("비겼습니다!");
    }
  } else {
    document.write("잘못된 입력입니다. 다시 입력해주세요.");
    continue;
  }

  // 게임을 계속할지 종료할지 선택 받기
  let answer = prompt("게임을 계속하시겠습니까? (y/n): ");
  if (answer.toLowerCase() === 'n') {
    playAgain = false;
  }
}

console.log("게임을 종료합니다.");