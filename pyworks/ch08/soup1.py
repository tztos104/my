#BeautifulSoup4 라이브러리 -html 태그 파싱(parsing)
#BeautifulSoup(html 내용, '
from bs4 import BeautifulSoup

html_str = """
<html>
    <head>
      <title>웹 스크래핑</title>
    </head>
    <body>
    <ul class= 'item'>
      <li>인공지능</li>
      <li>빅데이터</li>
      <li>로봇</li>
      </ul>
    <ul class= 'comlang'>
      <li>파이썬</li>
      <li>자바</li>
      <li>c/c+</li>
      </ul>
    
    </body>
</html>

"""

soup = BeautifulSoup(html_str, 'html.parser')
ul = soup.find('ul', attrs={'class':'item'})
print(ul)
print(ul.text)

ulli = ul.findAll('li') #첫번째 li만 찾음
print(ulli)
print(ulli[1])
print(ulli[1].text)

all_li = ul.findAll('li')

for li in all_li:
    print(li.text)
