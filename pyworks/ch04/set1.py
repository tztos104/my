# 집합-set(), {} 를 사용

s={2, 4, 6, 8, 10, 12, 12, 7, 222, 1, 2, 3}
print(type(s))

#요소 추가
s.add(123)

#요소 삭제
s.remove(4)

print(2 in s)

for i in s:
    print(i)

A = {1, 2, 3, 4}
B = {3, 4, 5, 6}

#교집합(A&B), 합집합(A|B), 차집합(A-B)
print(A & B)
print(A | B)
print(A - B)

#자료 중복 제거
a = [1, 1, 1, 1, 2, 2, 3]
s = set(a)
print(s)

#리스트 변환
print(list(s))

say = set("hello")
print(say)