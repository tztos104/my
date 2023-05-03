#네이버 메뉴 가져오기

import requests
from bs4 import BeautifulSoup

response=requests.get("https://www.naver.com")
print(response.text)
html = BeautifulSoup(response.text, 'html.parser')
print(html)

menu_ul= html.find('ul', attrs={'class':'list_nav type_fix'})
print(menu_ul)
first_li = menu_ul.find('li')

first_a =first_li.find('a')
print(first_a.text)

#다른 메뉴찾기 -findall()
all_li = menu_ul.findAll('li')
all_li_a = menu_ul.findAll('a')

for li in all_li:
    print(li.text)

for a in all_li_a:
    print(a.text)