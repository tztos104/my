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

COMMIT;



