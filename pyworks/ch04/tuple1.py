#  튜플(tuple)- 요소의 수정과 삭제 불가
t1 = (1,2,3)
print(t1)
print(type(t1))

#인덱싱-리스트와 비슷
print(t1[0])
print(t1[-1])

#t2=(1) 1은 정수  하나는 튜플x
t2=(1, ) #하나만 튜플하려면 뒤에 , 처리! 
print(t2)
print(type(t2))
#수정
t1[2] = 4

#삭제
del t1[1]
