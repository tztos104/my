"""
#게임 방법
#1. 당신은 가위바위보 중 하나를 입력한다.
2.컴퓨터는 가위 바위 보 중 하나를 랜덤생서한다.
결과 출력은 무승부, 패 승이다.
잘목 입력한 경우 "잘못된 입력입니다. 다시입력해주세요"
"""
import random

a=['가위', '바위', '보' ]




while True:

    com_print = random.choice(a)
    you_print = input("가위, 바위, 보 중 하나를 입력해주세요.")


    if com_print == '가위':
        if you_print == '가위':
            print(f'컴퓨터는 {com_print} 당신은 {you_print} \n 무승부입니다.')

        elif you_print == '바위':
            print(f'컴퓨터는 {com_print} 당신은 {you_print} \n승!')
        elif you_print == '보':
            print(f'컴퓨터는 {com_print} 당신은 {you_print} \n패!')
        else:
            print("잘못된 입력입니다. 다시 입력해 주세요")


    elif com_print == '바위':
        if you_print == '가위':
            print(f'컴퓨터는 {com_print} 당신은 {you_print} \n패')
        elif you_print == '바위':
            print(f'컴퓨터는 {com_print} 당신은 {you_print} \n무승부')
        elif you_print == '보':
            print(f'컴퓨터는 {com_print} 당신은 {you_print} \n승')
        else:
            print("잘못된 입력입니다. 다시 입력해 주세요")

    elif com_print == '보':
        if you_print == '가위':
            print(f'컴퓨터는 {com_print} 당신은 {you_print} \n승')
        elif you_print == '바위':
            print(f'컴퓨터는 {com_print} 당신은 {you_print} \n패')
        elif you_print == '보':
            print(f'컴퓨터는 {com_print} 당신은 {you_print} \n무승부')
        else:
            print("잘못된 입력입니다. 다시 입력해 주세요")


"""
if you_print == 가위 and com_print ==보

elif you_print == 가위 and com_print ==보
elif you_print == 가위 and com_print ==보

"""