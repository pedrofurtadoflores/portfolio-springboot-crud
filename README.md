# Portfolio Spring Boot CRUD

Este é um projeto de portfólio desenvolvido em Java com Spring Boot, demonstrando um CRUD completo para gerenciamento de produtos, com documentação Swagger, testes unitários, e boas práticas de arquitetura.

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Bean Validation (Jakarta)**
- **Lombok**
- **PostgreSQL**
- **Swagger/OpenAPI 3 (springdoc-openapi)**
- **JUnit 5 & Mockito**

---

## Estrutura do Projeto

```
src
├── main
│   ├── java
│   │   └── br.com.pedrofurtadoflores.portfoliospringbootcrud
│   │       ├── controller
│   │       ├── dto
│   │       │   ├── request
│   │       │   └── response
│   │       ├── model
│   │       ├── repository
│   │       └── service
│   └── resources
│       └── application.properties
└── test
    └── java
        └── br.com.pedrofurtadoflores.portfoliospringbootcrud
```

---

## Como Executar Localmente

### Pré-requisitos

- Java 17+
- Maven 3.8+
- PostgreSQL rodando localmente

### Configuração do Banco

No arquivo `application.properties`, configure:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### Rodando o Projeto

```bash
# Limpar e compilar
mvn clean install

# Rodar aplicação
mvn spring-boot:run
```

---

## Testes

```bash
# Executar testes unitários
mvn test
```

---

## Documentação da API

Uma vez que o projeto estiver rodando, acesse:

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

A documentação inclui todos os endpoints com exemplos de payloads, validações e descrições.

---

## Endpoints Exemplares

| Método | Endpoint             | Descrição               |
| ------ | -------------------- | ----------------------- |
| GET    | `/api/products`      | Lista todos os produtos |
| GET    | `/api/products/{id}` | Retorna um produto      |
| POST   | `/api/products`      | Cria um novo produto    |
| PUT    | `/api/products/{id}` | Atualiza um produto     |
| DELETE | `/api/products/{id}` | Remove um produto       |

---

## Autor

**Pedro Furtado**\
Desenvolvedor | Engenharia de Dados | Tecnologia, Dados e Resultado

Desenvolvedor Back-end, entusiasta de inteligência artificial e apaixonado por resolver problemas com tecnologia. Atuei em projetos de desenvolvimento web e sistemas para os setores bancário e empresarial. Busco uma oportunidade onde possa unir competências técnicas e interpessoais, com o objetivo de evoluir como profissional e, futuramente, liderar times de tecnologia com foco em soluções orientadas a dados.

Aberto a oportunidades como desenvolvedor back-end com foco em dados e inteligência artificial (IA).

[LinkedIn](https://www.linkedin.com/in/pedrofurtado-dev/) • [GitHub](https://github.com/pedrofurtadoflores)
