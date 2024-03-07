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
| 404    | Endpoint não reconhecido, não validavel o endpoint |
| 408    | Erro de status do server                           |

---

## Cacadastrar Categoria

`Post`/categoria

Cria uma nova categoria com os dados enviados no corpo da requisição

## Códigos de Status

| Campo | tipo   | obrigatório | Descrição                                                  |
| ----- | ------ | :---------: | ---------------------------------------------------------- |
| nome  | String |    Sim✅    | um nome curto para a categoria                             |
| icone | String |    não❌    | um nome do ícone de acordo com a biblioteca Material Icons |

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
| 201    | Categoria cadastrada com sucesso                   |
| 404    | Endpoint não reconhecido, não validavel o endpoint |
| 408    | Erro de status do server                           |
---
