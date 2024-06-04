CREATE TABLE dados_pragas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pais VARCHAR(255),
    tipo_praga VARCHAR(255),
    area_afetada FLOAT,
    numero_ocorrencias INT,
    impacto_producao VARCHAR(255),
    medidas_controle VARCHAR(255),
    custo_controle FLOAT,
    ano VARCHAR(255)
);

drop table dados_pragas;

CREATE TABLE zonas_ajudadas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pais VARCHAR(255),
    zona VARCHAR(255),
    tipo_ajuda VARCHAR(255),
    ano VARCHAR(255)
);

select * from zonas_ajudadas;

select * from dados_pragas;