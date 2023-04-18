

coffee=5


while True:
    try:
        money=int(input("돈을 넣어주세요:"))

        if money == 400:
            print('커피가 나옵니다')
            coffee-=1
            print(f'남은 커피의 양은 {coffee}입니다')
        elif money >400:
            print(f'커피가 나옵니다 거스름돈은 {money-400}')
            coffee-=1
            print(f'남은 커피의 양은 {coffee}입니다')
        else:
            print(f'잔액이 부족합니다. 거스름돈은 {money}')
        
        if coffee == 0:
            print(f'판매가 완료되었습니다.')
            break
    except:
        pass
     
