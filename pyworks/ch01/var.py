

name = '이하나'

print(name)

grade= 2
print(grade)

school_class = 1
print(school_class)


print(name + "학생은" + str(grade) + "학년" + str(school_class)+"반입니다")


say="'힘내세요.' 라고 말했습니다."
print(say)

say2='"Python is very easy." hesays/'
print(say2)

#변수에 문자열을 여러줄로 작성(저장)
song1 = '''
동해물과 백두산이 마르고 닳도록~
아무것나 말하면 써지나요? ㅋㅋ
'''
print(song1)


# 진수 표현하기
num = 10
b_num= 0b1010 #이진수 표기법 (0b)을 붙임

print(b_num)

h_num = 0xA
print(h_num)

print(bin(8))
print(bin(9))
print(bin(10))
print(bin(11))
print(bin(12))
print(hex(8))
print(hex(9))
print(hex(10))
print(hex(11))
print(hex(12))
print(hex(13))

#변수 선원, 대입 연산자
#변수 값 바꾸기
#파란색 컵 1이 있고, 빨간색 컵 2가 있을대 두 값을 바꾸기

blue = 1
red = 2

#교환 처리
'''
yellow = blue
blue = red
red = yellow
'''
#파이썬 교환
blue, red = red , blue
print("blue =", blue, "red =", red)

print('='*20)
print('***회원가입***')
userid= 'ddksj'
userpw = 'dfsdf'
name = '한글'
phone = '010-2311-2390'
age='35'

print("아이디 :" , userid)
print("나이 : " + str(age))


































