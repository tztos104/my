#정렬방법- 1내장함수 2반복조건문
#리스트의 매서드 sort(), reverse()

a= [1, 5, 4, 15, 6]
n= len(a)
a.sort()
print(a)

#a.sort(reverse=True )
#print(a)

#2. 반복 조건문
#정렬 알고리즘- 버블정렬
for i in range(0, n):
    for j in range(1, n):
        if a[j-1] > a[j]:
            #교환(자리바꾸기)
            a[j-1],a[j] = a[j], a[j-1]

print(a)

