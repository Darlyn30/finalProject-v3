create database gestion_hospital;
use gestion_hospital;

create table datos_cuenta(
correo varchar(100) primary key,
contra varchar(100)
);

insert into datos_cuenta values ('darlyn@gmail.com', 'darlyn'),
('adriel@gmail.com', 'adriel'),
('danna@gmail.com', 'danna');

select * from datos_cuenta;

create table datos_persona(
id int auto_increment primary key,
nombre varchar(100),
apellido varchar(100),
correo varchar(100),
cargo varchar(100),
foreign key(correo) references datos_cuenta(correo)
);

select nombre from datos_persona
where correo = 'darlyn@gmail.com';

insert into datos_persona(nombre, apellido, correo, cargo) values ('darlyn', 'olivo', 'darlyn@gmail.com', 'cirujano'),
('adriel', 'perez', 'adriel@gmail.com', 'recepcionista'),
('danna', 'gonzales', 'danna@gmail.com', 'enfermera');

select * from datos_persona;

create table pacientes(
cedula varchar(100) not null,
nombre varchar(100),
apellido varchar(100),
estado varchar(100),
primary key(cedula)
);

insert into pacientes values ('001-12321233-4', 'jose', 'perez', 'consulta');

select * from pacientes;

create table medicamentoss(
id int primary key,
nombre_producto varchar(100),
descripcion varchar(500),
cantidad int,
precio decimal(10,2),
proveedor varchar(100),
ubicacion varchar(100)
);

INSERT INTO medicamentoss VALUES (001, 'Ibuprofeno', 'Analgésico y antiinflamatorio no esteroideo. Alivia el dolor y reduce la inflamación.', 50, 10.99, 'Farmacia Santa Lucía', 'Pasillo 3, estante superior'),
(002, 'Paracetamol', 'Analgésico y antipirético comúnmente usado para reducir el dolor y la fiebre.', 100, 5.49, 'Farmacias Similares', 'Pasillo 2, estante medio'),
(003, 'Naproxeno', 'Analgésico y antiinflamatorio similar al ibuprofeno, pero de mayor duración.', 30, 8.75, 'Farmacias del Ahorro', 'Pasillo 1, estante inferior'),
(004, 'Tramadol', 'Analgésico opioide utilizado para el tratamiento del dolor moderado a severo.', 20, 15.25, 'Farmacia San Pablo', 'Pasillo 4, estante superior'),
(005, 'Ketorolaco', 'Analgésico no esteroideo usado principalmente para el alivio a corto plazo del dolor moderado a severo.', 25, 12.99, 'Farmacia Guadalajara', 'Pasillo 3, estante inferior');


-- Inserciones para medicamentos antibióticos
INSERT INTO medicamentoss VALUES (101, 'Amoxicilina', 'Antibiótico de amplio espectro usado para tratar infecciones bacterianas.', 30, 7.99, 'Farmacias del Ahorro', 'Pasillo 5, estante superior'),
(102, 'Azitromicina', 'Antibiótico macrólido utilizado para tratar infecciones bacterianas como neumonía y enfermedades de transmisión sexual.', 10, 18.49, 'Farmacias Similares', 'Pasillo 6, estante medio'),
(103, 'Ciprofloxacino', 'Antibiótico de amplio espectro utilizado para tratar una variedad de infecciones bacterianas.', 20, 11.75, 'Farmacia San Pablo', 'Pasillo 7, estante inferior'),
(104, 'Clindamicina', 'Antibiótico utilizado para tratar infecciones graves causadas por bacterias anaerobias y ciertas bacterias grampositivas.', 15, 23.99, 'Farmacia Guadalajara', 'Pasillo 8, estante superior'),
(105, 'Metronidazol', 'Antibiótico y antiprotozoario utilizado para tratar infecciones bacterianas y parasitarias.', 25, 9.99, 'Farmacia Santa Lucía', 'Pasillo 9, estante medio');

select * from medicamentoss;