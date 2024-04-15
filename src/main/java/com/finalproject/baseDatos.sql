create database cuenta;
use cuenta;

create table datos_cuenta(
correo varchar(100) not null,
contra varchar(100) not null,
primary key(correo)
);

create table datos_personas(
nombre varchar(100),
correo varchar(100),
apellido varchar(100),
cargo varchar(100),
primary key(nombre),
foreign key(correo) references datos_cuenta(correo)
);

insert into datos_cuenta values ('darlyn@gmail.com', 'darlyn'),
('adriel@gmail.com', 'adriel'),
('danna@gmail.com', 'danna');

insert into datos_personas values ('darlyn', 'darlyn@gmail.com', 'olivo', 'cirujano'),
('adriel', 'adriel@gmail.com', 'perez', 'recepcionista'),
('danna', 'danna@gmail.com', 'gonzales', 'enfermera');


select datos_personas.nombre, datos_personas.apellido, datos_personas.cargo, datos_cuenta.correo, datos_cuenta.contra
from datos_personas
inner join datos_cuenta on datos_personas.correo = datos_cuenta.correo;


create table pacientess(
cedula varchar(100) not null,
nombre varchar(100),
apellido varchar(100),
estado varchar(100),
primary key(cedula)
);

alter table pacientess add column habitacion varchar(100);

insert into pacientess values('402-4863523-7','jose','perez','EMERGENCIA', '4-4D');

SELECT * FROM pacientess;

insert into pacientes(habitacion) values ('4-4D');


select * from pacientes;