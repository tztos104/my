#while 반복문
#'hello'를 10번 출력
"""
i=1
while i <= 10:
    print('hello~')
    i+=1


#1부터 10까지 더하기
try:
    i=0
    j=int(input("입력한 수의 합계는?\n"))
    sum_v = 0
    while i < j:
        i+=1
        sum_v = sum_v +i
    print(f'합계 : {sum_v}')    
except ValueError:
    print("숫자를 입력하세요")
"""

#반복조건문(break)
i =0
sum_v = 0
j=int(input("숫자를 입력하세요"))
while True:
 
    i += 1
    if i > j:
        print(f'합계 : {sum_v}')
        break
    sum_v += i
    print(i)
print(f'합계 : {sum_v}')













