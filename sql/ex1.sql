--문자 자료형 비교
CREATE TABLE ex1(
    culumn1 CHAR(10),
    culumn2 VARCHAR2(10)
    );
    
--자료추가

INSERT INTO ex1(culumn1, culumn2) VALUES ('abc','abc');
INSERT INTO ex1 VALUES ('강남','강남');

--자료 조회
select culumn1, length(culumn1) len1, culumn2, length(culumn2) len2 from ex1;

commit;