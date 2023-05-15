#버튼 이벤트
#버튼을 클릭하면 문자열이 출력되는 윈도우

from tkinter import *

def click():
    demo_lbl.config(text='안녕')
    #print("hello~")
#root -> 프레임 .pack() -> 버튼생성

root = Tk() #root 객체 생성
root.title('버튼 클릭')
root.geometry('500x600')
root.option_add("*Font", "맑은고딕 15")
frame =Frame(root)
frame.pack()

#Label(frame, text="").grid(row= 0, column= 0)
lbl = Label(frame)

lbl.config(text="hello python!!")
lbl.grid(row=1, column= 0)
#괄호를 생략하면 클릭이 발생할 때 작동함

Button(frame, text='확인', command=click).grid(row=2, column=0)
Label(frame, text="").grid(row=3, column= 0)
#클릭 함수에 괄호를 하면 함수 생성 시점에서 작도하고 괄호를 생각하면 늘릭
demo_lbl = Label(frame)
demo_lbl.grid(row=3, column = 0)



root.mainloop()