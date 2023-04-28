#try ~ except ~ else 구문
try:
    with open("../ch06/output/kbo2023.txt", 'r') as f:
        team = f.read()
        print("실행됨")
except FileNotFoundError as e:
    print(e)
else:
    for i in team:
        print(i, end= '')