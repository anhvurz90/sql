01.Revising the Select Query I:
	select * from City where countryCode='USA' and population > 100000;
02.Revising the Select Query II:
	select name from city where countryCode='USA' and population > 120000;
03.Select All:
	select * from city;
04.Select By id
	select * from city where id = 1661;
05.Japanese Cities' Attributes:
	select * from city where countrycode='JPN';
06.Japanese Cities' Names:
	select name from city where countrycode='JPN';
07.Weather Observation Station 1:
	select city, state from station;
08.Weather Observation Station 3: (Oracle):
	select unique(city) from station where mod(id, 2) = 0;
09.Weather Observation Station 4: (Oracle):
	select (count(*) - count(unique(city))) from station;
10.Weather Observation Station 5: (Oracle):
	select * from (select s.city, length(s.city) from station s order by length(s.city), s.city) where ROWNUM = 1
	union all select * from (select s.city, length(s.city) from station s order by length(s.city) desc, s.city desc) where ROWNUM = 1;
	
	
	
11.Weather Observation Station 6: (Oracle):
	select unique(city) from station where INSTR('AEIOU', SUBSTRB(city, 1, 1)) > 0;
12.Weather Observation Station 7: (Mysql):
	select distinct(city) from station where right(city, 1) in ('a','e','i','o','u');
13.Weather Observation Station 8: (Mysql):
	select distinct(city) from station where left(city, 1) in ('a','e','i','o','u') and right(city, 1) in ('a','e','i','o','u');
14.Weather Observation Station 9: (Mysql):
	select distinct (city) from station where not (left(city, 1) in ('a','e','i','o','u'));
15.Weather Observation Station 10: (Mysql):
	select distinct (city) from station where not right(city, 1) in ('a','e','i','o','u');
16.Weather Observation Station 11: (Mysql):
	select distinct(city) from station where not left(city, 1) in ('a','e','i','o','u') or not right(city, 1) in ('a','e','i','o','u');
17.Weather Observation Station 12: (Mysql):
	select distinct(city) from station where not (left(city, 1) in ('a','e','i','o','u') or right(city, 1) in ('a','e','i','o','u'));
18.Higher Than 75 Marks: (Mysql):
	select name from students where marks > 75 order by right(name, 3), id;
19.Employee Names:
	select name from employee order by name;
20.Employee Salaries:
	select name from employee where salary > 2000 and months < 10 order by employee_id;
	