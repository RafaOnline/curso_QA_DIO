# 🧠 Criando o `usersController.js` (Controller de Usuários)

Nesta etapa, vamos separar a lógica das rotas em um **controller**, deixando o código mais organizado e escalável.

---

## 📁 Nova estrutura do projeto

```bash id="0wzmxg"
📁 projeto
 ┣ 📁 src
 ┃ ┣ 📄 index.js
 ┃ ┣ 📄 routes.js
 ┃ ┣ 📄 database.js
 ┃ ┗ 📁 controllers
 ┃    ┗ 📄 usersController.js
 ┣ 📄 package.json
```

---

## 💡 O que é um Controller?

Um **controller** é responsável por:

* Receber a requisição (`request`)
* Processar a lógica
* Retornar a resposta (`response`)

👉 Ou seja: ele tira a lógica de dentro das rotas.

---

## 📄 `usersController.js`

```js id="9u6qdw"
// Importa o "banco de dados" (array simulado)
import { database } from '../database.js';

// Cria um objeto que agrupa as funções relacionadas a usuários
const usersController = {

    // Função responsável por criar um usuário
    criarUsuario(request, response) {

        // Extrai o campo "name" do corpo da requisição
        const { name } = request.body;

        // Validação: impede criação de usuário sem nome
        if (name.length < 1) {
            return response.status(403).json({
                mensagem: 'Não é possível criar usuários sem um nome'
            });
        }

        // Adiciona o usuário no "banco de dados"
        database.push(name);

        // Retorna status 201 (criado com sucesso)
        return response.status(201).json({
            mensagem: `Usuário ${name} criado`
        });
    },

    // Função responsável por listar usuários
    listaUsuario(request, response) {

        // Retorna status 200 com todos os usuários
        return response.status(200).json(database);
    }
};

// Exporta o controller para ser usado nas rotas
export { usersController };
```

---

## 🔗 Como conectar com as rotas

Agora seu `routes.js` fica mais limpo:

```js id="mnqcfy"
import { Router } from 'express';
import { usersController } from './controllers/usersController.js';

const routes = Router();

// Chama o controller ao invés de escrever lógica aqui
routes.get('/users', usersController.listaUsuario);
routes.post('/users', usersController.criarUsuario);

export { routes };
```

---

## 🧠 O que mudou?

### ❌ Antes:

* Lógica dentro das rotas
* Código mais bagunçado conforme cresce

### ✅ Agora:

* Rotas apenas direcionam
* Controller contém a lógica
* Código mais organizado e escalável

---

## ⚠️ Ponto importante (validação)

```js id="d56kbw"
if (name.length < 1)
```

👉 Isso evita criar usuários inválidos.

💡 Em projetos reais, você pode usar bibliotecas como:

* validação de schema (ex: Joi, Zod)

---

## 📊 Status Codes usados

| Código | Significado                |
| ------ | -------------------------- |
| 200    | Sucesso                    |
| 201    | Criado com sucesso         |
| 403    | Proibido (dados inválidos) |

---

## 💡 Dica de melhoria

Evite erro se `name` não existir:

```js id="j3ax1c"
if (!name || name.length < 1)
```

---

## 🚀 Benefícios dessa estrutura

* Melhor organização
* Código reutilizável
* Mais fácil de testar
* Padrão usado no mercado

---

## 🔥 Próximo nível

Você pode evoluir para:

* 📁 `services` (regras de negócio)
* 📁 `middlewares` (validações)
* 📁 `models` (banco de dados real)

---

Agora você já está estruturando como um projeto profissional 👨‍💻
