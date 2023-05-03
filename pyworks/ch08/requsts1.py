#requests 모듈 : pythin의 HTTP 라이브러리임
#url을 가져올 수 있음
import requests

url = 'https://www.python.org'
response= requests.get(url)
print(response)
print(response.status_code)
html= response.text
print(html)

url2 = 'https://www.python.org/3'
response2 = requests.get(url2)
print(response2)

#로봇 배제 표준
#무분별하게 검색 로봇이 접근하는 것을 막는 규정
urls = ['htts://www.python.org/', 'https://www.daum.net']
filename = 'robots.txt'
print(urls[0] + filename)

for url in urls:
    url_path = url + filename
    print(url_path)
    response = requests.get(url_path)
    print(response)