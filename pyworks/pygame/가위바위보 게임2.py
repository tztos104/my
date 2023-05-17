#가위바위보 게임
import random

print("가위바위보 게임")

가위바위보 = [['가위', '찍', '두개' ] , ['바위','rock','주먹'],['보자기','보','sis']]

def play(tou, com):
    if tou not in 가위바위보:
        print("잘못된 입력입니다. 다시해")
        return

    if tou == com:
        state = 0
    elif tou = 가위바위보[0] and com == '보':
        state = 2
    elif tou ==' 바위' and com == '가위':
        state = 2
    elif tou ==' 보' and com == '바위':
        state = 2
    else:
        state = 2

    print("결과 : ", 결과[state])



결과 = {0:"무승부", 1:"패", 2:"승"}
state =0

tou = input("당신 :")

com = random.choice(가위바위보)

