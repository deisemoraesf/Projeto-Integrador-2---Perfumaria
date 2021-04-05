create database pi2perfumaria;

use pi2perfumaria;

CREATE TABLE cliente (
id INT auto_increment primary key,
nome VARCHAR (255),
cpf FLOAT UNIQUE,
endereco VARCHAR(255),
telefone FLOAT,
email VARCHAR(255), 
sexo VARCHAR(50), 
estado_civil VARCHAR (50), 
data_nascimento DATE
);

