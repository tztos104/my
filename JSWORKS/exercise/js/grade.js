let jum = prompt("점수를 입력하세요")
jum=parseInt(jum)
let grade;

if(jum < 60 && jum >= 0){
   
    grade= "F" ;
    document.write("당신의 학점은<span>"+ grade +"</span>입니다")
}
else if(jum >= 60 && jum < 70){
   
    grade= "D" ;
    document.write("당신의 학점은<span>"+ grade +"</span>입니다")
}
else if(jum >= 70 && jum < 80){
    
    grade= "C" ;
    document.write("당신의 학점은<span>"+ grade +"</span>입니다")
}
else if(jum >= 80 && jum < 90){
   
    grade= "B";
    document.write("당신의 학점은<span>"+ grade +"</span>입니다")
}
else if(jum >= 90 && jum <= 100){
    
    grade= "A";
    document.write("당신의 학점은<span>"+ grade +"</span>입니다")
}
else(document.write("잘못된 점수입니다. 다시 입력하세요"))

