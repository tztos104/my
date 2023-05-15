#영어 타자 게임
#단어장 읽어오기
import random
import time

with open("./output/word.txt", 'r') as f:
    data= f.read().split()
    word= random.choice(data)

n=1 #문제 번호
input("[타자게임] 준비되면 엔터")
start = time.time()
while n <= 10:
    question = random.choice(data)
    print(f'문제 {n}')
    print(question)
    user = input()
    if question == user:
        print("통과!")
        n += 1
    else:
        print("오타! 다시 도전!")

end =time.time()
print(f"게임소요 시간: {end-start:.2f}초")