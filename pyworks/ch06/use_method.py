import method1 as met
from method1 import get_sum2

#get_sum2()호출
val = met.get_sum2(10)
print(val)

#from method1 import get_sum2
val2 = get_sum2(10)
print(val2)

#get_num() 호출
met.get_num(10)