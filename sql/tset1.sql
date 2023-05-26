select*from book;

delete book 
WHERE bookid= 11;

--책의 총 수량
select count(*) 총수량 from book;

--도서중 가장 높은 가격을 찾으시오
select max(price) 최곡가격 from book;

--가장 비싼 도서의 이름을 검색하시오
select bookname,price from book
where price=
(select max(price) 최고가격 from book);

--고객과 고객의 주문에 관한 데이터를 모두 검색하시오
select * from customer;
select* from orders;

select *
from customer cus,orders ord
where cus.custid = ord.custid;

--고객별 주문가격을 검색하시오
select cus.name, sum(saleprice)
from customer cus,orders ord
where cus.custid = ord.custid
group by cus.name;
--having cus.name='김연아';

