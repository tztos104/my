CREATE TABLE tbl_student(
    snum    NUMBER(8) PRIMARY KEY, 
    sname   VARCHAR2(20) NOT NULL, 
    age      NUMBER(3) NOT NULL,
    gender   VARCHAR2(8) NOT NULL,
    address VARCHAR2(50) NOT NULL,
     cid      NUMBER(3) NOT NULL ,
     CONSTRAINT fk_class FOREIGN KEY(cid)
     REFERENCES tbl_class(cid) ON DELETE CASCADE
     );
    
  
   
   INSERT INTO tbl_student VALUES 
   ('20211234','이강','22','여자', '서울시 종로구', '102');
   INSERT INTO tbl_student VALUES 
   ('20211235','박대양','25','남자', '경기도 성남시', '101');
   INSERT INTO tbl_student VALUES 
   ('20211236','한비야','23','여자', '경기도 수원시', '103');
      INSERT INTO tbl_student VALUES 
   ('20211237','투데이','31','남자', '경기도 광주시', '101');
      INSERT INTO tbl_student VALUES 
   ('20211238','긴하루','19','여자', '서울 강남구', '101');
       INSERT INTO tbl_student VALUES 
   ('20211239','이영준','36','남자', '인천시 계양구', '104');
      INSERT INTO tbl_student VALUES 
   ('20211240','또바기','25','여자', '서울 강남구', '104');
      
        SELECT * FROM tbl_student;
        
        
       
        DESC age;
ORDER BY sal DESC;

s