create table usuario(
	id_uniao serial not null primary key,
	nome_usuario varchar(20) not null unique,
	password varchar(50) not null
);

create table skill(
	id_skill serial not null primary key,
	nome_skill varchar(50) not null
);

create table usuario_skill(
	id_user_skill serial not null primary key,
	usuario_id int references usuario(id_usuario),
	skill_id int references skill(id_skill)
);