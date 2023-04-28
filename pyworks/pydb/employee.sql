BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "employee" (
	"empid"	char(10),
	"name"	TEXT NOT NULL,
	"age"	INTEGER,
	"salary"	INTEGER,
	PRIMARY KEY("empid")
);
INSERT INTO "employee" VALUES ('e101','추신수',41,20000);
INSERT INTO "employee" VALUES ('e102','박인비',33,15000);
COMMIT;
