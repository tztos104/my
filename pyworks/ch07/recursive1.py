# 재귀 함수 (자기를 부름!)


def sos(n):

    #종료 조건
    if n== 0:
        return n
    else:
        print("Help me!")

        return sos(n-1)
#sos(5)

#1~n까지 곱하기
m= int(input("숫자입력하세요"))


def getgob(m):
    gob = 1  # 곱셈에서는 1을 기억

    for i in range(1, m+1):
        gob *= i
        print(i , gob)
    return gob

getgob(m)


def facto(n):
    if n <= 1:
        return 1
    else:
        return n * facto(n-1)

print( facto(5))