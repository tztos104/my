import time
#함수-function, method(메서드)

#1부터 10까지 출력
for i in range(1, 11):
    print(i)

#1부터 n까지 출력 함수
start = time.time()
def get_num(n):
    for i in range(1, n+1):
        print(i, end=' ')

get_num(12)
print()


# 1부터 n 까지 합계를 구하는 함수
def get_sum(n):
    sum_v = 0
    for i in range(1, n + 1):
        sum_v += i
    return sum_v
if __name__=="__main__":
    print(f' 합계: {get_sum(100000000)} ')
    end = time.time()
    print(f' 소요시간: {end-start}초 ')


start = time.time()


def get_sum2(n):
    sum_v=(n *(n+1)) // 2
    return sum_v
if __name__=="__main__":
    print(f' 합계: {get_sum2(100000000)} ')
    end = time.time()
    print(f' 소요시간: {end-start}초 ')