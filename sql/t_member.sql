--회원테이블 생성
CREATE TABLE t_member(
    memberid VARCHAR2(20) PRIMARY KEY,
    passwd VARCHAR2(20) NOT NULL,
    name VARCHAR2(30) NOT NULL,
    gender VARCHAR2(10),
    joindate DATE DEFAULT SYSDATE

);
CREATE TABLE t_board(
    bnum NUMBER(4) PRIMARY KEY,
    title varchar2(100) NOT NULL,
    content VARCHAR2(2000) NOT NULL,
    regdate TIMESTAMP DEFAULT SYSTIMESTAMP,
    modifydate TIMESTAMP,
    hit NUMBER DEFAULT 0,
    memberid VARCHAR2(20) NOT NULL,
    CONSTRAINT FK_MemberBoard FOREIGN KEY(memberid)
    REFERENCES t_member(memberid) ON DELETE CASCADE


);
--글번호, 글제목, 글내용, 작성일, 수정일, 조회수, 아이디(외래키)
--자동 순번(SEQUENCE) (NOCACHE없음 20까지 미리잡아나 다음순서가 21번부터 시작)
CREATE SEQUENCE b_seq
INCREMENT BY 1
START WITH 1
MINVALUE 1
NOCYCLE
NOCACHE
;

insert into t_board VALUES( )

delete from t_board where bnum= 2;
insert into t_member(memberid, passwd, name, gender) VALUES 
    ('tztos', 'm12345', '이영준', '남');
    
SELECT * FROM t_member;
SELECT * FROM t_board;
insert into t_board(bnum, title, content, memberid) 
VALUES (b_seq.NEXTVAL, '가입인사', '안녕하세요', '123');

DROP TABLE t_board;
drop SEQUENCE b_seq;
SELECT DECODE(COUNT(*), 1, 'true', 'false') AS "result" From t_member WHERE memberid= '123';
ALTER TABLE t_board ADD fileupload VARCHAR2(100);

--페이지 처리
SELECT * FROM
(select ROWNUM RN, t_board.* 
from t_board ORDER BY bnum DESC )
where RN >=21 And RN <=30;
order by bnum desc;

--총 행의 수
select count(*) from t_board;

commit;