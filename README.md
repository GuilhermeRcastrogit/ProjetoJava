# ProjetoJava
Repositório criado para documentação do projeto de Java advanced
Ver http status code

## TAREFAS

- [ ] CRUD de Categorias
- [ ] CRUD de Movimentações
- [ ] CRUD de Úsuarios
- [ ] Dashboard

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

| Código | Descrição                                                    |
| ------ | ------------------------------------------------------------ |
| 201    | Categoria cadastrada com sucesso                             |
| 400    | Dados enviados são inválido. Verifique o corpo da requisição |
| 401    | Acesso negado. Você deve se autenticar                       |

---

## Detalhes da Categoria

`Get`/categoria/`{id}`

Retornar os detalhes da categoria com `ìd` informado como parâmetro de path(descrição de endpoint).

## Exemplo de Resposta

```js
// requisição para /categoria/1
  {
    "id" : 1,
    "nome": "Alimentação",
    "icone": "Fast-food",
  }

```

## Códigos de Status

| Código | Descrição                                         |
| ------ | ------------------------------------------------- |
| 200    | Os dados da categoria foram retornado com sucesso |
| 401    | Acesso negado. Você deve se autenticar            |
| 404    | Não existe categoria com o `id` informado         |

---

## Apagar categoria

`DELETE`/categora/`{id}`

Apaga a categoria com `id` especificado no parâmetro de path

#### Codigos de Status

| Código | Descrição                                 |
| ------ | ----------------------------------------- |
| 204    | Categoria foi apagada com sucesso         |
| 401    | Acesso negado. Você deve se autenticar    |
| 404    | Não existe categoria com o `id` informado |

---

### atualizar categoria

`PUT`/ categoria / `{id}`

Altera os dados da categoria especificado no `id`, utilizando as informações enviadas no corpo da requisição.

### exemplo da resposta

```js

  {
    "id" : 1,
    "nome": "Alimentação",
    "icone": "Fast-food",
  },

```

## Códigos de Status

| Código | Descrição                                                    |
| ------ | ------------------------------------------------------------ |
| 200    | Categoria foi alterada com sucesso                           |
| 400    | Dados enviados são inválido. Verifique o corpo da requisição |
| 401    | Acesso negado. Você deve se autenticar                       |
| 404    | Não existe categoria com o `id` informado                    |

---
