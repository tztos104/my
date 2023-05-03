#re 모듈을 임포트함
import re
#/정규표현식/g -> re.compile("정규표현식")

#소문자 a부터 z까지 일치하는 문자를 반복해서 찾음
p= re.compile("[a-z]+")

#match()- 일치하는 문자를 찾는 함수
#search() -전체중에 특정문자를 찾는 문자
m1 = p.match('afternoon')
print(m1)
print(m1.group())

m2 = p.match('a good luck') #뛰어쓰기인식해 못찾음, 앞에 숫자있어도 못찾음
print(m2)

s1= p.search('2023 good luck')
print(s1)
print(s1.group())

#findall() 문자열을 검색 : 결과를 리스트로 반환
#re.IGNORECASE- 대소문자 허용

str = "Two is too"
m1 = re.findall("T[wo]o", str)
print(m1) #[Two]

m2 = re.findall("T[wo]o", str, re.IGNORECASE)
print(m2) #[Two, too]

m3 = re.findall("T[^w]o", str, re.IGNORECASE)
print(m3) #[Two, too]