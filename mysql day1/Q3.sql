
SELECT Empno,Ename,Job,Sal,
CASE Job
  WHEN 'CLERK' THEN 'Sarbani'
  WHEN 'SALESMAN' THEN 'Aman'
  WHEN 'MANAGER' THEN 'Arjun'
  WHEN 'ANALYST' THEN 'Leela'
  WHEN 'PRESIDENT' THEN 'No Reporting'
END ReportTo
FROM Emp;


SELECT Empno,Ename,Job,Sal,Comm,
CASE 
  WHEN COMM IS NULL THEN SAL
   ELSE SAL+COMM
END TakeHome
FROM Emp;



SELECT Empno,Ename,Sal,Comm FROM Emp;