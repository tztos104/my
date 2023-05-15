#이름을 입력받고 화면에 출력하기

from tkinter import *

def click():
    text= entry.get() #get()-가져오기
    output.delete(0.0, END)# 0 줄번호, 0 시작문자의 위치
    output.insert(END, text) #insert() -삽입하기
    #END- 문자열이 입력된 최종 지점. 삭제후 삽입

root = Tk()
root.title("입력 및 출력")
root.geometry("200x200")
Label(root, text="이름 : ").grid(row=0, column=0)

entry= Entry(root, width=15)
entry.grid(row=0, column=1)
#grid (row, column, sticky=W)
#sticky -W(왼쪽), E(오른) ,S(아래),  N(위)
btn = Button(root)
btn.config(command=click , text="확인")
btn.grid(row=1, columnspan=2)

output= Text(root, width=20, height=5)
output.grid(row=2, columnspan=2)

root.mainloop()