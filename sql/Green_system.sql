--숫자 타입 함수
--제공된 테이블 : dual
SELECT ABS(-10), ABS(10) FROM dual;

--반올림 :ROUND(수, 자리수)
 SELECT ROUND(3.875, 2) FROM DUAL;
 
 SELECT sal 급여,
        sal/30 일급,
        ROUND(sal/30, 1) 결과1,
         ROUND(sal/30, 0) 결과2,
          ROUND(sal/30, -1) 결과3
FROM employee;

--sal을 30일로 나눈후 소수 자리수에 따라 절삭 값출력
SELECT sal 급여,
     sal/30 일급,
     TRUNC(sal/30, 1) 결과1,
TRUNC(sal/30, 0) 결과2,
TRUNC(sal/30, -1) 결과3
    FROM employee;
    
    --고객별 평균 주문 금액을 백원단위로 반올림한 값을 구하시오
    SELECT custid 고객번호 , ROUND( AVG(saleprice),-2) 평균주문금액
    FROM orders
    GROUP BY custid;
    
     SELECT custid 고객번호 , COUNT(*) 주문수, SUM(saleprice) 총액
    FROM orders
    GROUP BY custid;
    
     SELECT custid 고객번호 ,  ROUND(SUM(saleprice)/COUNT(*),-2) 평균
    FROM orders
    GROUP BY custid;
    
    SELECT * FROM customer;
    
    