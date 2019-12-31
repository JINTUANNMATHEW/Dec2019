desc emp;


SELECT
     Empno,
     Ename,
     Job,
     Sal
FROM Emp;


SELECT
     Empno,
     Ename,
     Job,
     Sal,
     Sal+500 IncSal,
     Sal-500 DecSal
FROM Emp;

SELECT
     Empno 'Employ No',
     Ename 'Employ Name',
     Job 'Designation',
     Sal 'Salary'
FROM Emp;