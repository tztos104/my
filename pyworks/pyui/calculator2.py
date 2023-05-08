#계산기- 간단한 숫자 표시

from tkinter import *

def click(key):
    if key == '=':
        try:
            value = eval(display.get().replace('＋', '+' ).replace('×', '*' )) #입력된 계산값
            display.delete(0, END)
            result = str(value)[0:10] #소수점 포함 10자리까지 출력
            display.insert(END, result)
        except:
            display.delete(0, END)
            display.insert(END, "---오류---")
    elif key == 'C':
        display.delete(0, END) #첫번째 문자부터 삭제
    else:
        display.insert(END, key)

root = Tk()
root.title("나의 계산기")

#출력창
#top_row 프레임
top_row = Frame(root)
top_row.grid(row = 0 , column = 0, sticky=N)
display = Entry(top_row, width=40, bg='light gray')
display.grid(row= 0, column=0)

# 숫자 버튼-num_pad
num_pad = Frame(root)
num_pad.grid(row=1, column=0, sticky=W)
num_pad_list = [
    '7', '8', '9', '-',
    '4', '5', '6', '＋',
    '1', '2', '3', '×',
    'C', '0', '.', '='
]
r=0
c=0
for btn_text in num_pad_list:
    def cmd(x = btn_text): #함수에 인수(버튼키)를 전달
        click(x)

    Button(num_pad, text=btn_text, width=10 ,height=5, command=cmd).grid(row=r, column=c)
    c= c + 1
    if c >3:
        c=0
        r=r+1

#연산자 프레임
operator = Frame(root)
operator.grid(row=1, column=1, sticky=E)
operator_list = [
    '합', '평',
    '제곱','루트',
    '', '',
    '', ''
    ]
r=0
c=0
for btn_text in operator_list:
    def cmd(x = btn_text):  # 함수에 인수(버튼키)를 전달
        click(x)

    Button(operator, text=btn_text, width=10 ,height=5, command=cmd).grid(row=r, column=c)
    c= c + 1
    if c >1:
        c=0
        r=r+1

root.mainloop()
