#엡앤다운게임
import random
com= random.randint(1, 100)
min = 1
max = 100
count= 0

while True:
    try:
        if count == 10:
            print("실패~!")
            break
        user= int(input("숫자를 입력하세요"))

        if 0<user <=100:

            if user > com:
                count += 1
                if max > user:
                    max = user

                if (user-com) < 5:
                    print(f"좀만 작게! {count}회 {min}~{max}")
                elif (user-com) < 10:

                    print(f"커요!{count}회 {min}~{max}")
                else:
                    print(f"너무 커요!{count}회 {min}~{max}")
            elif user < com:
                count += 1
                if min < user:
                   min = user


                if (com-user) < 5:
                    print(f"좀만 크게!{count}회 {min}~{max}")
                elif (com-user) < 10:
                    print(f"작아요{count}회 {min}~{max}")
                else:
                    print(f"너무작아요{count}회 {min}~{max}")
            else:
                count += 1
                print(f"{com} 정답입니다. 점수는 {count*10}")
                break
        else:
            print("범위가 벗어났습니다.")
    except ValueError:
        print("잘못된 입력입니다 1~100까지 수를 입력해!")