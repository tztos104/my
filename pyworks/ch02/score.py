
A = [70, 80, 50 ,60, 90]

count=len(A)

for i in A:
    print(1, end='')
print()

"""
for i in range(1, 6):
    print(i)

for i in range(0, 6):
    print(A[i], end= '')
"""
#합계
sum_v = 0
for i in A:
    sum_v = sum_v + i
    print(f'i={i}, sum_v={sum_v}')

print (sum_v)

avg = sum_v / count
print(avg)
