import random
try:

    word = ['ant', 'bear', 'chicken', 'deer', 'fox', 'elephant',
            'horse', 'lion', 'monkey', 'penguin']
    with open("./output/word.txt", 'w') as f:
        for i in word:
            if i == word[-1]:
                f.write(i)
            else:
                f.write(i+ ' ')

    f.close()
except FileNotFoundError:
    print("파일을 쓸 수 없습니다.")

try:
    with open("./output/word.txt", 'r') as f:
        data = f.read().split(' ')
        word = random.choice(data)
        print(word)

except FileNotFoundError:
    print("파일을 읽을 수 없습니다.")