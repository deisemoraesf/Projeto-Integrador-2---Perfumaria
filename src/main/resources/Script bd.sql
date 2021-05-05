create database pi2perfumaria;

use pi2perfumaria;

CREATE TABLE cliente (
id INT auto_increment primary key,
nome VARCHAR (255),
cpf VARCHAR (255)UNIQUE,
endereco VARCHAR(255),
telefone VARCHAR (255),
email VARCHAR(255), 
sexo VARCHAR(50), 
estado_civil VARCHAR (50), 
data_nascimento DATE
);

CREATE TABLE produto(
id INT auto_increment primary key,
codigo INT,
nome VARCHAR (255),
preco DOUBLE,
categoria VARCHAR (255),
marca VARCHAR (255),
quantidade INT 
);

