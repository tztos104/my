# 온도 변환기
from classfication.extend.converters import Converter
from tkinter import *
import keyboard


class App:

    def __init__(self , root):


        self.con = Converter('C', 'F', 1.8, 32)
        frame = Frame(root)
        frame.pack()

        Label(frame, text="deg C").grid(row=0, column=0)
        self.c=DoubleVar() #배정도(실수) 자료형 클래스 (float >Double)
        Entry(frame, textvariable=self.c, bg='lightgray').grid(row=0, column=1)

        Label(frame, text="deg F").grid(row=1, column=0)
        self.f = DoubleVar()
        Label(frame, textvariable=self.f).grid(row=1, column=1)
        def enter(event):
            btn.invoke()

        btn = Button(frame, text="변환", command=self.convert)
        btn.grid(row=2, column=2)
        root.bind('<Return>', enter)

    def convert(self):
        c = self.c.get() #입력된 섭씨 온도
        con_f = self.con.convert(c) #섭씨온도가 변환된 화씨온도
        ff= f'{con_f:.2f}F'
        self.f.set(ff) #화씨온도를 출력레이블에 설정(출력)




root = Tk()
root.title("온도 변환기")
root.geometry("300x100")


app = App(root)
root.mainloop()