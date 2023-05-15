#무한 반복문
key =input("반복을 계속 할까요?(y/n)")

while True:
    if key=='y':
        key =input("반복을 계속 할까요?(y/n)")
    elif key =='n':
        print("반복을 중단합니다.")
        break
    else:
        print("정상 답변이 아닙니다.")
        key =input("반복을 계속 할까요?(y/n)")
       
