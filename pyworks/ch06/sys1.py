#sys 모듈 -system
#명령프롬프트(명령 행에서 인수 사용하기)
import sys

#print(sys.argv[1:])#1번 인덱스부터 추출(슬라이싱)

#명령행 입력값 연산
args = sys.argv[1:] #arg 리스트 생성
print(args)

total = 0
for i in args:
    total += int(i)

print(total)