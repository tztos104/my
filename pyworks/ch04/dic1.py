#딕셔너리 자료형
d = {'진' :  31 , '슈가' : 29 }
print(d)
print(d['진'])  #특정요소 조회

#요소 추가
d['지민']= 28

#요소 삭제
d.pop('진')


for key in d :
    print(key, ":", d[key])


