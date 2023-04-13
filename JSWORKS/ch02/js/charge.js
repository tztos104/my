//놀이공원 입장료 계산
let age = prompt("나이를 입력해주세요","1")
age = parseInt(age)
let charge;

//if문 처리
if(age < 8 ){
   document.write("취학전 아동입니다.<br>");
   charge = 1000;
   
   document.write("입장료는 <span class='access'>"+ charge.toLocaleString(0) + "</span>원 입니다.") 
}
else if(age > 8 && age <= 14){document.write("초등학생 입니다.<br>")
charge = 2000
document.write("입장료는 <span class='access'>"+ charge.toLocaleString(0)+ "</span>원 입니다.") ;}


else if( age >= 14 && age <20){document.write("중,고등학생 입니다.<br>")
charge = 3000
document.write("입장료는 <span class='access'>"+ charge.toLocaleString(0)+ "</span>원 입니다.") ;}

else if( age > 20 && age <60){document.write("성인 입니다.<br>")
charge = 5000
document.write("입장료는 <span class='access'>"+ charge.toLocaleString(0)+ "</span>원 입니다.") ;}

else{document.write("노인 입니다.<br>")
charge = 4000
document.write("입장료는 <span class='access'>"+ charge.toLocaleString(0)+ "</span>원 입니다.") ;}