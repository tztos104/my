#자료구조-딕셔너리(dictionary)

person ={'name' : '오상식', 'age': 35, 'phone' : '010-1234-5678'}
print(person)

#특정 요소 출력
print(person['name'], person['age'])

#전체 출력
for key in person:
    print(key, person[key])
    #print(키, 값)

#요소 추가

person['email'] ='kasean@nate.com'
print(person)


#요소 수정, 삭제
person['age'] = 30
del person['phone']
print(person)

#용사 사전
print('♠용어 사전 ♠')
while True:
    try:
   
        word = str(input('단어를 입력하세요 :' ))

        dic={
        "이진수" : "컴퓨터가 사용하는 0과 1로 이루어잔 수",
        "버그" : "프로그램이 적절하게 동작하는데 실패하거 오류가 발갱한느코드",
        "알고리즘" :"어떤 문제를 해결하기 위해 정해진 일련의 절차"}

        definition = dic[word]
        print(definition)
    except KeyError:
        print('정의된 단어가 없습니다') 

        
