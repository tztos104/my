import pytesseract.pytesseract
from PIL import Image

pytesseract.tesseract_cmd= "C:/Program Files/Tesseract-OCR/tesseract.exe"
img =Image.open("source/ca.PNG")
#img.show()
text= pytesseract.image_to_string(img, lang="kor+eng")
print(text)


with open("./output/news.text", 'w', encoding="utf-8") as f:
    #f.write(text)
    f.write(text.replace(" ",""))




