#매개변수가 리스트인 함수
#리스트 복사 함수를 이용
"""
def get_list(a):
    a2=[]
    for i in a:
        a2.append(i*2)
    return a2
   
v=[1, 2, 3, 4, 5, 6, 7, 8, 9]
print(get_list(v))
"""

a=[1]
sum_v = 0

for i in a :
    sum_v += i

avg_v = sum_v / len(a)
print(f'[ a ]의 합계 : {sum_v}')
print(f'[ a ]의 평균 : {avg_v}')

#내장함수
print(f'su, ={sum(a)}')
b=(1,2,3,4)
print(sum(b))
