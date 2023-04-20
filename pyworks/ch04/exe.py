
def num(x):
    count = 0
    for i in range(1, 101):
        배수 = i%x
        if 배수 == 0:
            count += 1
            print(i, end=' ')
    print(f'배수의 갯수는 : {count}')
num(3)



