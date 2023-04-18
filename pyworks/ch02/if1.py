#삼항 연산자 - 조건 연산자 사용안함
#들여쓰기 indent-인덴트 되어야함 

"""
if 조건식:
    실행 1
else
    실행 2

x= 10
y=-10

if x>y :
    print("T")
else:
    print("F")
"""
#자동차 주행 제한속도가 50km 이상이면 "안전속도 위반!!"
#아니면 안전속도 준수
limit_speed= int(input("현재속도를 입력하세요"))

if 80>limit_speed >=50 :
    print("안전속도 위반!! 과태료 10만원 부과합니다! ")
    print("현재속도는", str(limit_speed), "km 입니다")
elif limit_speed >=80:
    print("안전속도 위반!! 과태료 100만원 부과합니다! ")
    print("현재속도는", str(limit_speed), "km 입니다")
else :
    print("안전속도 준수")
    print("현재속도는", str(limit_speed), "km 입니다")
