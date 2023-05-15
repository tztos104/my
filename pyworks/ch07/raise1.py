#예외 처리 미루기 -raise




class Animal:
    def breathe(self):
        print("동물이 숨을 쉰다.")

    #반드시 구현해야되는 매서드
    def cry(self):
        raise NotImplementedError

class Dog(Animal):
    def cry(self):
        print('멍~ 멍~')
    def sleep(self):
        print('잠을잔다')

class Cat(Animal):
    def cry(self):
        print('야옹 야옹')

dog= Dog()
dog.breathe()
dog.cry()
dog.sleep()

cat= Cat()
cat.breathe()
cat.cry()