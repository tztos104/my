--사원 테이블
CREATE TABLE emp(
    --칼럼 이름 자료형
    empno NUMBER(3) PRIMARY KEY, --사원번호
    empname VARCHAR2(20) NOT NULL, --사원이름
    sal NUMBER(10),
    creatdate DATE DEFAULT SYSDATE --등록일
);

--사원의 성별 칼럼 추가(ALTER ~ ADD 칼럼이름 자료형)
ALTER TABLE emp ADD gender VARCHAR2(4);

--사원의 성별 의 자료형을 변경 (MODIFY)varchar2(10)
ALTER TABLE emp MODIFY gender VARCHAR2(10);

DESC emp;

--사원추가
INSERT INTO emp VALUES (100, '이강', 2500000, SYSDATE); 
INSERT INTO emp VALUES (101, '김산', 3000000, SYSDATE);
INSERT INTO emp VALUES (102, '오상식', 5000000, SYSDATE);
INSERT INTO emp VALUES (103, '김신입', '' , SYSDATE);
INSERT INTO emp VALUES (104, '서울시', 1500000 , SYSDATE, '여');

--사원 조회
SELECT * FROM emp;

--사원 번호, 사원이름, 급여를 검색하시오
SELECT empno as 사번, empname as 사원명, sal as 급여 FROM emp;

--급여가 없는 사원을 검색하시오
SELECT * FROM emp 
WHERE sal IS NULL; --null이 아닌 구문 (is not null)

--급여가 300만원 이하인 사원을 급여가 많은 순으로 정렬하시오
SELECT*FROM emp
WHERE sal <= 3000000 
ORDER BY sal DESC;

--DESC 는 정렬
--급여가 많은 순서로 정렬하시오
SELECT*FROM emp
ORDER BY sal DESC;

--성별이 '여' 인 사원을 '여자'로 변경하시요 UPDATE
--SELECT * FROM emp
--WHERE empno =104;

UPDATE emp SET gender = '여자'
WHERE empno = 104;


--사원의 수를 구하시오
--집계함수 count() ,sum() ,avg() , max() ,min()
SELECT COUNT(*) as 사원수
FROM emp;
--사원 급여의 합계 평균
SELECT SUM(sal) 급여합계 , AVG(sal) 급여평균
FROM emp;

--사원 이름이 서울시인 사원 삭제
DELETE FROM emp
WHERE empname= '서울시'; 

ROLLBACK;
--commit 전에만 롤백 가능
COMMIT;