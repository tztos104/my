CREATE TABLE tbl_class(
    cid     NUMBER(3) PRIMARY KEY, --사원번호
    cname   VARCHAR2(20) NOT NULL, --사원이름
    ctel      VARCHAR2(10) NOT NULL,
    clocation VARCHAR2(20) NOT NULL );
    
   ALTER TABLE tbl_class MODIFY cname VARCHAR2(30); 
    ALTER TABLE tbl_class MODIFY ctel VARCHAR2(30);
   
   INSERT INTO tbl_class VALUES ('101','소프트웨어학과','02-1234-1234','B동 3층'); 
      INSERT INTO tbl_class VALUES 
      ('102','전기전자공학과','02-1234-4567','B동 4층'); 
         INSERT INTO tbl_class VALUES 
      ('103','화학공학과','02-1234-5678','B동 5층'); 
      
      SELECT * FROM tbl_class;