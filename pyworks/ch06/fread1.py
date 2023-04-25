#파일읽기

try:
    #파일 개방 open("경로", 'r')
    f = open("c:/pyfile/file1.txt", 'r')

    #파일 읽기
    data = f.read()
    print(data)

    #파일 종료
    f.close()
except:
    print("파일을 읽을 수 없습니다.")