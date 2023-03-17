USE business; 

	SELECT * FROM employee
    ORDER BY last_name ASC;

-- MIN
SELECT MIN (salary) FROM employee; 
SELECT MAX (last_name) FROM employee;

-- MAX
SELECT MAX (salary) FROM employee; 

-- AVG
SELECT AVG (salary) FROM employee;
SELECT AVG (salary) AS promedio FROM employee;

-- SUM
SELECT SUM(employee_id) FROM employee;
SELECT SUM (salary), AVG(salary) FROM employee;

-- COUNT 
SELECT COUNT(employee_id) from employee;
SELECT COUNT(salary) FROM employee;
SELECT COUNT(DISTINCT(salary)) FROM employee;