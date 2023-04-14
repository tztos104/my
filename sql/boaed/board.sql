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
SELECT*FROM board;

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