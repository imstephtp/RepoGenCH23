-- Selecciona todo de una tabla
SELECT * FROM `users`;	

-- Seleccionar solo una comuna
SELECT `first_name` FROM `users`;

-- Insertar datos a tabla pets
INSERT INTO `pets`
(first_name, fav_food, `type`, users_idusers)
VALUES
('Griselo', 'Fresas', 'Nejo', 1),
('Nicky', 'Caldito con torillitas', 'Doggo', 2),
('Peperoni', 'Huesitos de manzanas', 'Doggo', 3),
('Pepe', 'Semillas de girasol', 'Cotorro', 3);

-- seleccionar toto de pets
SELECT * FROM `pets`;

-- Filtrar por FK para identificar a owners
SELECT * FROM `pets` 
WHERE users_idusers = 3;

-- Buscar repetidos en una columna 
SELECT first_name FROM pets
GROUP BY first_name
HAVING COUNT(*)>1;

INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
('Stephany', 'Trujillo', 'Enchiladas verdes'),
('Alex', 'De Meón', 'Pollo'),
('Diana', 'Barretucha', 'Hamburguesas'),
('Yael', 'Gonzalez', 'Mole verde'),
('Enrique', 'Albarran', 'Milanesa');

INSERT INTO `pets`
(first_name, fav_food, `type`, users_idusers)
VALUES
('Cactus', 'Sol y agua', 'Cactus', 5),
('Chimuelo', 'Gatitos', 'Dragon', 6),
('Benito', 'Huesos', 'Doggo', 4),
('Molly', 'Galletas', 'Doggo', 7),
('Pantera', 'Higado de pollo', 'Doggo', 8);