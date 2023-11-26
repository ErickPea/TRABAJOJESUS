DROP DATABASE IF EXISTS Colegio;
CREATE DATABASE Colegio;
USE Colegio;
CREATE TABLE Matricula(
   id INT PRIMARY KEY AUTO_INCREMENT,
    materia_id INT NOT NULL,
    estudiante_id VARCHAR(40) NOT NULL,
    nombre_materia VARCHAR(30) NOT NULL,
   
   
    FOREIGN KEY (materia_id) REFERENCES Materia(id),
    FOREIGN KEY (estudiante_id) REFERENCES TopEstudiante(nombre_estudiante)
    

);
/*La restricción NOT NULL en SQL se utiliza para
 asegurar que un campo (columna) de una tabla
 siempre contenga un valor, es decir, no permitirá que 
 ese campo tenga un valor nulo (NULL).
 A continuación, se destacan sus principales propósitos*/


CREATE TABLE NotaPeriodo(
id  INT PRIMARY KEY AUTO_INCREMENT,
materia_id int not null,
nombre_materia varchar (30) not null,

2020A varchar(10)not null,
2020B varchar(10)not null,
2021A varchar(10)not null,
2021B varchar(10)not null,
2022A varchar(10)not null,
2022B varchar(10)not null,




foreign key (nombre_materia)references Materia(nombre)



);

CREATE TABLE Materia (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(30) NOT NULL
);



CREATE TABLE NotaPeriodoNull(

    id INT PRIMARY KEY AUTO_INCREMENT,
    materia_id INT NOT NULL,
     nombre_materia varchar (30) not null,
   2020A varchar(10)not null,
2020B varchar(10)not null,
2021A varchar(10)not null,
2021B varchar(10)not null,
2022A varchar(10)not null,
2022B varchar(10)not null,
   
foreign key (nombre_materia)references Materia(nombre),
    FOREIGN KEY (materia_id) REFERENCES Materia(id)
  


); 
CREATE TABLE NotaPeriodoVacio(
 id INT PRIMARY KEY AUTO_INCREMENT,
    materia_id INT NOT NULL,
    nombre_materia varchar (50) not null,
2020A varchar(10)not null,
2020B varchar(10)not null,
2021A varchar(10)not null,
2021B varchar(10)not null,
2022A varchar(10)not null,
2022B varchar(10)not null,
    foreign key (nombre_materia)references Materia(nombre),
    FOREIGN KEY (materia_id) REFERENCES Materia(id)
 
); 
CREATE TABLE PromedioPeriodo(
 id INT PRIMARY KEY AUTO_INCREMENT,
 materia_id INT NOT NULL,
    materia_nombre varchar(60) NOT NULL,
2020A varchar(10)not null,
2020B varchar(10)not null,
2021A varchar(10)not null,
2021B varchar(10)not null,
2022A varchar(10)not null,
2022B varchar(10)not null,
   
   
    
foreign key (materia_id)references Materia(id)
     );

CREATE TABLE TopEstudiante(
 id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_estudiante varchar(30) NOT NULL,
    nota DECIMAL(5, 2) NOT NULL,
    periodo varchar(10) NOT NULL
 
);


-- Insertar matricula

INSERT INTO Matricula(id, materia_id,nombre_materia,nombre_estudiante, estudiante_id) VALUES


(1, 1, '1 - Estructuración de Bases de Datos Relacionales', 'Isabella Torres', 933),
(2, 2, '2 - Introducción a la Programación', 'Alejandro López', 881),
(3, 3, '3 - Álgebra Lineal', 'Sofía Ramírez', 343),
(4, 4, '4 - Historia del Arte', 'María Sánchez', 130),
(5, 5, '5 - Programación en Python', 'María Pérez', 688),
(6, 6, '6 - Redes de Computadoras', 'Carlos González', 903),
(7, 7, '7 - Fundamentos de Inteligencia Artificial', 'Alejandro Pérez', 431),
(8, 8, '8 - Desarrollo Web', 'Camila Ramírez', 501),
(9, 9, '9 - Estadísticas y Probabilidades', 'Camila Rodríguez', 813),
(10, 1, '1 - Estructuración de Bases de Datos Relacionales', 'Valentina Rodríguez', 162),
(11, 10, '10 - Lengua y Literatura', 'Juan Martínez', 247),
(12, 11, '11 - Cálculo Diferencial', 'Camila Hernández', 124),
(13, 12, '12 - Física General', 'Juan González', 499),
(14, 13, '13 - Química Orgánica', 'Diego González', 343),
(15, 14, '14 - Psicología General', 'Valentina González', 776),
(16, 1, '1 - Estructuración de Bases de Datos Relacionales', 'Valentina Pérez', 444),
(17, 15, '15 - Historia Universal', 'Isabella Martínez', 971),
(18, 16, '16 - Anatomía Humana', 'Diego Hernández', 163),
(19, 1, '1 - Estructuración de Bases de Datos Relacionales', 'Miguel Ramírez', 906),
(20, 15, '15 - Historia Universal', 'Alejandro Ramírez', 241),
(21, 2, '2 - Introducción a la Programación', 'Isabella López', 632),
(22, 17, '17 - Economía Básica', 'Valentina Sánchez', 414),
(23, 14, '14 - Psicología General', 'Isabella Rodríguez', 875),
(24, 18, '18 - Filosofía Contemporánea', 'Isabella González', 264),
(25, 1, '1 - Estructuración de Bases de Datos Relacionales', 'Sofía Pérez', 424),
(26, 9, '9 - Estadísticas y Probabilidades', 'Miguel Rodríguez', 724),
(27, 1, '1 - Estructuración de Bases de Datos Relacionales', 'Diego Pérez', 677),
(28, 17, '17 - Economía Básica', 'Diego González', 261),
(29, 11, '11 - Cálculo Diferencial', 'Diego Hernández', 351),
(30, 5, '5 - Programación en Python', 'Valentina González', 380),
(31, 12, '12 - Física General', 'Valentina Pérez', 870),
(32, 2, '2 - Introducción a la Programación', 'Juan Martínez', 16),
(33, 7, '7 - Fundamentos de Inteligencia Artificial', 'Valentina González', 551),
(34, 8, '8 - Desarrollo Web', 'Valentina Pérez', 449),
(35, 1, '1 - Estructuración de Bases de Datos Relacionales', 'Isabella Martínez', 960),
(36, 10, '10 - Lengua y Literatura', 'Diego Hernández', 717),
(37, 11, '11 - Cálculo Diferencial', 'Diego González', 459),
(38, 13, '13 - Química Orgánica', 'Valentina González', 993)
;



-- Insertar NotaPeriodo
INSERT INTO NotaPeriodo(materia,2020A,2020B,2021A,
2021B,2022A,2022B)VALUES
 ('Estructuración de Bases de Datos Relacionales', '2.20', '2.54', '1.14', '2.31', '1.99', '2.81'),
    ('Estructuración de Proyectos de Investigación', '2.19', '0.72', '1.92', '2.71', '2.97', '2.39'),
    ('Programación Móvil', '2.85', '2.22', '2.40', '1.90', '3.72', '0.92'),
    ('Sistemas Distribuidos', '2.60', '3.32', '3.16', '2.44', '2.35', '1.87')
;

-- Insertar NotaPeriodoNull
INSERT INTO NotaPeriodoNull(materia, 2020A, 2020B, 2021A, 2021B, 2022A, 2022B)
VALUES
('Análisis de Algoritmos y Complejidad', 0, 0, 0, 0, 0, 0),
('Arquitectura de Computadoras Modernas', 0, 0, 0, 0, 0, 0),
('Bioinformática y Genómica Computacional', 0, 0, 0, 0, 0, 0),
('Ciberseguridad y Ética Informática', 0, 0, 0, 0, 0, 0),
('Computación en la Nube', 0, 0, 0, 0, 0, 0),
('Computación Gráfica Avanzada', 0, 0, 0, 0, 0, 0),
('Desarrollo de Videojuegos', 0, 0, 0, 0, 0, 0),
('Diseño de Interfaces de Usuario', 0, 0, 0, 0, 0, 0),
('Estructuración de Bases de Datos Relacionales', 0, '2.54', '1.14', '2.31', '1.99', '2.81'),
('Estructuración de Proyectos de Investigación', 0, '0.72', '1.92', '2.71', '2.97', '2.39'),
('Gestión de Proyectos Tecnológicos', 0, 0, 0, 0, 0, 0),
('Ingeniería de Software Avanzada', 0, 0, 0, 0, 0, 0),
('Inteligencia Artificial para la Toma de Decisiones', 0, 0, 0, 0, 0, 0),
('Internet de las Cosas (IoT)', 0, 0, 0, 0, 0, 0),
('Machine Learning y Minería de Datos', 0, 0, 0, 0, 0, 0),
('Programación Móvil', 0, '2.22', '2.40', '1.90', '3.72', '0.92'),
('Programación Orientada a Objetos Avanzada', 0, 0, 0, 0, 0, 0),
('Robótica Avanzada', 0, 0, 0, 0, 0, 0),
('Sistemas Distribuidos', 0, '3.32', '3.16', '2.44', '2.35', '1.87');

Insert into Materia(materia)values
('Estructuración de Bases de Datos Relacionales'),
('Estructuración de Proyectos de Investigación'),
('Programación Móvil'),
('Sistemas Distribuidos'),

('Análisis de Algoritmos y Complejidad'),
('Arquitectura de Computadoras Modernas'),
('Bioinformática y Genómica Computacional'),
('Ciberseguridad y Ética Informática'),
('Computación en la Nube'),
('Computación Gráfica Avanzada'),
('Desarrollo de Videojuegos'),
('Diseño de Interfaces de Usuario'),
('Estructuración de Bases de Datos Relacionales'),
('Estructuración de Proyectos de Investigación'),
('Gestión de Proyectos Tecnológicos'),
('Ingeniería de Software Avanzada'),
('Inteligencia Artificial para la Toma de Decisiones'),
('Internet de las Cosas (IoT)'),
('Machine Learning y Minería de Datos'),
('Programación Móvil'),
('Programación Orientada a Objetos Avanzada'),
('Robótica Avanzada'),
('Sistemas Distribuidos')

;
INSERT INTO NotaPeriodoVacio(materia,2020A,2020B,2021A,
2021B,2022A,2022B)VALUES
 ('Análisis de Algoritmos y Complejidad', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Arquitectura de Computadoras Modernas', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Bioinformática y Genómica Computacional', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Ciberseguridad y Ética Informática', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Computación en la Nube', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Computación Gráfica Avanzada', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Desarrollo de Videojuegos', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Diseño de Interfaces de Usuario', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Estructuración de Bases de Datos Relacionales', 2.20, 2.54, 1.14, 2.31, 1.99, 2.81),
    ('Estructuración de Proyectos de Investigación', 2.19, 0.72, 1.92, 2.71, 2.97, 2.39),
    ('Gestión de Proyectos Tecnológicos', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Ingeniería de Software Avanzada', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Inteligencia Artificial para la Toma de Decisiones', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Internet de las Cosas (IoT)', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Machine Learning y Minería de Datos', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Programación Móvil', 2.85, 2.22, 2.40, 1.90, 3.72, 0.92),
    ('Programación Orientada a Objetos Avanzada', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Robótica Avanzada', 0.00, 0.00, 0.00, 0.00, 0.00, 0.00),
    ('Sistemas Distribuidos', 2.60, 3.32, 3.16, 2.44, 2.35, 1.87)

;  
INSERT INTO PromedioPeriodo(periodo,promedio,materia)VALUES
('2020A', 2.20, 'Estructuración de Bases de Datos Relacionales'),
('2020A', 2.19, 'Estructuración de Proyectos de Investigación'),
('2020A', 2.85, 'Programación Móvil'),
('2020A', 2.60, 'Sistemas Distribuidos'),
('2020B', 2.54, 'Estructuración de Bases de Datos Relacionales'),
('2020B', 0.72, 'Estructuración de Proyectos de Investigación'),
('2020B', 2.22, 'Programación Móvil'),
('2020B', 3.32, 'Sistemas Distribuidos'),
('2021A', 1.14, 'Estructuración de Bases de Datos Relacionales'),
('2021A', 1.92, 'Estructuración de Proyectos de Investigación'),
('2021A', 2.40, 'Programación Móvil'),
('2021A', 3.16, 'Sistemas Distribuidos'),
('2021B', 2.31, 'Estructuración de Bases de Datos Relacionales'),
('2021B', 2.71, 'Estructuración de Proyectos de Investigación'),
('2021B', 1.90, 'Programación Móvil'),
('2021B', 2.44, 'Sistemas Distribuidos'),
('2022A', 1.99, 'Estructuración de Bases de Datos Relacionales'),
('2022A', 2.97, 'Estructuración de Proyectos de Investigación'),
('2022A', 3.72, 'Programación Móvil'),
('2022A', 2.35, 'Sistemas Distribuidos'),
('2022B', 2.81, 'Estructuración de Bases de Datos Relacionales'),
('2022B', 2.39, 'Estructuración de Proyectos de Investigación'),
('2022B', 0.92, 'Programación Móvil'),
('2022B', 1.87, 'Sistemas Distribuidos')

;
INSERT INTO TopEstudiante(nombre_estudiante,nota,periodo)VALUES

('Isabella Torres', 5, '2020A'),
('Isabella Pérez', 4.8, '2020A'),
('María González', 4.8, '2020A'),
('Miguel Martínez', 4.4, '2020A'),
('Juan Ramírez', 4.4, '2020A'),
('Diego Pérez', 4.3, '2020A'),
('María Torres', 3.7, '2020A'),
('Valentina García', 3.4, '2020A'),
('Alejandro Martínez', 3, '2020A'),
('Alejandro Hernández', 3, '2020A'),
('Isabella García', 4.6, '2020B'),
('Isabella Martínez', 4.4, '2020B'),
('Valentina Ramírez', 4.3, '2020B'),
('Valentina Pérez', 4.1, '2020B'),
('Diego López', 4.1, '2020B'),
('Miguel Hernández', 3.8, '2020B'),
('Isabella Martínez', 3.5, '2020B'),
('María Martínez', 3.5, '2020B'),
('Miguel García', 3.4, '2020B'),
('Camila García', 3.3, '2020B'),
('Miguel Ramírez', 4.9, '2021A'),
('Carlos González', 4.9, '2021A'),
('Valentina García', 4.6, '2021A'),
('Camila González', 4.6, '2021A'),
('Isabella Torres', 3.4, '2021A'),
('Miguel García', 3, '2021A'),
('Alejandro López', 3, '2021A'),
('Sofía Ramírez', 2.9, '2021A'),
('María Sánchez', 2.8, '2021A'),
('María Pérez', 2.8, '2021A'),
('Carlos González', 4.6, '2021B'),
('Alejandro Pérez', 4.4, '2021B'),
('Camila Ramírez', 4.4, '2021B'),
('Camila Rodríguez', 4.2, '2021B'),
('Valentina Rodríguez', 4.2, '2021B'),
('Juan Martínez', 4.1, '2021B'),
('Camila Hernández', 4, '2021B'),
('Isabella Pérez', 3.8, '2021B'),
('Isabella Ramírez', 3.4, '2021B'),
('Miguel Hernández', 2.8, '2021B'),
('Carlos Hernández', 4.6, '2022A'),
('María Sánchez', 4.4, '2022A'),
('Camila Pérez', 4.3, '2022A'),
('Diego Torres', 4.3, '2022A'),
('Isabella Ramírez', 4, '2022A'),
('Juan Rodríguez', 4, '2022A'),
('Isabella López', 3.9, '2022A'),
('María Pérez', 3.8, '2022A'),
('Alejandro González', 3.6, '2022A'),
('Valentina Pérez', 3.4, '2022A'),
('Isabella Pérez', 4.8, '2022B'),
('Isabella Ramírez', 4.8, '2022B'),
('Miguel García', 4.6, '2022B'),
('Camila Sánchez', 4.1, '2022B'),
('Sofía Ramírez', 4.1, '2022B'),
('Alejandro Torres', 3.8, '2022B'),
('Isabella López', 3.5, '2022B'),
('Alejandro García', 2.9, '2022B'),
('Diego González', 2.9, '2022B'),
('Diego Hernández', 2.6, '2022B');



-- Consultas
SELECT * FROM NotaPeriodoNull;
SELECT * FROM NotaPeriodo;
SELECT * FROM Matricula;
SELECT * FROM NotaPeriodoVacio;
SELECT * FROM PromedioPeriodo;
SELECT * FROM TopEstudiante;
SELECT 
	CONCAT(e.nombre_estudiante, e.apellido) as estudiante,
	ma.nombre,
	m.nota,
    p.periodo
FROM 

	estudiante e
	INNER JOIN matricula m ON e.id = m.id_estudiante
	INNER JOIN materia ma ON m.id_materia = m.id
INNER JOIN periodo p ON e.id = m.id_estudiante;

