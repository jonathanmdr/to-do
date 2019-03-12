# To-do List
CRUD desenvolvido em Java utilizando Swing com JPA implementação Hibernate e banco de dados MySQL.

[![node](https://img.shields.io/badge/Java-1.8.0-lightgray.svg)](https://www.java.com/pt_BR/download/)
[![node](https://img.shields.io/badge/Maven-3.5.4-steelblue.svg)](https://maven.apache.org/download.cgi)
[![node](https://img.shields.io/badge/Plugin-Lombok_1.18.6-indianRed.svg)](https://projectlombok.org/)
[![node](https://img.shields.io/badge/Database-MySQL--5.1.46-blue.svg)](https://www.mysql.com/downloads/)
[![node](https://img.shields.io/badge/Hibernate-5.4.1--Final-peru.svg)](https://www.mysql.com/downloads/)

## Descrição:
A aplicação toda consiste em duas únicas telas, uma tela de listagem de tarefas, e uma tela para cadastrar e editar tarefas.

### Funcionalidades:
#### Tela Lista to-do:
 - Botão "Novo" para cadastrar novos registros.
 - Botão "Editar" para edição de registros existentes.
 - Botão "Excluir" para exclusão de registros existentes.
 - Botão "Listar" para listagem de registros cadastrados.
 
 ##### Obsersações: 
 A tela atualiza a lista de registros automaticamente para todas as operações e exibe mensagens únicas de confirmação para cada tipo de operação realizada.
 
 #### Tela Cadastro to-do:
 - Botão "Salvar" para salvar um novo registro ou um registro editado.
 - Botão "cancelar" para cancelar a operação de cadastro ou edição.
 
 ##### Observações: 
 A tela possuí validação de campos obrigatórios, não permitindo que um registro seja salvo sem conter as informações obrigatórias, ao tentar salvar um registro com informações faltantes o campo obrigatório ficará marcado com uma borda vermelha e um balão de mensagem informando a obrigatoriedade de preenchimeto do campo em questão.
 
 #### Quais são os dados que uma tarefa possuí?
 - ID<strong>*</strong> (Gerado automaticamente para cada nova tarefa criada)
 - Título<strong>*</strong>
 - Status<strong>*</strong> (Concluído/Não Concluído)
 - Descrição
 - Data Criação (Gerada automaticamente ao incluir um novo registro)
 - Data Edição (Gerada automaticamente ao editar um registro existente)
 - Data Conclusão (Gerada automaticamente ao marcar a tarefa como concluída)

 #### Quais campos são de preenchimento obrigatório?
 Os campos obrigatórios estão marcados com um <strong>*</strong>. 

 # Configurações 
 ### Configuração do Schema da base de dados MySQL:
 
 Criando o Schema: </br>

    CREATE SCHEMA todo;
    
 Habilitando o uso do SCHEMA criado anteriormente: </br>
    
    USE todo;
    
 Criando a tabela de to-do's: </br>
 
    CREATE TABLE todo(
      id BIGINT PRIMARY KEY AUTO_INCREMENT,
      titulo VARCHAR(100) NOT NULL,
      status BOOLEAN NOT NULL,
      descricao VARCHAR(300),
      data_criacao DATE,
      data_edicao DATE,
      data_conclusao DATE
    );
    
    
 Com a base de dados devidamente criada e configurada, basta iniciar a aplicação e utizá-la a vontade   =)    
