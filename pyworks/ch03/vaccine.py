
num=10
while True:
    try:
        
            happy = input("출생년도를 입력 : ")
            year=2023-int(happy)+1
            print(f'당신은 {year}세 입니다. ')
            if year>=20 and year<=65:
                print("백신 접종 대상")
                if happy[-1] =="1" or happy[-1] =="6":
                    print("월요일")
                elif happy[-1]=="2" or happy[-1]=="7":
                    print("화요일")
                elif happy[-1]=="3" or happy[-1]=="8":
                    print("수요일")
                elif happy[-1]=="4" or happy[-1]=="9":
                    print("목요일")
                else:
                    print("금요일")

            else:
                print("미대상 입니다. 하반기 일정확인")
    except:
        print("4자리 숫자를 입력 하세요.")
    if num == 0:
        break
    else:
        num-=1
