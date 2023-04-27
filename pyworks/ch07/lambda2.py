#map() , filter()
#리스트를 매개변수로 전달

def times(a):
    a2 = []
    for i in a:
        a2.append(3*i)
    return a2

v = [1, 2, 3, 4]
print(times(v))

#lambda 함수와 map()사용
times2 = lambda x : x * 4
#map(함수, 리스트)

result = map(lambda x : x * 5, v)
print(list(result))

#filter()와 lambda 사용
li = [ -5, 1, 2, -11, 76]

negative = lambda x : x < 0
value =filter(negative, li)
print(list(value))
