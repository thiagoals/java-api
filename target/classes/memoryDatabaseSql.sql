create table curso(
codigoCurso int not null primary key auto_increment,
nome varchar(500) not null
);
create table aluno(
codigoAluno int not null primary key auto_increment,
nome varchar(500) not null,
codigoCurso int not null,
foreign key(codigoCurso) references curso(codigoCurso)
);