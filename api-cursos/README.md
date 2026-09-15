# APi-Cursos

## Fluxo Cliente-Sevidor

```
O Front-end (cliente) faz a requisição dos dados por meio dos
 Endpoints -> A API-Cursos recebe ess requisição (Request HTTP) -> 
 Processa o que foi pedido (Servidor) -> acessa o Banco de dados -> e 
 retorna com os dados pedidos faz e faz o processamento (Servidor)-> 
 Retorna a informação por meio dos endpoints no formato JSON 
 (Response HTTP)-> O Front-end interpreta e entrega na telado usuário 
 (Cliente).
```

## Responsabilidades do Back-end

1. Receber os dados enviados pelo Cliente no formato JSON

2. Transformar esses dados em um objeto java

3. Verificar se estão corretos de acordo com as regras do Curso

4. Salvar os dados no banco de dados

5. Processar as requisições do Cliente

6. Verificar a existência dos dados

7. Organizar as Respostas no formato JSON

8. Esconder e proteger informações sensíveis

9. Retornar o que foi Requisitado pelo Cliente

## Contrato inicial da API

| Metodo HTTP | Endpoint     | Operação      | Resultado Esperado              |
| ----------- | ------------ | ------------- | ------------------------------- |
| GET         | /cursos      | listar()      | 200 OK                          |
| GET         | /cursos/{id} | buscarPorId() | 200 OK ou 404 Not Found         |
| POST        | /cursos      | cadastrar()   | 201 Created                     |
| PUT         | /cursos/{id} | atualizar()   | 200 OK ou 404 Not Found         |
| DELETE      | /cursos/{id} | remover()     | 204 No Content ou 404 Not Found |

#### Exemplo de JSON para cadastro:

```
{
    "nome": "Back-End Frameworks",
    "cargaHoraria": 60
}
```

## Estrutura e configuração do projeto

pom.xml - Gerencia as dependências, Controle de Versões, Configuração e Build

src/main/java - Onde fica todo o código da Aplicação

src/main/resources - Configurações do projeto

classe com @SpringBootApplication - Indica a classe principal da aplicação



## Execução do projeto

#### Subir container do PostgreSQL

```
docker compose up -d
```

#### Acessar o Banco diretamente (Opcional)

``` 
docker exec -it postgres-api-cursos psql -U victor -d cursos_db
```

#### Executar o projeto no Intellij

#### Acessar pelo postman para testes
