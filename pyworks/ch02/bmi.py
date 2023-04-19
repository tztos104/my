#거듭 제곱 3 ** 2 = 3x3
num= 10
List= []
while True:
    name = input("이름을 입력하세요 :")
    hei = float(input("키를 입력해주세요 :"))
    wei =float(input("몸무게를 입력해주세요 : "))
    bmi = (wei/((hei/100)**2))
   
   
    #%s-문자 %f - 실수 %d- 정수 
    
    num-=1
    
    if bmi < 20:
        print("저체중입니다.")
        result= "저체중입니다"
    elif bmi<25:
        print("표준체중입니다.")
        result="표준체중입니다"
    elif bmi<30:
        print("과체중입니다.")
        result="과체중입니다"
    else:
        print("비만입니다.")
        result="비만입니다"

    List.append((name, hei, wei, bmi, result))    
    print('%s님의 bmi는 %.2f입니다.' % (name, bmi))
    if num == 0:
        break
        
print("입력된 자료:")
for i in List:
    print('%s님의 키는 %.1f cm, 몸무게는 %.1f kg, bmi는 %.2f 로 %s.' %(i[0],i[1],i[2],i[3],i[4]))



    
