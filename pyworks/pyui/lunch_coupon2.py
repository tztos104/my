#쿠품 추첨기 만들기
import random
from tkinter import *



a = []

def click():
    lotto = []

    while len(lotto) < 6:
        num = random.randint(1, 45)
        if num not in lotto:
            lotto.append(num)



    output.delete(0.0, END)
    lotto.sort()
    output.insert('0.7', lotto)


    """
    namelist2 = []
    while True:
        for i in range(5):
            if random.choice(namelist) not in namelist:

                namelist2.append(random.choice(namelist))


        output.insert(END, namelist2)
"""

window = Tk()
window.title("로또 추첨기")
window.option_add('*font', '맑은고딕 14' )

#이미지 넣기
img = PhotoImage(file='images.png')
lbl_img = Label(window)
lbl_img.config(image=img)
lbl_img.grid(row=-0, column=0, sticky= W)

#추첨 버튼
Button(window, text='추첨', command=click).grid(row=1 , column=0, sticky= N)

#이름 출력
output = Text(window, width=32, height=4, bg='lightyellow')

output.grid(row=2, column=0, sticky= W)


window.mainloop()