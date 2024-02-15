create table clientes (
    cpf VARCHAR(14) UNIQUE NOT NULL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    endereco VARCHAR(255),
    telefone INT
);