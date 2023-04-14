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
   ('20211234','�̰�','22','����', '����� ���α�', '102');
   INSERT INTO tbl_student VALUES 
   ('20211235','�ڴ��','25','����', '��⵵ ������', '101');
   INSERT INTO tbl_student VALUES 
   ('20211236','�Ѻ��','23','����', '��⵵ ������', '103');
      
        SELECT * FROM tbl_student;