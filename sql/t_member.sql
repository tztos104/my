--ȸ�����̺� ����
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
--�۹�ȣ, ������, �۳���, �ۼ���, ������, ��ȸ��, ���̵�(�ܷ�Ű)
--�ڵ� ����(SEQUENCE) (NOCACHE���� 20���� �̸���Ƴ� ���������� 21������ ����)
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
    ('tztos', 'm12345', '�̿���', '��');
    
SELECT * FROM t_member;
SELECT * FROM t_board;
insert into t_board(bnum, title, content, memberid) 
VALUES (b_seq.NEXTVAL, '�����λ�', '�ȳ��ϼ���', '123');

DROP TABLE t_board;
drop SEQUENCE b_seq;
SELECT DECODE(COUNT(*), 1, 'true', 'false') AS "result" From t_member WHERE memberid= '123';
ALTER TABLE t_board ADD fileupload VARCHAR2(100);

--������ ó��
SELECT * FROM
(select ROWNUM RN, t_board.* 
from t_board ORDER BY bnum DESC )
where RN >=21 And RN <=30;
order by bnum desc;

--�� ���� ��
select count(*) from t_board;

commit;