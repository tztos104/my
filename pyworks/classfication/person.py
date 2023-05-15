#Person 클래스 정의
class Person:
    def __init__(self, name, age, add):          #생성자 함수
        self.name = name
        self.age = age
        self.add=add
    #맴버의 정보
    def __str__(self):
        return f'이름:{self.name}, 나이:{self.age}, 주소:{self.add}'

#상속 -자식 클래스 이름 (부모클래스)
class Employee(Person):
    def __init__(self, name, age, add, id):
        super().__init__(name, age, add)
        self.id = id

        #매서드 재정의(오버라이드)
    def __str__(self):
        #return f'이름:{self.name}, 나이:{self.age}, 주소:{self.add}, 사번: {self.id}'
        return f'{super().__str__()}, 사번: {self.id}'
e1 = Employee("이하나", 25, "서울", 'a1001')
print(e1)

"""
#클래스 사용- 객체 생성(메모리 실행)
# p1 -인스턴스 , 오브젝트

p1 = Person("김산", 21, "강남")
print(p1.name)
print(p1.age)
print(p1)

p2= Person("이강", 30, "인천")
print(p2.name)
print(p2.age)
print(p2)
"""