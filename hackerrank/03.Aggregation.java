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

