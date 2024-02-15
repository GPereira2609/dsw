CREATE TABLE processos (
    dataInicio DATE NOT NULL,
    cpfCliente VARCHAR(14) NOT NULL,
    tipoProcesso VARCHAR(255) NOT NULL,
    dataFim DATE,
    status VARCHAR(12) DEFAULT 'INICIADO',
    PRIMARY KEY(dataInicio, cpfCliente, tipoProcesso),
    FOREIGN KEY(cpfCliente) REFERENCES clientes(cpf) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY(tipoProcesso) REFERENCES tipo_processo(nome) ON DELETE CASCADE ON UPDATE CASCADE
);