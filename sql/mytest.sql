CREATE TABLE mytest(
    class VARCHAR2(2),
    name  VARCHAR2(6)
    );
    
INSERT INTO mytest VALUES ( 'A', '조조');
INSERT INTO mytest VALUES ( 'A', '조조');
INSERT INTO mytest VALUES ( 'A', '조조');
INSERT INTO mytest VALUES ( 'B', '유비');
INSERT INTO mytest VALUES ( 'B', '관우');
INSERT INTO mytest VALUES ( 'C', '여포');
INSERT INTO mytest VALUES ( 'C', '여포');

SELECT * FROM mytest;

--반별 학생수를 구하시오
SELECT class, count(name) 학생수
FROM mytest
GROUP BY class;

--이름- 중복제거 disrinct
SELECT class, count(DISTINCT NAME)학생수
FROM mytest
GROUP BY class;

--CASE WHEN
SELECT 
       COUNT( CASE
            WHEN class = 'A' THEN 1
        END) AS A,
         COUNT( CASE
            WHEN class = 'B' THEN 1
        END) AS B,
         COUNT( CASE
            WHEN class = 'C' THEN 1
        END) AS C
FROM mytest;

--DECODE(칼럼, 조건, 참인값, 거짓인값)

SELECT Count(DECODE(class, 'A', 1) )AS A,
Count(DECODE(class, 'B', 1) )AS B,
Count(DECODE(class, 'C', 1) )AS C
FROM mytest;




