#동명이인 찾기 - 중복값 찾기

def find_same_name(a):
    same_name = set() #빈 집합 생성
    n = len(a)
    for i in range(0, n-1):
        for j in range(i+1, n):
            if a[i] == a[j]:
                #중복값 추가
                same_name.add(a[i])

    return same_name
#same_name = [] , same_name.append(a[i]) 도 가능


name = ['흥부','놀부','콩쥐','팥쥐','영준','바보', '말미잘', '놀부', '영준']

print(find_same_name(name)) #{}




