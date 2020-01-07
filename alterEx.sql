select * from project;

desc project;

alter table project add clientid varchar(30);

alter table project modify  clientid varchar(11);

alter table project drop column clientid;

alter table Project change  clientid clientname 
varchar(30)