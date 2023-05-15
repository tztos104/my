#중첩이중문
# 5행 5열 

for i in range(5): #range(0, 5, 1)
    for j in range(5):
        print('가', end="'")
    print()

#스타(*) 출력
#삼각형
for i in range(0 , 5): #range(0, 5, 1)
    for j in range(i , 5):
        print('*', end="")
    print()

    
for i in range(0 , 5): 
    for j in range(1 , 6):
        print(5*i+j, end="")
    print()
        
