import random
from tkinter import *


a = []
remaining_numbers = list(range(1, 46))
remaining_numbers2 = list(range(1, 46))
p2 = []


def click():
    global remaining_numbers2
    global remaining_numbers
    lotto = []

    while len(lotto) < 6:
        num = random.choice(remaining_numbers)
        if num not in lotto:
            lotto.append(num)
            print(num)
            remaining_numbers2.remove(num)

    a.append(lotto)
    if len(remaining_numbers2) <= 6:
        output2.insert('0.0', remaining_numbers2)
    output.delete(0.0, END)
    lotto.sort()
    output.insert('0.0', lotto)
def reset():
    #lotto=[]
    global remaining_numbers
    remaining_numbers = list(range(1, 46))
    a.clear()
    output.delete(0.0, END)
    output2.delete(0.0, END)

window = Tk()
window.title("로또 추첨기")
window.option_add('*font', '맑은고딕 14')

# 이미지 넣기
img = PhotoImage(file='images.png')
lbl_img = Label(window)
lbl_img.config(image=img)
lbl_img.grid(row=-0, column=0, sticky=W)

# 추첨 버튼
Button(window, text='추첨', command=click).grid(row=1, column=0, sticky=W)
Button(window, text='리셋', command=reset).grid(row=1, column=1, sticky=E)

# 이름 출력
output = Text(window, width=32, height=4, bg='lightyellow')
output.grid(row=2, column=0, sticky=W)

# 누적된 번호 출력
output2 = Text(window, width=32, height=4, bg='lightblue')
output2.grid(row=3, column=0, sticky=W)

# 누적된 번호를 출력하는 함수
def print_a():
    output2.delete(0.0, END)
    for numbers in a:
        output2.insert(END, f"{numbers}\n")


# 출력 버튼
Button(window, text='출력', command=print_a).grid(row=4, column=0, sticky=S)

window.mainloop()
