#산술연산자 + -* / %(나머지) // 몫  **거듭제곱

print('10 + 4 = ' , 10 + 4)
print('10 - 4 = ' , 10 - 4)
print('10 * 4= ' , 10 * 4)
print('10 / 4= ' , 10 / 4)
print('10 // 4= ' , 10 // 4)
print('10 % 4= ' , 10 % 4)
print('10 ** 4= ' , 10 ** 4)

#30개의 빵을 4명이 나눠가질때 몫과 나머지 구하기

#변수 bread, people

bread = 30
people =4

a= int(bread/people)
b= bread%people

print('몫=' , a)
print('나머지= ' , b)


#비교 연산자 - 결과 True/False

x= 10
y= - 10

print(x>0)
print(y>0)
print()
print(x>y)
print(x<y)
print()
print(x==10)
print(x==y)
print(x !=y)
print()
#논리 연산자 - 비교연산이 2번 이상 사용하면 -결과 true /false
#and, or, not
print(x>0 and y>0)
print(x>0 or y>0)
print(not y>0)
print()


#문자열 더하기(+) 곱하기(*)
head = "python"
tail = " is fun"
print(head + tail )

str = '안녕'
print(str*5)

#이스케이프 문자
#줄바꿈 = '\n' , 탭- '\t'

table = """
이름 \t 나이 \t 지역
을지문덕 \t 40 \t 개성
세종대왕 \t 50 \t 서울
"""
print(table)

say = "'힘내세요!!' \n 라고 말했습니다."
print(say)













































