# 로또 당첨앱 제작
import requests
from bs4 import BeautifulSoup
from tkinter import *


def lotto_win():
    # num=1063
    num = entry.get()
    url = "https://www.dhlottery.co.kr/gameResult.do?method=byWin&drwNo={}".format(num)
    response = requests.get(url)

    soup = BeautifulSoup(response.text, "html.parser")
    win_result = soup.select_one('div.win_result')
    win_list = win_result.text.split('\n')[7:13]
    win_list
    print('당첨번호')
    print(win_list)
    bonus_num = win_result.text.split('\n')[-4]
    bonus_num

    output.delete(0.0, END)
    output.insert(END, f'당첨번호: {win_list} \n보너스번호 : {bonus_num}')
    entry.config(bg='lightgray')


# lotto_win()
window = Tk()
window.title("로또 당첨 확인")

Label(window, text="당첨 회차 입력: ").grid(row=0, column=0, sticky=W)
# 입력 상자

entry = Entry(window, bg='yellow')
entry.grid(row=1, column=0, sticky=W)
btn = Button(window, text="당첨 번호 확인", command=lotto_win)
btn.grid(row=2, column=0, sticky=W)
# 출력상자
output = Text(window, bg='skyblue', width=50, height=6)
output.grid(row=3, column=0, sticky=W)

window.mainloop()