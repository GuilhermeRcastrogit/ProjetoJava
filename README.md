# ProjetoJava

Repositório criado para documentação do projeto de Java advanced
Ver http status code

## TAREFAS

- [ ] CRUD de Categorias

## Documentação da API

## Listar todas as categorias

`GET` /categoria

Retonar um array com todas as categorias cadastradas.

## Exemplo de Resposta

```js
[
  {
    id: 1,
    nome: "Marca do carro",
    icone: "icone-carro",
  },
];
```

## Códigos de Status

| Código | Descrição                                          |
| ------ | -------------------------------------------------- |
| 200    | Os dados da categorias foram retornado com sucesso |
| 401    | Acesso negado. Você deve se autenticar             |
| 408    | Erro de status do server                           |

---

`GET`/categoria/`{id}`

Retornar dados da categoria com o id informado como parâmetro de path.

Exemplo de resposta
```
{
    "id": 1,
    "nome": "Alimentação",
    "icone": "fast-food"
}
```

## Cacadastrar Categoria

`Post`/categoria

Cria uma nova categoria com os dados enviados no corpo da requisição

## Códigos de Status

| Campo | tipo   | obrigatório | Descrição                                                  |
| ----- | ------ | :---------: | ---------------------------------------------------------- |
| nome Carro  | String |    Sim✅    | um nome curto para a categoria                             |
| icone Carro | String |    não❌    | um nome do ícone de acordo com a biblioteca Material Icons |

---

```js

  {
    "id" : 1,
    "nome": "marca do carro",
    "icone": "icone-carro",
  },

```

| Código | Descrição                                          |
| ------ | -------------------------------------------------- |
| 204    | Categoria foi apagada com sucesso                  |
| 400    | Dados enviados são inválidos. Verifique o corpo da requisição|
| 401    | Acesso negado. Você deve se autenticar             |
| 404    | Endpoint não reconhecido, não validavel o endpoint |
| 408    | Erro de status do server                           |

---

`PUT` /categoria/ `{id}`

Atualiza uma das categorias com o `{id}` do carro.

## Exemplo de Resposta

```js
[
  {
    id: 1,
    nome: "Marca do carro",
    icone: "icone-carro",
  },
];
```

## Códigos de Status

| Código | Descrição                                          |
| ------ | -------------------------------------------------- |
| 200    | Os dados da categorias foram enviados com sucesso  |
| 404    | Endpoint não reconhecido, não validavel o endpoint |
| 408    | Erro de status do server                           |

---

`DELETE` /categoria/ `{id}`

Deleta uma das categorias com o `{id}` do carro.


## Códigos de Status

| Código | Descrição                                          |
| ------ | -------------------------------------------------- |
| 204    | Categoria foi apagada com sucesso                  |
| 401    | Acesso negado. Você deve se autenticar             |
| 404    | Endpoint não reconhecido, não validavel o endpoint |
| 408    | Erro de status do server                           |

---
