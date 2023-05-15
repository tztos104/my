#딕셔너리

d={'tomas': 13, 'jane': 9}

d['mike'] =10
print(d)

#키값 가져오기
print(d.keys())

#모든 값가져오기
print(d.values())

#모든 키와 값 가져오기
for key, val in d.items():
    print(key, ':', val)
