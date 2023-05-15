#단위 변환기- 테스트용
from tkinter import *
class App:
    def __init__(self, win):
        frame= Frame(win)
        frame.pack()

        Label(frame, text="deg C").grid(row=0, column=0)
        Button(frame, text="변환", command=self.convert).grid(row=1, column=0)
    def convert(self):
        print("아직 구현하지 않음")

win =Tk()
win.title("온도 변환기")
app= App(win)


win.mainloop()