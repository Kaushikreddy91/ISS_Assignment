Create Table personal_info(
id int NOT NULL,
name varchar(30),
age int,
phn int
);

Alter Table personal_info Add primary key(id);

insert into personal_info values(1,'Kaushik',32,2457);
insert into personal_info values(2,'Warner',24,9023);
insert into personal_info values(3,'Virat',28,6734);
insert into personal_info values(4,'Rahul',42,2847);
insert into personal_info values(5,'Akshay',38,3584);

Select * from personal_info;
/*
+----+---------+------+------+
| id | name    | age  | phn  |
+----+---------+------+------+
|  1 | Kaushik |   32 | 4884 |
|  2 | Warner  |   24 | 9023 |
|  3 | Virat   |   28 | 6734 |
|  4 | Rahul   |   42 | 2847 |
|  5 | Akshay  |   38 | 3584 |
+----+---------+------+------+
5 rows in set (0.00 sec)
*/

Select * from personal_info where id=2;

Select * from personal_info where age=42 AND phn=2847;

Select * from personal_info where age<40 OR phn=3584;

Select name from personal_info order by age ASC;

Update personal_info Set name='Varun' Where id=5;

Delete from personal_info where id=3;

Select id from personal_info where name like 'Va%';

Select * from personal_info where name in ('Varun','Kaushik');

Select * from personal_info where age between 20 AND 30;

Select Max(age) as 'Maximum age' from personal_info;

Select count(id) as 'total emp' from personal_info; 

create view persons As Select name,age,phn from personal_info;

Create table department(
emp_id int not null,
dept Varchar(20),
address Varchar(20),
exp int,
constraint fk_emp foreign key(emp_id) references personal_info(id)
);

insert into department values('1','Development','India',5);
insert into department values('2','Analyst','India',9);
insert into department values('4','Development','Japan',5);
insert into department values('5','HR','America',5);

/*joins*/

Select personal_info.name,personal_info.age,department.dept,department.address
From personal_info INNER JOIN department ON personal_info.id=department.emp_id;

Select personal_info.name,personal_info.age,department.dept,department.address
From personal_info LEFT JOIN department ON personal_info.id=department.emp_id;

Select personal_info.name,personal_info.age,department.dept,department.address
From personal_info RIGHT JOIN department ON personal_info.id=department.emp_id;

Select * From personal_info cross JOIN department;

Select id from personal_info UNION Select emp_id from department; 



