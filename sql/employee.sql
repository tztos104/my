--사원 테이블(부서와 관계를 맺은)
CREATE TABLE employee (
    empno     NUMBER(3) PRIMARY KEY, --사원번호
    empname   VARCHAR2(20) NOT NULL, --사원이름
    sal       NUMBER(10),
    creatdate DATE DEFAULT sysdate,
    gender    VARCHAR2(10),
    deptno    VARCHAR2(4),
    --외래키 (FOREIGN KEY) 제약조건
    CONSTRAINT emp_fk FOREIGN KEY (deptno)
        REFERENCES dept(deptno)
);--ON DELETE CASCADE(부서를 삭제하면 참조하고 있는 사원도 삭제)

INSERT INTO employee VALUES ( 100, '이강', 2500000, sysdate,'남자', '1000');
INSERT INTO employee VALUES ( 101, '이산', 2000000, sysdate,'여자', '1001');
INSERT INTO employee VALUES ( 102, '박달', 1500000, sysdate,'남자', '1002');
INSERT INTO employee VALUES ( 103, '루비', 3500000, sysdate,'', '1003');
INSERT INTO employee VALUES ( 104, '박그린', 4500000, sysdate,'여', '1000');
INSERT INTO employee VALUES ( 105, '아추워', 4500000, sysdate,'남자', '1000');


SELECT * FROM employee;

--성별이 남자인 사원을 검색
SELECT * FROM employee
WHERE gender = '남자'
AND sal >= 2500000;

SELECT * FROM employee
WHERE sal >=2000000
AND sal <=3000000;

--BETWEEN
SELECT * FROM employee
WHERE sal BETWEEN 2000000
AND 3000000;

--문자열 검색 : 일부 문자 포함 LIKE 문자
--성이 '이'인 사원을 검색하시어 
SELECT * FROM employee
WHERE empname LIKE '이%';

--사원 총 인원수를 구하시오
SELECT COUNT(*) as 사원수
FROM employee;

--중복없이 부서번호를 검색하시오(DISTINCT 키워드)
SELECT DISTINCT deptno 부서번호
FROM employee;

--GROUP  BY 절(소속등 그룹화), 조건절-HAVING
--부서별 급여 총액을 구하시오
SELECT deptno 부서, SUM(sal) 급여총액, AVG(sal) 급여평균
FROM employee
GROUP BY deptno
HAVING AVG(sal)>=3000000;
