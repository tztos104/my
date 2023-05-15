#mach() search() 객체의 메서드
import re

p= re.compile('[a-z]+')
m= p.match('hello')

print(m.group()) #문자열 출력
print(m.start()) #시작 인덱스 -0
print(m.end())  #끝 인덱스 5(5-1)
print(m.span()) #구간(시작,끝)

str = "lee 010-1234-5678"
pat = re.compile("(\w+)\s{1,2}(\d+[-]\d{3,4}[-]\d{4})") #공백이 1개나 2개
mat = pat.match(str)
print(mat)
print(mat.group())
print('이름:',mat.group(1))
print('전화번호:' , mat.group(2))

#그룸핑된 문자열에 이름 붙이기
#정규 표현식 -(?P<그룹이름>)
pat2 = re.compile('(?P<name>\w+)\s{1,2}(?P<phone>\d+[-]\d{3,4}[-]\d{4})')
mat2 = pat2.match(str)
print('이름:'+ mat2.group('name'))
print('전화번호:'+ mat2.group('phone'))

# sub(\g<그룹이름>)
s1 = pat2.sub('\g<name>', 'park 010-3333-4444')
print(s1)
s2 = pat2.sub('\g<phone>', 'park 010-3333-4444')
print(s2)

#문자열 바꾸기
pat3 = re.compile('(\d+)[-]\d+')
date = """
    kim 871212-1234567
    lee 821322-2244567
"""
jumin = pat3.sub('\g<1>-******', date)
print(jumin)

#전화번호 맨끝자리 ***
pat4 = re.compile('(\d+)[-](\d{4}+)[-](\d{4})')
phone = """
    kim 010-2312-2390
    gim 010-2311-2394
    kim 010-5311-2340
    mki 010-2211-2393
"""
ads =  pat4.sub('\g<1>-\g<2>-****', phone)
print(ads)