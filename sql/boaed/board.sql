--board 테이블 
CREATE TABLE board(
    bno NUMBER(5) PRIMARY KEY,      --글번호
    title VARCHAR2(200)NOT NUll,            --글제목
    writer VARCHAR2(20)NOT NUll,        --글쓴이
    content VARCHAR2(2000)NOT NUll,     --글내용
    regdate DATE DEFAULT SYSDATE


);

--시퀀스(일련번호, 자동순번)
CREATE SEQUENCE seq;

--추천수 칼럼을 추가하시오(칼럼명 :cnt 자료형 nunmber default 0
ALTER TABLE board ADD cnt NUMBER DEFAULT 0;

--게시글 추가
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.NEXTVAL, '가입인사', '강남','안녕하세요, 가입인사 드려요');
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.NEXTVAL, '공지사항입니다.', '관리자','가입인사를 남겨주세요');
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.NEXTVAL, '가입인사입니다.', '이강','안녕하세요');
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.NEXTVAL, '가입인사입니다.', '이강','안녕하세요');
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.NEXTVAL, '좋은하루입니다.', '이쁜이','안녕하세요');
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.NEXTVAL, '가입인사입니다.', '다다다','안녕하세요');


--게시글 검색
SELECT*FROM board
ORDER BY regdate ;

--ROWNUM : 오라클이 제공하는 논리적인 일련번호
--rownum 은 반드시 1을 포함해야함.
SELECT ROWNUM, bno, title, content
FROM board
WHERE ROWNUM >0 AND ROWNUM <=10;
--페이지 처리
SELECT * 
FROM
(SELECT ROWNUM rn, bno, title, content
FROM board)
WHERE rn >=11 AND rn <=20; --ROWNUM의 별칭을 사용하면 가능

--ROWID
--데이터를 구분하는 유일한 값
--ROWID를 통해서 테이터 파일, 어느 블럭에 저장되어 있는지 알 수 있음
SELECT ROWID, bno, title, content
FROM board;

SELECT ROWID, bno, title, content
FROM board
WHERE ROWID = 'AAAS86AAHAAAAFcAAA';


--재귀 복사(자료삽입)
--INSERT INTO(칼럼) (SELECT 칼럼 FROM 테이블이름)
INSERT INTO board(bno, title, writer, content)
    (SELECT seq.nextval, title, writer, content From board);
    

--ORDER BY regdate;

---작성자가 관리자인 게시글을 검색하시오
SELECT * FROM board
WHERE bno =2 ;

--게시글의 작성자들 '관리자'에서 'admin'으로 변경하세요.
--UPDATE 테이블이름 set 칼럼 = 변경값 WHERE절
UPDATE board set writer = 'admin' 
WHERE bno= 2;

--3번글  삭제
DELETE FROM board 
WHERE bno=3;




commit