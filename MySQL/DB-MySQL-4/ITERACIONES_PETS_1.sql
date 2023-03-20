-- USE `business`;

-- Revisar employee
SELECT * FROM employee;

-- ALIAS
SELECT last_name AS 'Apellido' FROM employee;

-- ALIAS
SELECT
	employee_id AS 'ID',
    first_name AS 'Nombre',
    last_name AS 'Apellido',
	department AS 'Departamento'
    FROM employee;
    
    -- Filtrar por nombre
    -- Buscar a Monika
    SELECT * FROM `employee`
    WHERE first_name = 'Monika';
    
    -- Filtrar doble
    SELECT * FROM `employee`
    WHERE salary = 500000 AND first_name = 'Vivek';
    
        -- Filtrar por NOT
    SELECT * FROM `employee`
    WHERE NOT first_name = 'Barrack';
    
    -- Ordenamiento
    
    -- ORDER BY
    SELECT * FROM employee
    ORDER BY department;
    
      -- ORDER BY ASC 
	SELECT * FROM employee
    ORDER BY department ASC;
    
    -- ORDER BY DESC
	SELECT * FROM employee
    ORDER BY department DESC;
    
          -- ORDER BY 2 FILTROS
	SELECT * FROM employee
    ORDER BY department ASC, last_name DESC;
    
    -- GROUP BY
    SELECT * FROM employee
    GROUP BY department;
    
    -- IN
SELECT * FROM employee
WHERE employee_id IN (1, 3, 7, 8, 5);

--  BETWEEN
SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

--  BETWEEN NOT
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- Case sensitive
SELECT * FROM employee
WHERE last_name LIKE BINARY '%A';

-- LIKE ++
SELECT * FROM employee
WHERE join_date LIKE '%02%';

-- UPDATE INFO
UPDATE employee 
	SET salary = 300000
    WHERE employee_id = 5;
    
USE business; 

UPDATE employee 
	SET salary = 200000
    WHERE employee_id = 7;
    
    UPDATE employee 
	SET salary = 500000
    WHERE employee_id = 2;
    
     UPDATE employee 
	SET salary = 500000
    WHERE employee_id = 8;
    
     UPDATE employee 
	SET salary = 500000
    WHERE employee_id = 2;
    
         UPDATE employee 
	SET salary = 300000
    WHERE employee_id = 8;
    
    INSERT INTO employee (first_name, last_name, salary, join_date, department)
VALUES ('Diana', 'Barreto', 800000, '2022-03-17', 'IT'),
    ('Cristina', 'Trujillo', 500000, '2017-09-22', 'Admin'),
    ('Enrique', 'Albarrán', 100000, '2016-09-22', 'IT'),
    ('Yael', 'Gonzalez', 600000, '2016-09-22', 'IT');