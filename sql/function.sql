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