#naver에서 필요한 정보 가져오기

import requests
from bs4 import BeautifulSoup

url="https://www.naver.com/"
response = requests.get(url)
#print(response.text)
html = BeautifulSoup(response.text, 'html.parser')
#print(html)
print(html.title)
print(html.title.name)
print(html.title.next)

#'네이버를 시작페이지로 문자열찾기
div = html.find('div', attrs={'class': 'service_area'})
a= div.find('a')
print(a)
print(a.text)


a2= div.findAll('a')
print(a2[1])
print(a2[1].text)

for b in a2:
    print(b)
    print(b.text)