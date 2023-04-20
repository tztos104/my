# 사가형의 넓이  계산 함수
#함수이름 calc_area()

while True:

    def calc_area(x, y):
        area= x*y
        return area

    num1, num2= input("두수를 입력하세요").split()


    print(f"가로가{num1}, 세로가{num2}인 사각형의 면적: ", calc_area(int(num1), int(num2)))

    #삼각형 넓이

    def tri_area(x, y):
        area= (x*y)/2
        return area


    print(f"높이가{num1}, 밑변이 {num2}인 삼각형의 면적: ", tri_area(int(num1), int(num2)))


def calc_size(n):
    area = n * n
    return area
print(calc_size(100))
