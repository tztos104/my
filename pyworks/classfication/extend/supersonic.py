#SuperSonicAirplane 클래스 생성

from classfication.airplane import Airplane

class SuperSonicAirplane(Airplane):
    NORMAL = 1
    SUPERSONIC = 2 #상수 설정

   #모드 -멤버 변수

    def __init__(self):
       self.fly_mode = SuperSonicAirplane.NORMAL

    def fly(self):
        if self.fly_mode == SuperSonicAirplane.SUPERSONIC:
           print("초음속으로 비행합니다.")
        else:
            super().fly()

sa = SuperSonicAirplane()
sa.take_off()
sa.fly()
sa.fly_mode = SuperSonicAirplane.SUPERSONIC #모드
sa.fly()
sa.land()
