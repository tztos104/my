#lambda 함수 - 익명함수
#lambda 매개변수 : 표현식

def sub(x, y):
    return x - y

print(sub(3, 4))

sub = lambda x, y : x - y
print(sub(3, 4))

#매개 변수 1개 4의 배수
times = lambda x : 4 * x
print(times(5))
print((lambda x : 4 * x)(5))

#제곱수
square = lambda x : x * x
print(square(3))

#람다 함수를 매개 변수로 이용
def call_10(func):
    for i in range(10):
        func()

def hello():
    print("안녕")

call_10(hello)

