//학생 5명의 국어, 수학 점수
//score 배열 선언, 값 저장

let score = [
    [80, 70],
    [90, 60],
    [70, 70],
    [100,100],
    [50, 100],
    [100, 60],
    [90, 90],
    [90, 90],
    [90, 90],
    [90, 90]
]

//전체 출력
for(let i=0; i<score.length; i++){
    for(let j=0; j<score[i].length; j++){
        document.write(score[i][j]+" ")
    }
    document.write("<br>")
}

//과목별 총점
let korSum=0 ,mathSum=0;

//국어 점수 :score [i][0] 
//수학 점수 :score [i][1]
for(let i=0; i<score.length; i++){
    korSum += score[i][0];
    mathSum += score[i][1];

} 
document.write("국어 총점 : " + korSum + "<br>")
document.write("수학 총점 : " + mathSum + "<br>")

//과목별 평균
let korAvg, mathAvg;

korAvg= korSum/score.length
mathAvg= mathSum/score.length

document.write("국어 평균 : " + korAvg + "<br>")
document.write("수학 평균 : " + mathAvg + "<br>")