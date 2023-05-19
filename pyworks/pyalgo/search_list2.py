#순차 탐색
#리스트의 첫번째 자료부터 하나씩 비교하면서 값은 값이 나오면 그위를 돌려주고 못찾으면 -1를 반황



def search_list(a, x):
    n = len(a)
    for i in range(0, n):
       if a[i] == x:
           return i
    return -1

v= [60, 5, 33, 12, 97, 24, 5]
name = ['이순신', '강감찬','서희','안중근','유관순']

print(search_list(name , '이순신'))

"""
for i in range(0, n):
    if v[i]== 12:
        print

"""