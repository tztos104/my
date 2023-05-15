#로또 복권 추첨 프로그램
#1~45까지 6개 랜점수로 저장
import random

lotto = []

while len(lotto) < 6:
    for i in range(6):

        if random.randint(1, 45) not in lotto:
            lotto.append(random.randint(1, 45))

print(lotto)

lotto2 = []
lotto2.append(input().split( ))