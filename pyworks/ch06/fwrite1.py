#파일 쓰기

#파일 열기(개방) -open(경로, 쓰기모드)
f = open("c:/pyfile/file1.txt", 'w')
#파일 쓰기
f.write('hello\n' ) #줄바꿈 (\n)
f.write('100\n')
n= 10 * 2
f.write(str(n) + '\n')

for i in range(1, 11):
    text = f'{i}번째 줄입니다.\n'
    f.write(text)
    
print("쓰기완료")

#파일 종료
f.close