DROP TABLE IF EXISTS DEPT;

Create Table Dept 
(
  DeptCode varchar(10),
  DeptHead varchar(30),
  Primary Key(DeptCode)
);

INSERT INTO Dept(DeptCode,DeptHead)
Values('D001','Sougata'),
('D002','Leela'),
('D003','Aman'),
('D004','Suhasini');

DROP table IF EXISTS Emp;

Create Table Emp
(
   Ecode varchar(10) Primary Key,
   DeptCode varchar(10) REFERENCES Dept(DeptCode),
   EmpName varchar(30)
);

INSERT INTO Emp(Ecode,DeptCode,EmpName)
Values('E001','D001','Raj'),
('E002','D002','Niskala'),
('E003','D001','Rahul'),
('E004','D003','HARI'),
('E005','D002','HariPrasad');

DROP TABLE IF EXISTS Project;

Create Table Project
(
   Ecode varchar(10) REFERENCES Emp(Ecode),
   ProjCode varchar(10),
   Hours INT,
   Primary Key(Ecode,ProjCode)
);

Insert Into Project(Ecode,ProjCode,Hours)
values('E001','P001',565),
('E003','P001',523),
('E005','P002',526),
('E001','P003',525),
('E003','P002',6788),
('E005','P001',556),
('E005','P003',664)