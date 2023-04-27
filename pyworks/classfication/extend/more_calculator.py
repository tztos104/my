import classfication.calculator2


class MoreCalculator(classfication.calculator2.Calculator2):
    def __pow__(self):
        num = 1
        for i in range(0, self.y):
            num = num * self.x
        return num
    """
    def pow(self):
        return self.x ** self.y
    """
    def div(self):
        if self.y == 0:
            return "오류"
        else:
            return self.x / self.y

cal1 = MoreCalculator(5 , 85)
print(cal1.add())
print(cal1.sub())
print(cal1.mul())
print(cal1.div())
print(cal1.pow())

cal2 = MoreCalculator(5, 7)
print(cal2.add())
print(cal2.sub())
print(cal2.mul())
print(cal2.div())
print(cal2.pow())

