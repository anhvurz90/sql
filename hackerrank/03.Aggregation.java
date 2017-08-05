01.Revising Aggregations - The Count Function:
  select count(*) from city where population > 100000;
02.Revising Aggregations - The Sum Function:
  select sum(population) from city where district = 'California';
03.Revising Aggregations - Averages:
  select avg(population) from city where district = 'California';
04.Average Population:
  select floor(avg(population)) from city;
05.Japan Population:
  select sum(population) from city where countrycode='JPN';
06.Population Density Difference:
  select (max(population) - min(population)) from city;
07.The Blunder:
  select ceil(avg(salary) - avg(replace(salary, '0', ''))) from employees;
08.Top Earners:
  select months * salary as e, count(*) from employee
    group by e	  order by e desc	limit 1;
09.Weather Observation station 2:
  select round(sum(lat_n), 2), round(sum(long_w), 2) from station;
10.Weather Observation station 13:
  select truncate(sum(lat_n), 4) from station 
	where lat_n > 38.788 and lat_n < 137.2345;
