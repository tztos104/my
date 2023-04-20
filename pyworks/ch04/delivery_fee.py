#배송비 계산
#주문 상품 가격이 2만원 미만이면 배송비 2500원 포함하고
#아니면 배송비를 포함하지 않는다.
"""
price = 25000
delivery = 2500
if price < 20000:
    price = price + delivery
else:
    price
print(price)
"""


def delprice(unit_price, num):
    delivery = 2500
    price = unit_price * num
    if price < 20000:
        price = price + delivery
    else:
        price
    return price
order1 = delprice(25000, 2)
order2 = delprice(3000, 5)
print(order1)
print(order2)