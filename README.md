🛒 API Spring Boot - Sistema de Vendas
API REST simples para gerenciamento de produtos de vendas desenvolvida com Spring Boot.
🚀 Como Executar
Pré-requisitos

Java 17+
Maven
IDE (IntelliJ, Eclipse ou VS Code)

1. Acesse a API
   
  http://localhost:8080

2. CRIAR PRODUTO

POST localhost:8080/produtos/criar
Content-Type: application/json

{
    "produto": "Nome do Produto",
    "valor": 99.99
}

(Valores em branco resultara em erro)

3. Listar Produto

GET localhost:8080/produtos/listar


4. Listar Produto por ID

GET localhost:8080/produtos/listar/id

5. Deletar Produto
   
DELETE localhost:8080/produtos/deletar/{id}
    
🧪 Testando
Use ferramentas como Postman, Insomnia ou cURL para testar os endpoints.


🛠️ Tecnologias

Spring Boot
Spring Web
Lombok
Maven
