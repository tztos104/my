SELECT * FROM book;
SELECT * FROM customer;


Select * from book
where bookname like '%축구%';

--축구에 관한 도서 중 각격이 20000원 이상인 도서를 검색하시오
Select * from book
where bookname like '%축구%' and price>= 20000;

--도서를 이름순으로 검색하시오(오름차순
Select * from book
order by bookname;

--도서를 가격순으로 검색하고, 가격이 같으면 이름순으로 정렬하시오
select * from book
order by price DESC, bookname;

--자료 추가 (11, '혼자 공부하는 자바', '한빛미디어', 13000)
INSERT INTO book VALUES (11, '혼자 공부하는 자바', '한빛미디어', 24000);

--bookname을 혼자 공부하는 파이썬으로 변경하시오
update book set bookname = '혼자 공부하는 파이썬'
where bookid = 11;




