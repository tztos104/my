cart = []
#리스트 요소 추가
cart.append('계란')
cart.append('사과')
cart.append('생수')
cart.append('콩나물')
#리스트 개수
print(len(cart))

#리스트 수정

cart[2] = '커피'

#리스트 요소 삭제
#del cart[0]
#cart.remove('계란')
cart.pop() #맨뒤에 삭제

cart2 = ['계란', '사과', '생수', '콩나물']
print(cart)
print(cart2)

#전체조회
for i in cart:
    print(i)

#특정한 값을 조회
print(cart[-1])
