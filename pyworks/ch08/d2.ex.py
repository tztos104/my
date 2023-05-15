#2차원 리스트

d = [
    [10, 20, 500],
    [30, 40, 600],
    [50, 60, 700],
    [70, 80, 800],
    [90, 100, 900]
]

print(d[0][0])
print(d[4][1])
print(d[2][2])

#요소 추가
d.append([110, 120, 1000])

#2차원 리스트 객체 출력
print(d)

#전체 요소(값) 출력
for x, y, z in d:
    print(x, y, z)

#리스트 이름 =[요소1, 요소2, [값1, 값2]]
e = [7, 3, ['치킨', '독수리', '원숭이']]

print(e[1])
print(e[2])
print(e[-1])

#독수리 출력해보기
print(e[2][1])

#수학 영어 국어 과학 과목의 총점과 평균
score = [
    [80, 90, 79, 54],
    [84, 95, 87, 75],
    [86, 99, 86, 100],
    [91, 85, 75, 100],
    [100, 88, 90, 98],
    [34, 95, 80, 88],
    [70, 92, 75, 60],
    [47, 55, 76, 65]
]
n= len(score)

#개인별 총점
total = 0
for i in range(0, n):
    total = score[i][0]+ score[i][1]+ score[i][2] + score[i][3]
    print(total, total/4)

#과목별 총점과 평균
sum_subj = [0, 0, 0, 0] #sum_subj[0] = 0(수학)

for i in range(0, n):
    sum_subj[0] += score[i][0]
    sum_subj[1] += score[i][1]
    sum_subj[2] += score[i][2]
    sum_subj[3] += score[i][3]

print(f'수학총점: {sum_subj[0]}')
print(f'영어총점: {sum_subj[1]}')
print(f'국어총점: {sum_subj[2]}')
print(f'과학총점: {sum_subj[3]}')

print(f'수학평균: {sum_subj[0]/n}')
print(f'영어평균: {sum_subj[1]/n}')
print(f'국어평균: {sum_subj[2]/n}')
print(f'과학평균: {sum_subj[3]/n}')


