SELECT ROWNUM, bno, title, writer, content
FROM board
ORDER BY bno;

SELECT * FROM
(SELECT ROWNUM RN, bno,title, writer, content FROM board )
WHERE RN > 10 AND RN <= 20;

--rownumÀÇ ¿Ã¹Ù¸¥ »ç¿ë
CREATE TABLE EX_SCORE(
    NAME VARCHAR2(10),
    SCORE NUMBER
);

INSERT INTO ex_score VALUES('±èÇÏ³ª' , 94);
INSERT INTO ex_score VALUES('±èµÑ' , 95);
INSERT INTO ex_score VALUES('±è¼Â' , 91);
INSERT INTO ex_score VALUES('±è³Ý' , 97);
INSERT INTO ex_score VALUES('±è´Ù¼¸' , 84);
INSERT INTO ex_score VALUES('±è¿©¼¸' , 90);
INSERT INTO ex_score VALUES('±èÀÏ°ö' , 70);
INSERT INTO ex_score VALUES('±è¿©´ü' , 100);
INSERT INTO ex_score VALUES('±è¾ÆÈ©' , 23);
INSERT INTO ex_score VALUES('±è¿­' , 54);
INSERT INTO ex_score VALUES('±è¿­µÑ' , 94);


SELECT * FROM EX_SCORE;

SELECT ROWNUM, NAME, SCORE
    FROM ex_score
    WHERE ROWNUM <=5
    ORDER BY SCORE DESC;
    
    --¿Ã¹Ù¸¥ »ç¿ë
    SELECT * FROM
    (SELECT ROWNUM, NAME, SCORE
    FROM ex_score
    ORDER BY SCORE DESC)
    WHERE ROWNUM <=5;