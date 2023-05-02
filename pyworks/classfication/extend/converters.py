#ScaleConverter 상속받는 클래스
#import 패키지이름.모듈이름
import classfication.scale_converter
from classfication.scale_converter import  ScaleConverter

"""
con = ScaleConverter("KB", "B", 1024)
print("Conerting 1 KB")
print(str(con.convert(1)) + con.units_to)
"""

class Converter(ScaleConverter):
    def __init__(self,units_from, units_to, factor, offset):
        self.offset = offset
        super().__init__(units_from, units_to, factor) #맴버 상속받음
    def convert(self, value):
        #return self.factor * value + self.offset
        return super().convert(value) + self.offset



if __name__ =="__main__":
    conv = Converter('C', 'F', 1.8, 32)
    print("converting 21c")
    print(f'{conv.convert(21):.2f}{conv.units_to}')