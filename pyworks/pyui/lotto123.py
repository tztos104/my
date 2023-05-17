import random
import sys
from tkinter import *


a = []
remaining_numbers = list(range(1, 46))
b = set()

def click():

    global remaining_numbers

    lotto = []

    while len(lotto) < 6:
        num = random.choice(remaining_numbers)
        if num not in lotto:
            lotto.append(num)
            b.add(num)
    a.append(lotto)

    if len(b) >= 39:
        c=set(range(1,46))
        d=set()
        for i in c:
            if i not in b:
                d.add(i)

        output2.insert('0.0', d)
        btn.config(state="disabled")
    output.delete(0.0, END)
    lotto.sort()
    output.insert('0.0', lotto)



def reset():
    #lotto=[]
    global remaining_numbers
    remaining_numbers = list(range(1, 46))
    a.clear()
    b.clear()
    output.delete(0.0, END)
    output2.delete(0.0, END)
    btn.config(state="active")


window = Tk()
window.title("로또 추첨기")
window.option_add('*font', '맑은고딕 14')

# 이미지 넣기
img = PhotoImage(file='images.png')
lbl_img = Label(window)
lbl_img.config(image=img)
lbl_img.grid(row=-0, columnspan=3, sticky=W)




# 이름 출력
output = Text(window, width=32, height=4, bg='lightyellow')
output.grid(row=2, columnspan=3, sticky=W)

# 누적된 번호 출력
output2 = Text(window, width=32, height=4, bg='lightblue')
output2.grid(row=3, columnspan=3, sticky=W)

# 누적된 번호를 출력하는 함수
def print_a():
    output2.delete(0.0, END)
    for numbers in a:
        output2.insert(END, f"{numbers}\n")


# 출력 버튼
Button(window, text='출력', command=print_a).grid(row=4, column=1)
Button(window, text='리셋', command=reset).grid(row=4, column=2)
# 추첨 버튼
btn= Button(window, text='추첨', command=click)
btn.grid(row=4, column=0)
window.mainloop()
