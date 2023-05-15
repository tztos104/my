class City:
    a = ['Seoul', 'Incheon', 'DaeJon', 'Jeju'] # 클래스 리스트


str1 = ""
for i in City.a:
    str1 += i[0]

print(str1)