#순차 탐색
#리스트의 첫번째 자료부터 하나씩 비교하면서 값은 값이 나오면 그위를 돌려주고 못찾으면 -1를 반황

def search_list(a, x):
    n= len(a)
    for i in range(0, n):
        if a[i]== x:
            return  i
    return  -1

def search_list2(a, x):
    same_name = set()  # 빈 집합 생성
    n = len(a)
    for i in range(0, n - 1):
        for j in range(i + 1, n):
            if a[i] == a[j]:
                # 중복값 추가
                same_name.add(a[i])
        return same_name or -1

v= [60, 5, 33, 12, 97, 24, 5]
name = ['이순신', '강감찬','서희','안중근','유관순']

print(search_list2(name , 5))

"""
for i in range(0, n):
    if v[i]== 12:
        print

"""