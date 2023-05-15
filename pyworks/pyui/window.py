#gui(graphic usr interface) 프로그램 만들기

#import tkinter
from tkinter import *

root = Tk()
root.title("처음 만드는 윈도우")
root.geometry("300x200+300+100") #width=300 height=200 x좌표=300 y좌표=100

#버튼 생성
#grid() , pack()
#Button(root, text='버튼', font=("맑은 고딕", 18)).pack() #pack 가운데 정렬
btn = Button(root, text='버튼', font=("맑은 고딕", 18))
btn.pack() #pack 가운데 정렬
#btn.grid(row= 0, column = 0)

root.mainloop()