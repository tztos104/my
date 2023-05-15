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

--게시글 추가
INSERT INTO board(bno, title, writer, content) 
VALUES(seq.NEXTVAL, '가입인사', '강남','안녕하세요, 가입인사 드려요');

--게시글 검색
SELECT*FROM board;