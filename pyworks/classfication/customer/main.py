#객체 리스트
#Customer -2aud GoldCustomer 2명 VIP 1명
from classfication.customer.customer import Customer
from classfication.customer.goldcustomer import GoldCustomer
from classfication.customer.vipcustomer import VIPCustomer

customer=[
    Customer(101, "놀부"),
    Customer(102, "팥쥐"),
    Customer(103, "팥쥐2"),
    Customer(104, "팥쥐3"),
    Customer(105, "팥쥐4"),
    Customer(106, "팥쥐5"),
    GoldCustomer(201, "흥부"),
    GoldCustomer(202, "콩쥐"),
    GoldCustomer(203, "사또"),
    GoldCustomer(204, "어사"),
    VIPCustomer(301, "심청", 32),
    VIPCustomer(302, "왕", 532)
]
print("**************************구매 가격과 보너스 포인트 계산 *****************")

for cus in customer:
    price = 10000
    cost = cus.calc_price(price)
    print(cus.getname() + "님의 구매비용은 " + format(cost, ',d')+ "원 입니다.")
    print(cus)

print("***************************고객 정보 출력 *****************")
#전체 출력
for cus in customer:
    print(cus)