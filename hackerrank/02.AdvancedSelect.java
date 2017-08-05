01.Type of Triangle:
  select case when a + b <= c or a + c <= b or b + c <= a then 'Not A Triangle'
	when a = b and b = c then 'Equilateral'
	when a = b or a = c or b = c then 'Isosceles'
	else 'Scalene' end from triangles;

02.The PADS:
  select concat(name, '(', left(occupation, 1),')') as tuple from occupations order by tuple;
  select concat('There are a total of ', count(*), ' ',lower(occupation), 's.') from occupations group by occupation order by count(occupation), lower(occupation);


