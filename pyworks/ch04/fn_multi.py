#두 수를 매개 변수 전달 1.서로 같으면 곱하고
#두 수가 서로 다르면 더하는 함수
def fn_multi(x, y):
    if x == y:
        result = x * y
    else:
        result = x + y
    return result

print(fn_multi(6, 5))

#구구단 4단 출력
dan=4
for i in range(1, 10):
    print(f'{dan}x{i}={4*i}')
  #함수를 정의해서 구구단 출력
def 구구단(단):
    for i in range(1, 10):
        print(f'{단}x{i}={4 * i}')

구구단(3)