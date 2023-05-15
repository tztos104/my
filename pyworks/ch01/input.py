#input()함수


# print("이름을 입력해 주세요")
# name = input()
# print(name + "님 환영요!!")


#방법2
# name= input("이름을 입력해주세요 ")
# print(name)
"""
#입력 받은 수는 문자열림-> 정수로 변환 int()함수 사용
number = int(input("숫자를 입력해 주세요(1~10)"))
print(number *10)

#두수를 입력받아 합을 계산하기
x= int(input("첫째 수 입력 : " ))
y= int(input("둘째 수 입력 : " ))
sum_v = x + y
print(sum_v)
"""

#나이계산 프로그램
x= int(input("태어난 연도를 입력하세요 : "))
age= 2023-x +1
print(str(age) + "세")

#사각형 계산
가로 = int(input("가로의 길이를 입력하세요"))
세로 = int(input("세로의 길이를 입력하세요"))
면적= 가로*세로
print("가로 길이 : "+str(가로) + "cm")
print("세로 길이 : "+str(세로) + "cm")
print("면적 : "+str(면적) + "cm") 










