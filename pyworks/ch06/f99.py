with open("./output/gugu.txt", 'w') as f:
    for i in range(2, 10):
        for j in range(1, 10):
            gugudan = f'{i} x {j}= {i*j}\n'
            f.write(gugudan)
        f.write('\n')


#파일읽기
try:
    with open("./output/gugu.txt", 'r') as f:
        gugudan = f.read()
        print(gugudan)
except FileNotFoundError:
    print("파일을 찾을 수 없습니다.")