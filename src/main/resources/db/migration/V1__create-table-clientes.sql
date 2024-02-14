create table clientes (
    cpf VARCHAR(14) UNIQUE NOT NULL PRIMARY KEY,
    nome VARCHAR NOT NULL,
    email VARCHAR,
    telefone INT
);