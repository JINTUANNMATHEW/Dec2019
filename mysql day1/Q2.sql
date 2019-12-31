/* String functions */ 

instr() : Displays the first occurrence of given char. 

select instr('keerthi','e')

select ENAME,INSTR(ENAME,'A') FROM EMP;

length() : Display length of given string 

select length('Aman')

select Ename,Length(Ename) From Emp;

reverse() : Displays string in reverse order 

select Reverse('Leela') 

select Ename,Reverse(Ename) From Emp;

lower() : Displays in lower-case 

upper() : Displays in upper-case 

select lower('Leela'), Upper('Arjun')

select Ename,Lower(Ename),Upper(Ename) From Emp;

substring() : Displays the part of the string. 

select substring('Welcome to MySql',2,3) 

-- means from 2nd char it prints next 3 chars 

replace() : Displays the old char/string with new char/string 
in all occurrences 

select replace('Java Training','Java','MySql') 



