# Calculator 클래스
class Calculator2:
    def __init__(self, x, y):
        self.x = int(x)
        self.y = int(y)

    # 매개변수 y값 더하기
    def add(self):
        return self.x + self.y

    # 매개변수 빼기
    def sub(self):
        return self.x - self.y

    # 매개변수 곱하기

    def mul(self):
        return self.x * self.y

    # 매개변수 곱하기

    def div(self):
        return self.x / self.y

"""
cal1 = Calculator2(5 , 85)
print(cal1.add())
print(cal1.sub())

cal2 = Calculator2(5, 85)
print(cal2.add())
print(cal2.sub())
"""