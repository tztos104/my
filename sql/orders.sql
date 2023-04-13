--order 테이블(주문번호, 고객번호, 도서번호, 판매가격, 주문일)
CREATE TABLE orders(
    ordrid NUMBER PRIMARY KEY,
    custid NUMBER NOT NULL,
    bookid NUMBER NOT NULL,
    saleprice NUMBER,
    orderdate DATE,
    --외래키 설정
    CONSTRAINT cus_fk FOREIGN KEY(custid) 
    REFERENCES customer(custid),
    CONSTRAINT book_fk FOREIGN KEY(bookid) 
    REFERENCES book(bookid));
    
    --oders 자료 삽입
INSERT INTO orders VALUES (1, 1, 1, 6000, TO_date('2018-07-01','YYYY-MM-DD'));
INSERT INTO orders VALUES (2, 1, 3, 21000, TO_date('2018-07-03','YYYY-MM-DD'));
INSERT INTO orders VALUES (3, 2, 5, 8000, TO_date('2018-07-03','YYYY-MM-DD'));
INSERT INTO orders VALUES (4, 3, 6, 6000, TO_date('2018-07-04','YYYY-MM-DD'));
INSERT INTO orders VALUES (5, 4, 7, 20000, TO_date('2018-07-05','YYYY-MM-DD'));
INSERT INTO orders VALUES (6, 1, 2, 12000, TO_date('2018-07-07','YYYY-MM-DD'));
INSERT INTO orders VALUES (7, 3, 8, 15000, TO_date('2018-07-15','YYYY-MM-DD'));
INSERT INTO orders VALUES (8, 5, 9, 81000, TO_date('2018-07-21','YYYY-MM-DD'));
INSERT INTO orders VALUES (9, 3, 10, 16000, TO_date('2018-07-22','YYYY-MM-DD'));
INSERT INTO orders VALUES (10, 2, 10, 20000, TO_date('2018-07-23','YYYY-MM-DD'));


SELECT * FROM orders;