# CRUD de Vendedores e Departamentos com Java

Sistema em Java com estrutura de camadas que realiza operações CRUD (Create, Read, Update, Delete) para vendedores e departamentos, utilizando JDBC puro para acesso ao banco de dados.  
Este projeto foi desenvolvido como parte do curso **"Java Completo - Programação Orientada a Objetos + Projetos"** ministrado por Nelio Alves.

### Tecnologias Utilizadas:
- [x] Linguagem: Java
- [x] JDBC (Java Database Connectivity)
- [x] SQL (MySQL ou outro relacional)
- [x] Programação Orientada a Objetos
- [x] Padrão DAO (Data Access Object)
- [x] Boas práticas de encapsulamento e separação de responsabilidades

### Funcionalidades:
- Cadastro de vendedores e departamentos
- Listagem e busca por ID
- Atualização de dados
- Exclusão de registros
- Integração com banco de dados via JDBC
- Estrutura em camadas:
  - **Entidades**: `Seller`, `Department`
  - **Interfaces DAO**: `SellerDao`, `DepartmentDao`
  - **Implementações JDBC**: `SellerDaoJDBC`, `DepartmentDaoJDBC`
  - **Fábrica de DAOs**: `DaoFactory`

### Como executar este projeto:
1. Clone este repositório:
```bash
git clone https://github.com/eduardafbz/demo-dao-jdbc.git
```

2. Configure o banco de dados:
- Crie o banco e as tabelas necessárias.
- Atualize as credenciais de conexão no código (host, usuário, senha, etc.).

3. Compile:
```bash
javac application/Program.java
```

4. Execute:
```bash
java application.Program
```

### Objetivo:
Este projeto foi criado com fins educacionais para praticar:
- Integração Java + Banco de Dados com JDBC
- Abstração de acesso a dados usando interfaces
- Manipulação de dados via SQL
- Estruturação de projeto com múltiplas camadas

### Autora:
@eduardafbz
