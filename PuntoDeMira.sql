drop database if exists punto_de_mira;
create database if not exists punto_de_mira;

use punto_de_mira;

drop table if exists jugadores;
create table if not exists jugadores 
(
	Id int unsigned auto_increment not null,
    Nombre varchar(50) not null,
    Contrasenha varchar(50) not null,
    primary key (Id),
    unique key Ak_Nombre (Nombre)
) engine innodb;


drop table if exists partidas;
create table if not exists partidas
(
	Id_partida int unsigned auto_increment not null,
	Nombre_jugador varchar(50) not null,
    Aciertos int unsigned not null,
    Fallos int unsigned not null,
    Duracion int not null,
    Fecha date not null,
    Dificultad enum('Estático', 'Dinámico') not null,
    primary key (Id_partida),
    foreign key (Nombre_jugador) references jugadores (Nombre)
		on update cascade
        on delete restrict,
	index fk_nombre (Nombre_jugador)
) engine innodb;

insert into jugadores
values (null,'Invitado',MD5('00000'));



select * from jugadores;
select * from partidas;
