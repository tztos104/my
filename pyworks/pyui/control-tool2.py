#컨트롤 도구 -클래스 사용 생성

from tkinter import *

class App:
    def __init__(self, master):
        frame = Frame(master)
        frame.pack()

        Label(frame, text="제목").grid(row=0, column=0)
        Entry(frame).grid(row=0, column=1)
        Button(frame, text="확인").grid(row=0, column=2)

        #체크박스 만들기
        Checkbutton(frame, text="체크 버튼").grid(row=1, column=0)

        #리스트 목록상자
        listbox = Listbox(frame, height=3, selectmode=SINGLE)
        colors = ['빨강', '노랑', '초록', '파랑']
        for item in colors:
            listbox.insert(END, item)

        listbox.grid(row=1, column=1)

    #radio 버튼 - 프레임 위에 작성
        radio_frame = Frame(frame) #프레임 생성
        radio_selection = StringVar()
        b1 = Radiobutton(radio_frame, text='left',
                         variable=radio_selection, value='L')
        b1.pack(side=LEFT)
        b2 = Radiobutton(radio_frame, text='right',
                         variable=radio_selection,value='R')
        b2.pack(side=RIGHT)
        radio_frame.grid(row=1, column=2)
root =Tk()
app = App(root)
root.mainloop()