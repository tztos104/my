#문자열 -1차원 리스트
ss = "20230419Sunny"

#year=ss[:4]
year=ss[0:4]
day=ss[4:8]
weather = ss[8:]
print(year, day, weather)


#문자열 관련 함수
#split(구분기호)-> 문자열이 리스트로 변환
fruit = "banana, apple, strawberry"

fruit2 = fruit.split(',')
print(fruit2)


#replace('이전문자', '새문자')
str1 = 'Hello, World'
str1 = str1.replace('World', 'Korea')
print(str1)

#format()
str2 = "my name is {0}. I am {1}years old ".format('Mario', 40)
#str3 ="my name is %s " %'Mario'
#name="mario"
#str4 =f"my name is {name} "
print(str2)

string = "a:b:c:d"
string2 = string.split(":")

print(string2)


#두수를 동시에 입력 받아서 더하기
#n1, n2 = input("두 수 입력 : ").split()  #공백으로 구

#print(int(n1)+ int(n2))

#find() -문자열이 존재하는 위치 반환
text ="Hello"
print(text.find('H'))

print(text.find('ll'))
print(text.find('Hello'))

while True:
    # 회원정보 출력하기
    name = input("이름")
    user_id= input("아이디 : ")
    pw = input("비밀번호 : ")
    id_card1 =input("주민번호 앞자리 입력 : ")
    id_card2 =input("주민번호 뒷자리 입력 : ")
    print('='*30)

    #출력
    print("이름 : {}".format(name))
    print("아이디 : {}".format(user_id))
    pw='*'*len(pw)
    print("비밀번호 : {}".format(pw))
    id_card2=id_card2[0]+'*'*(len(id_card2)-1)
    print("주민등록번호 : {}-{}".format(id_card1, id_card2))
















