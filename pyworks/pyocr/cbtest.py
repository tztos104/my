import cv2

img = cv2.imread("./source/prod1.jpg", cv2.IMREAD_COLOR)
cv2.imshow('cat', img)
cv2.waitKey(0)

cv2.imwrite('./source/prod1.jpg', img)

img_gray = cv2.cvtColir(img, cv2.COLOR_BGR2GRAY)
cv2.imshow('cat', img_gray)
cv2.waitKey(0)

cv2.imwrite('./source/prod1.jpg', img_gray)
