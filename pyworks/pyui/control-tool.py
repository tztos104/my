#컨트롤 도구 -클래스 사용 생성

from tkinter import *

def click():
    lbl.config(text="Hello~")

root =Tk()
root.title("UI 구성")
root.geometry("200x100")
frame = Frame(root)
frame.pack()

Button(frame, text='제출' , command=click ).grid(row=0, column=0)
lbl= Label(frame, text="안녕하세요")
lbl.grid(row=1, column=0)
root.mainloop()