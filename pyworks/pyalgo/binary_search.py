# 이분 탐색

"""
자료가 크기 순서대로 정렬된 리스트에서 특정한 값이 있는지 찾아
그 위치를 돌려주는 알고리즘
☆탐색과정
1.중간위치를 찾는다.
2.찾는 값과 중간 위치값을 비교한다.
3. 찾는 값이 중간 위치 값보다 크면 중간위치의 오른쪽을 대상으로 탐색하고,
작으면 왼쪽을 대상으로 탐색한다.

"""

def bin_search(a, x): #리스트 a와 x (찾는값)
    start = 0
    end = len(a)-1 #마지막 인뎃스 번호

    while start <= end: #탐색할 범위가 있는 동안 반복
        mid = (start +end)// 2
        if x == a[mid]:
            return mid #찾음
        elif x>a[mid]: #찾는값이 중간 값보다 크면
            start = mid + 1
        else:
            end = mid-1
    return -1



d=[1, 4, 8, 16, 25, 36, 39, 49, 64, 81]
d.sort()
print(d)
print(bin_search(d,49))
print(bin_search(d,1))
print(bin_search(d,4))
print(bin_search(d,8))
print(bin_search(d,16))
print(bin_search(d,25))
print(bin_search(d,36))
print(bin_search(d,39))

a=[0, 10, 20, 30, 40, 50, 60, 70, 80,90]
