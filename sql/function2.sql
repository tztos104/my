CREATE TABLE K1(
    ID VARCHAR2(3),
    CNT NUMBER(2)
);

INSERT INTO K1 VALUES('가', 5);
INSERT INTO K1 VALUES('나', NULL);
INSERT INTO K1 VALUES('다', 5);
INSERT INTO K1 VALUES('라', NULL);
INSERT INTO K1 VALUES('마', 10);

SELECT *
FROM customer
WHERE phone IS NULL;


--NVL(칼럼값, 특정값): 칼럼이름 null인경우는 특정값을 출력, NULL이 아니면 칼럼값 출력
SELECT custid, name, address, NVL(phone, '010-1234-5678')
FROM customer;

SELECT*FROM K1;

--전체 개수, 합계, 평균, 최소값
SELECT COUNT(CNT)
FROM K1;

SELECT COUNT (NVL(CNT, 0)) COUNT FROM K1
GROUP BY ID;


SELECT SUM(NVl(CNT, 0))/4 SUM FROM k1;

--RANK()함수
SELECT * FROM employee;

SELECT empname,
    sal,
        RANK()OVER(ORDER BY sal DESC) 급여랭크,
        DENSE_RANK() OVER(ORDER BY sal DESC) 급여댄스랭크
        from employee;
        
        --조인과 서브쿼리
        SELECT * FROM customer;
        SELECT * FROM book;
        SELECT * FROM orders;
        
        --고객과 고객의 주문에 관한 데이터를 모두 검색하시오!
        SELECT * FROM customer, orders
        WHERE CUSTOMER.custid = orders.custid;
        
        
        
        
        