#지역 변수와 전역 변수
"""
def one_up():
    x= 0
    x= x+ 1
    return x

print(one_up())
"""

def one_up2():
    global x
    x = x + 1
    return x
x=0
print(one_up2())
print(one_up2())
print(one_up2())