#f =open() -> with open()

f = open('./output/string.txt', 'w')

f.write("여름이 온다\n")
f.write('123')
val = (12 * 1000) / 5
f.write(str(val))

f.close()

try:
    team =['키움','삼성','롯데','4','5','6','7','8','9','10','11','12']

    with open('./output/kbo2023.txt', 'w') as f:
        for i in team:
            if i == team[-1]:
                f.write(i+ ' ')
            else:
                f.write(i + ', ')

except FileNotFoundError as e:
    print("파일을 찾을 수 없습니다.")





with open('./output/kbo2023.txt', 'r') as f:
    team = f.read()
    print(team)