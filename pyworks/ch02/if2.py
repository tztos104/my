#다중 조건문 - if~elif else
#놀이공원 입장료 계산

print("♣ 놀이 공원 입장료 계산♣")
age = int(input("나이를 입력해주세요\n"))


if age < 8:
    print("미취학아동입니다.")
    charge = 1000
elif 8<=age<14 :
    print("초등학생입니다.")
    charge = 2000
elif 14<=age<20 :
    print("중,고등학생입니다.")
    charge = 3000
elif 70>age>=20 :
    print("성인입니다.")
    charge = 4000
else :
    print("노인입니다.")
    charge = 3000

print("입장료는",str(charge),"원입니다.")
