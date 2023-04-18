languages = ['python', 'c', 'java', 'javascript']

for lang in languages:
    if lang in ['python','javascript']:
        print(f'{lang} need interpreter')
    else:
        print(f'{lang} need complier')


#구구단 출력
dan = 4
result = ""
for i in range (1, 10):
    current_val = f'{dan} X {i} = {dan * i}\n'
    result = result + current_val
print(result)
"""
for i in range (1, 10):
    print(f'{dan} X {i} = {dan * i}') 
"""
