# 💈 Sistema de Agendamento - Barbearia VIP

> Projeto prático desenvolvido por um estudante de tecnologia para aplicar conceitos de Java e Spring Boot.

![Badge Concluído](http://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge)
![Badge Java](http://img.shields.io/static/v1?label=JAVA&message=17&color=blue&style=for-the-badge)
![Badge Estudante](http://img.shields.io/static/v1?label=PERFIL&message=ESTUDANTE&color=orange&style=for-the-badge)

## 💻 Sobre o Projeto

Este sistema é uma aplicação Web completa (Fullstack) para gerenciamento de agendamentos de uma barbearia. O projeto foi criado como parte da minha rotina de estudos para vaga de estágio, focando em resolver problemas reais utilizando o padrão de arquitetura **MVC (Model-View-Controller)**.

O objetivo principal foi demonstrar domínio sobre a construção de um **CRUD Completo** (Create, Read, Update, Delete) e a integração entre Back-end e Banco de Dados.

---

## ⚙️ Funcionalidades

* **📝 Agendar Corte:** Cadastro de novos clientes com nome, telefone, data e horário específico.
* **📋 Listagem Inteligente:** Visualização de todos os horários marcados em uma tabela organizada.
* **✏️ Edição de Agendamento:** Permite alterar o horário ou dados do cliente caso haja erros ou remarcações.
* **🗑️ Cancelamento:** Exclusão de agendamentos do sistema.
* **🎨 Interface Amigável:** Front-end estilizado com CSS moderno, cards e feedback visual.

---

## 🚀 Tecnologias Utilizadas

* **Back-end:**
    * Java 17
    * Spring Boot 3
    * Spring Data JPA (Hibernate)
    * PostgreSQL (Banco de Dados)
* **Front-end:**
    * Thymeleaf (Template Engine)
    * HTML5 & CSS3 (Estilização Customizada)
* **Ferramentas:**
    * Maven (Gerenciamento de Dependências)
    * IntelliJ IDEA (IDE)


## 🔧 Como rodar o projeto localmente

### Pré-requisitos
* Java JDK 17+ instalado.
* PostgreSQL instalado e rodando.
* Maven instalado.

### Passo a Passo

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/SEU-USUARIO/sistema-barbearia.git](https://github.com/SEU-USUARIO/sistema-barbearia.git)
    ```

2.  **Configure o Banco de Dados:**
    Abra o arquivo `src/main/resources/application.properties` e configure suas credenciais:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/db_barbearia
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    ```

3.  **Execute o projeto:**
    Na sua IDE, execute a classe principal `SistemaBarbeariaApplication.java`.

4.  **Acesse no navegador:**
    Abra o link: `http://localhost:8080/agendamento`

---

## 📂 Estrutura do Projeto

O código segue a arquitetura em camadas, demonstrando boas práticas de organização:

* `controller`: Camada que recebe as requisições Web.
* `service`: Camada de regras de negócio.
* `repository`: Camada de acesso ao banco de dados.
* `model`: Entidades (Tabelas do banco).
* `templates`: Arquivos HTML com Thymeleaf.

---

## 👨‍💻 Autor

Desenvolvido por Pedro Augusto, estudante de Análise e Desenvolvimento de Sistemas.
Este projeto reforça meu compromisso com o aprendizado contínuo e a busca por oportunidades de estágio na área de desenvolvimento Java.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/pedro-augusto-dev-ti/)
