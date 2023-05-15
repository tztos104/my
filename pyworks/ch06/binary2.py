#이미지 파일 읽고 쓰기
#open(파일경로, 'rb')
with open("prod1.jpg", "rb") as f1:
    img = f1.read()




with open("./output/prod1.jpg", "wb") as f2:
    f2.write(img)