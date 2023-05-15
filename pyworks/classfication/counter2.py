#Counter 클래스 만들기



class Counter:
    def __init__(self):
        self.x = 0
        self.x += 1
    def get_count(self):
        return self.x

c1 = Counter()
print(c1.get_count()) #1

c2 = Counter()
print(c2.get_count()) #2



"""
class Counter:
    
  
    def __init__(self):
        self.x =0
        self.x += 1

    def get_count(self):
        return self.x

c1 = Counter()
print(c1.get_count()) #1

c2= Counter()
print(c2.get_count()) #1
"""