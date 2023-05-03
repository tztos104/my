#계산기- 간단한 숫자 표시

from tkinter import *

def click1():
    display.insert(END, '1')
def click2():
    display.insert(END, '2')


root = Tk()
root.title("나의 계산기")

#출력창
display = Text(root, height=15 , width=30,  bg='light green')
display.grid(row=0, column=0, sticky=N)
num_pad = Frame(root)
num_pad.grid(row=1, column=0, sticky=W)
Button(root, text='1', command=click1).grid(row=1, column=0)
Button(root, text='2', command=click2).grid(row=1, column=1)
Button(root, text='3', command=click1).grid(row=1, column=2)
Button(root, text='4', command=click2).grid(row=2, column=0)
Button(root, text='5', command=click1).grid(row=2, column=1)
Button(root, text='6', command=click2).grid(row=2, column=2)
Button(root, text='7', command=click2).grid(row=3, column=0)
Button(root, text='8', command=click1).grid(row=3, column=1)
Button(root, text='9', command=click2).grid(row=3, column=2)
Button(root, text='0', command=click2).grid(row=4, column=1)


root.mainloop()
