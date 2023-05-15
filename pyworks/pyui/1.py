import random
from tkinter import *


a = []
remaining_numbers = list(range(1, 46))


def click():
    global remaining_numbers
    lotto = []

    while len(lotto) < 6:
        num = random.choice(remaining_numbers)
        lotto.append(num)
        remaining_numbers.remove(num)

    a.append(lotto)
    if len(remaining_numbers) <= 6:
        output2.insert('0.7', remaining_numbers)
    output.delete(0.0, END)
    lotto.sort()
    output.insert('0.7', lotto)
def reset():
    #lotto=[]
    a.clear()
    remaining_numbers.clear()
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
Button(window, text='추첨', command=click).grid(row=1, column=0, sticky=N)
Button(window, text='리tpt', command=reset).grid(row=1, column=1, sticky=N)

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
