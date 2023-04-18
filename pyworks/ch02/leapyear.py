#연습문제
#2월 29일 -윤년, 4년마다 오고, 100년 단위는 아니나
#400년은 윤녕이다.
#조건 1- 4년마다 오고 #조건 2 100년 단위는 아니나 조건 3. 400년은 윤년
#출력-f string 방식 (format)

try:
    year = int(input("연도를 입력하세요"))



    if (year%4==0 and year%100 !=0 ) or year%400==0 :
    #print(str(year)+"년은 윤년입니다.")
        print(f'{year}년은 윤년입니다.')
    else:
        print(str(year)+"년은 평년입니다.")

except ValueError:
    print("숫자를 입력해 주세요")
