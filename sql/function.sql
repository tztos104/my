 --문자 타입 함수
 SELECT LOWER('ABCD') RESULT FROM DUAL;
 
 --SUNSTR(문자, 인덱스, 글자수)
 SELECT SUBSTR('ABC', 1, 2) result from DUAL;
 
 --REPLACE(문자, 이전문자, 새로운문자)
 SELECT REPLACE('ABC', 'A', 'E') RESULT FROM DUAL;
 
 --COMCAT(문자1, 문자2) - 문자 연결
SELECT CONCAT('안녕', '하세요') RESULT FROM DUAL;
--연결 연산자-'||'
SELECT '바보'|| '신가요?' RESULT FROM DUAL;
 --LAPD(문자, 문자수, 기호) 기호를 문자를 제외한 문자수만큼 왼쪽부터 채움
SELECT LPAD('cloud', 10, '*')RESULT FROM DUAL;

 --부서이름에서 처음부터 시작해서 2개의 문자 출력
 SELECT SUBSTR(deptname, 1, 2) 부서명 
 FROM dept;
 
 --도서 제목에 야구가 포함된 도서를 농구로 변경하여 검색
  SELECT bookid, REPLACE(bookname, '야구', '농구') 도서명 
 FROM book;
 
--4월 1일에서 10일후(특정한 날: 문자형-> 날짜형)
 SELECT  TO_DATE('2023/04/01') +  10 FROM DUAL;
 
 --입사일 : 2022-1-1 퇴사일 :2022-12-31
 SELECT
 round(MONTHS_BETWEEN(TO_DATE('2023-1-31'), TO_DATE('2022-1-1')), 0)총개월수
 FROM DUAL;
 
 SELECT * FROM emp;
 --NVL(인수 1, 인수 2) : 인수1이 NULL이 아니면 인수1이 출력 NULL이면 인수 2가 출력
 --급여가 없느 사원을 검색하시오
 SELECT * FROM emp
 WHERE sal IS NULL;
 
 
 SELECT empname,
        NVL(sal, 0)
    FROM emp;
    
    --DECODE(칼람, 조건, 참, 거짓) 함수 -if 함수랑 비슷
    
    UPDATE emp SET gender= '여자'
    WHERE empno = 100 OR empno = 101;
    
     UPDATE emp SET gender= '남자'
    WHERE empno = 102 OR empno = 103;
    
    SELECT empname,
        sal,
        DECODE(gender, '남자','M', 'F' ) gender
    FROM emp;
    
    --CASE WHEN
/*   CASE
        WHEN 조건 THEN 결과1
         WHEN 조건 THEN 결과2
         ELSE 결과 3
         END  */
    SELECT empname,
        sal,
        CASE
        WHEN gender='남자' THEN 'M'
        ELSE 'F'
        END gender
        FROM emp;
        
--급여가 250만원 이상이면 직급을 '대리'로 표시하고, 
--급여가 350만원 이상이면 (과장으로 표시
         
         SELECT empname,
        sal,
        CASE
        WHEN sal>=2500000 AND sal<3500000 THEN '대리'
        WHEN sal>=3500000 THEN '과장'
        ELSE '신입'
        END 직급
        FROM emp;
        
        
        
        --DECODE
        
        
          SELECT empname,
        sal,
        DECODE(sal, '3500000','과장', 'F' ) gender
    FROM emp;
    