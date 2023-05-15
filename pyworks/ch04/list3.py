#리스트
a=[1, 2, 3, 4]

a.append(5) #맨뒤에서 추가

print(a)

#삭제
a.pop() #맨 뒤에 삭제 

print(a)

#리스트 복사
a2 = [] #복사하기 위해 빈 리스트 생성
"""
a2 = a  #직접 복사
print(a2)

#for ~ in로 복사

for i in a :
    a2.append(i)
print(a2)
"""
#3의 배수로 복사
for i in a :
    a2.append(3*i)
print(a2)

# a 리스트에서 홀수만 저장
a3 = []
for i in a2:
    if i%2 !=0:
        a3.append(i)
print(a3)










