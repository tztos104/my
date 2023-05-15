import re


str = "123?45yy7890 hi 999 hello"

#pat =re.compile('\d{1,3}') #숫자 0~9에서 1개~3개까지 찾음 매칭
m= re.findall('\d{1,3}', str)
print(m)

#compile() : biye로 바꿈
#compile() 후에 fineall() 하면 검색할 내용이 많은 경우 속도가 빠름

m2 =re.findall('[1-5]{1,2}', str)
print(m2)

# '*', '+' 차이점
p = re.compile('ca*t') #* 앞문자가 0번이상 반복
a1 = re.findall(p, 'caaaaaaaaaaaaaaaaaat')
print(f'a1={a1}')
a2 = re.findall(p, 'ct')
print(f'a2={a2}')

p2 = re.compile('ca+t') #앞문자가 1번이상 반복(즉 없으면 못찾음)
a3 = re.findall(p2, 'caat')
print(f'a3={a3}')
a4 = re.findall(p2, 'ct')
print(f'a4={a4}')

#점(.)은 임의의 문자- 소괄호는 서브 클래스 (그룹)

str2 ="abcd<hr>Thank you"
pat1 = re.compile("<(.*)>")
b1 =re.findall(pat1, str2)
print(f'b1={b1}')

pat2 = re.compile("(.*)")