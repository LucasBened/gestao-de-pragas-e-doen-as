![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) <br>
![JavaScript](https://img.shields.io/badge/JavaScript-323330?style=for-the-badge&logo=javascript&logoColor=F7DF1E) <br>
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white) <br>
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white) <br>
![MySql](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white) <br>
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white) <br>
![Apache NetBeans](https://img.shields.io/badge/Apache-CA2136?style=for-the-badge&logo=apache&logoColor=white) <br>


# Gestão de Pragas e Doenças

Este projeto é uma aplicação web que visualiza dados de pragas e zonas ajudadas em diferentes países. Ele usa a API do Google Charts para criar gráficos geográficos interativos. Os dados são armazenados em um banco de dados MySQL.

## Tecnologias Utilizadas

- HTML
- CSS
- JavaScript
- Java
- MySQL
- Google Charts API

## Como Rodar o Projeto

1. Clone o repositório para a sua máquina local usando `git clone`.
2. Abra o `dadosgestao.sql` no MYSQL Workbench.
3. Abra o programa `gesta-pragas` onde seja suportado programas feitos em java, neste caso feito no Apache Netbeans.
4. Alimente o banco de dados com as funcionalidades do programa.
5. Use o comando node script.js no terminal para ligar o servidor.
6. Abra o arquivo `index.html` em seu navegador.

## Estrutura do Projeto

O projeto consiste em quatro arquivos principais:

- `gestao-pragas` Programa usado para alimentar o banco de dados (feito no Apache Netbeans):
- `dadosgestao.sql`: Este arquivo contém o script do banco de dados: 
- `index.html`: Este é o arquivo principal que contém a estrutura HTML da página.
- `style.css`: Este arquivo contém todos os estilos CSS usados no projeto.
- `script.js`: Este arquivo contém todo o código JavaScript usado para buscar os dados e criar os gráficos.
- `server.js`: Este é o arquivo do servidor, necessário usar um node script.js para que funcione corretamente.
  
## Funcionalidades

O projeto tem duas funcionalidades principais:

1. **Visualização de Dados de Pragas**: Mostra um gráfico geográfico dos dados de pragas em diferentes países. O gráfico é colorido em tons de vermelho.
2. **Visualização de Zonas Ajudadas**: Mostra um gráfico geográfico das zonas ajudadas em diferentes países. O gráfico é colorido em tons de verde.

## Contribuindo

Contribuições são sempre bem-vindas. Para contribuir, por favor:

1. Faça um fork do repositório.
2. Crie uma nova branch com suas alterações.
3. Faça um pull request.
