#grid (row, column, sticky=W)
#sticky -W(왼쪽), E(오른) ,S(아래),  N(위)

#용어 사전 만들기
from tkinter import *
import keyboard


def select():
    try:
        word =entry.get().lower()
        definition = dic[word]
        output.delete(0.0, END)
        output.insert(END, definition)
    except KeyError:
        output.insert(END, "단어의 정의를 찾을 수 없습니다.")

keyboard.


win = Tk()
win.title("용어사전")

lbl =Label(win)
lbl.config(text='단어를 입력하고 엔터 키를 누르세요')
lbl.grid(row=0, column=0 )

entry = Entry(win, width=20, bg='yellowgreen')
entry.grid(row=1, column=0, sticky=W)

btn= Button(win, text='제출' , command=select )
btn.grid(row=2, column=0 , sticky=W)

output = Text(win, width=80,height=10, bg='yellowgreen')
output.grid(row=3, column=0, sticky= W)

dic = {
    "html" : "하이퍼 텍스트 마크업 언어로 웹 페이지를 수성하는 언어이다.",
    "css" : "웹 페이지를 구성하는 요소로 디자인을 담당하는 웹 기술디다.",
    "함수" : "명령이나 기능을 수행하는 재사용 가능한 코드 조각이다."
}

win.mainloop()