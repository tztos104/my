SELECT custid, bookid,
    sum(saleprice)
    from orders
GROUP BY ROLLUP(custid, bookid);

CREATE TABLE department(
    dept_no VARCHAR2(3),
    jop_nm VARCHAR2(30),
    salary NUMBER(10));
    
    
    INSERT INTO department VALUES ('100', '증권사' , 3300000);
    INSERT INTO department VALUES ('100', '관리자' , 4300000);
    INSERT INTO department VALUES ('200', '증권사' , 5000000);
    INSERT INTO department VALUES ('200', '데이터분석가' , 4000000);
    INSERT INTO department VALUES ('200', '관리자' , 6000000);
    
    select * from department;
    
   -- 부서별 급여 총계
    SELECT dept_no,
    SUM(salary)
    from department
    GROUP BY dept_no;
    
       SELECT dept_no, jop_nm,
    SUM(salary)
    from department
    GROUP BY ROLLUP(dept_no, jop_nm)
    ORDER BY dept_no;
    
          SELECT custid, bookid,
    SUM(saleprice) 총판매액
    from orders
    GROUP BY GROUPING SETS(custid, bookid)
    ORDER BY custid;