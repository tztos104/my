#pickle 모듈 사용
#pickle.dump -쓰기 pickle.load - 읽기

import pickle

with open("./output/object.txt", 'wb') as f:
    a = ['강아지', '고양이', '말', '토끼']
    dic ={1:'강아지', 2:'고양이', 3:'말', 4:'토끼'}
    pickle.dump(a, f)
    pickle.dump(dic, f)

with open("./output/object.txt", 'rb') as f:
    a = pickle.load(f)
    dic = pickle.load(f)
    print(a)
    print(dic)