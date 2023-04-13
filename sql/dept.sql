--부서 테이블(dept)
CREATE TABLE dept(
    --칼럼이름 자료형
    deptno   VARCHAR2(4), PRIMARY KEY,
    deptname VARCHAR2(20) NOT NULL,
    office VARCHAR2 (10)
    );
    
    
    
    --부서 자료 추가
INSERT INTO dept (deptno, deptname, office) VALUES ('1000','인사팀','서울');
INSERT INTO dept (deptno, deptname, office) VALUES ('1001','전산팀','수원');
INSERT INTO dept (deptno, deptname, office) VALUES ('1002','전산팀','수원');
INSERT INTO dept (deptno, deptname, office) VALUES ('1003','영업팀','');
--부서 자료 검색
SELECT deptno, deptname, office FROM dept;

COMMIT;

--특정한 자료 검색 : WHERE 절 조건
SELECT*FROM dept
WHERE deptno ='1002';

--자료 정렬 : ORDER BY 칼럼명 (ASC?DESC)
SELECT * FROM dept
ORDER BY deptno DESC;

--부서번호가 1002인 부서를 회계팀으로 변경하시오
UPDATE dept SET deptname = '회계팀'
WHERE deptno = 1002;


--부서 자료 삭제
DELETE FROM dept
WHERE deptno= '1000' ; 

--참조 무결성 제약 위배 (외래키 제약)
--1. 사원이 소속된 부서를 삭제할때 '자식 레코드가 있다'는 오류발생
--2. 부서번호가 없는 사원 자료를 추가할 때 '부모키가 없다'는 오류발생

COMMIT;



