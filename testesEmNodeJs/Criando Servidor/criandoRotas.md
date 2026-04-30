# 🚀 Servidor Node.js com Express (Documentado com Comentários)

Este guia mostra como criar um servidor Node.js com rotas organizadas, usando comentários no código para explicar cada parte.

---

## 📁 Estrutura do projeto

```bash
📁 projeto
 ┣ 📁 src
 ┃ ┣ 📄 index.js
 ┃ ┗ 📄 routes.js
 ┣ 📄 package.json
 ┗ 📄 node_modules
```

---

## 📄 `index.js` (Servidor principal)

```js
// Importa o framework Express
import express from 'express';

// Importa as rotas criadas no arquivo routes.js
import { routes } from './routes.js';

// Cria a aplicação (servidor)
const server = express();

// Permite que o servidor entenda JSON no corpo das requisições
// Exemplo: { "name": "Rodrigo" }
server.use(express.json());

// Diz para o servidor usar as rotas definidas
server.use(routes);

// Inicia o servidor na porta 5000
// O callback será executado quando o servidor estiver rodando
server.listen(5000, () => {
  console.log('Servidor on na porta 5000');
});
```

---

## 📄 `routes.js` (Definição das rotas)

```js
// Importa o Router do Express para criar rotas separadas
import { Router } from 'express';

// Cria uma instância de rotas
const routes = Router();

// Simula um banco de dados em memória (array)
const database = ['Rafa'];

/*
-----------------------------------
📌 ROTA GET - Buscar usuários
-----------------------------------
*/

// Define uma rota GET no endpoint /users
routes.get('/users', (request, response) => {
  
  // Retorna status 200 (sucesso)
  // Envia o array como resposta em formato JSON
  return response.status(200).json(database);
});

/*
-----------------------------------
📌 ROTA POST - Criar usuário
-----------------------------------
*/

// Define uma rota POST no endpoint /users
routes.post('/users', (request, response) => {
  
  // Extrai o campo "name" do corpo da requisição
  // Exemplo de body: { "name": "Rodrigo" }
  const { name } = request.body;

  // Adiciona o novo usuário no "banco de dados"
  database.push(name);

  // Retorna status 201 (criado com sucesso)
  // Envia uma mensagem personalizada
  return response.status(201).json({
    mensagem: `Usuário ${name} criado`
  });
});

/*
-----------------------------------
📌 STATUS CODE
-----------------------------------
200 - Sucesso
201 - Criado com sucesso
404 - Não encontrado

📌 MÉTODOS HTTP
GET    - Buscar dados
POST   - Criar dados
PUT    - Atualizar dados
PATCH  - Atualizar parcialmente
DELETE - Remover dados
*/

// Exporta as rotas para serem usadas no index.js
export { routes };
```

---

## ▶️ Como rodar o projeto

```bash
npm start
```

ou

```bash
yarn start
```

---

## 🌐 Testando a API

### 🔍 GET /users

```http
GET http://localhost:5000/users
```

Resposta:

```json
["Rafa"]
```

---

### ➕ POST /users

```http
POST http://localhost:5000/users
Content-Type: application/json
```

Body:

```json
{
  "name": "Rodrigo"
}
```

Resposta:

```json
{
  "mensagem": "Usuário Rodrigo criado"
}
```

---

## 💡 Conclusão

* Separar rotas melhora a organização
* Comentários ajudam a entender o código
* Esse é o primeiro passo para construir APIs maiores

---

## 🚀 Próximos passos

* Criar rota PUT (editar usuário)
* Criar rota DELETE (remover usuário)
* Conectar com banco de dados real

---
