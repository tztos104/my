#다중 예외 처리
while True:
    try:

        data = [15, 20, 99, 0, 8]
        x = input("정수 입력(0~4까지 입력) : ")
        num = int(x)
        print(data[num])
    except IndexError as e: #인덱스 요소 접근에러
        print(e)
    except ValueError as e: # 문자형 변환 에러
        print(e)