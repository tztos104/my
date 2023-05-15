#자리배치 프로그램
#입장객수, 좌석열, 줄수
#입장객수가 열수로 나누어 떨어지는 경우, 그렇지 않은 경우

while True:
    customer =int(input("입장객수는?"))
    col = int(input("좌석 열수는?"))

    나누기 = customer / col
    몫 = customer//col
    나머지 = customer % col

    print(나누기)
    print(몫)
    print(나머지)

    if customer % col == 0 :
        row =  int(customer/ col)
    else:
        row = int(customer /col)+ 1

    print("줄수는" ,row)


    for i in range(0 , row): 
        for j in range(1 , col+1):
            num = col*i+j
            
            if num>customer:
                break
            print(num, end=" ")
        print()
