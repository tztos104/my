#쿠품 추첨기 만들기
import random
from tkinter import *

namelist = ['이진성', '노승우', '박성호', '권지혜', '김은효', '이경철','성의석', '이유진', '유성길',
            '한주훈', '강정현', '김현우', '이영준', '안재훈', '김민정', '유세현', '윤기은', '오화룡', '조은별', '이가은']



def click():
    b = []
    while len(b) < 5:
        a = random.choice(namelist)
        if a not in b:
             b.append(a)

    output.delete(0.0, END)
    #output.insert(END, b)
    for i in b:
        output.insert(END, i+' ')

    """
    namelist2 = []
    while True:
        for i in range(5):
            if random.choice(namelist) not in namelist:

                namelist2.append(random.choice(namelist))


        output.insert(END, namelist2)
"""

window = Tk()
window.title("쿠폰추첨기")
window.option_add('*font', '맑은고딕 14')

#이미지 넣기
img = PhotoImage(file='bronx.png')
lbl_img = Label(window)
lbl_img.config(image=img)
lbl_img.grid(row=-0, column=0, sticky= W)

#추첨 버튼
Button(window, text='추첨', command=click).grid(row=1 , column=0, sticky= E)

#이름 출력
output = Text(window, width=33, height=4, bg='yellow')

output.grid(row=2, column=0, sticky= W)


window.mainloop()