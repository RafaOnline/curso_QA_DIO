# 🚀 Como Inicializar um Servidor Node.js no VS Code

Este guia mostra o passo a passo para criar e rodar um servidor Node.js usando o VS Code.

---

## 📋 Pré-requisitos

Antes de começar, você precisa ter instalado:

* Node.js
* Visual Studio Code
* (Opcional) Yarn ou usar o npm

---

## 📁 1. Criar a pasta do projeto

Abra o VS Code e crie uma nova pasta para o projeto.

Depois abra o terminal integrado:

```bash
Ctrl + `
```

---

## ⚙️ 2. Inicializar o projeto Node.js

Execute o comando abaixo para criar o `package.json` automaticamente:

```bash
npm init -y
```

---

## 📦 3. Instalar dependências

### Instalar o Express (framework web)

```bash
npm install express
```

### Instalar o Nodemon (reinicia o servidor automaticamente)

```bash
npm install nodemon --save-dev
```

---

## 📝 4. Criar o arquivo principal

Crie a estrutura:

```bash
src/index.js
```

---

## 💻 5. Criar um servidor básico

Dentro de `src/index.js`, adicione:

```js
import express from 'express';

const app = express();
const PORT = 3000;

app.get('/', (req, res) => {
  res.send('Servidor rodando 🚀');
});

app.listen(PORT, () => {
  console.log(`Servidor rodando em http://localhost:${PORT}`);
});
```

---

## ⚠️ 6. Configurar ES Modules

No arquivo `package.json`, adicione:

```json
"type": "module"
```

---

## ▶️ 7. Criar script de inicialização

No `package.json`, configure:

```json
"scripts": {
  "start": "nodemon src/index.js"
}
```

---

## 🚀 8. Rodar o servidor

### Usando npm:

```bash
npm start
```

### Usando Yarn:

```bash
yarn start
```

---

## 🌐 9. Testar no navegador

Abra:

```
http://localhost:3000
```

---

## 💡 Dicas importantes

* Sempre use **`.js` no import** quando estiver usando `"type": "module"`
* Não misture `require` com `import`
* O Nodemon reinicia o servidor automaticamente ao salvar alterações

---

## 📦 Comandos resumidos

```bash
npm init -y
npm install express
npm install nodemon --save-dev
npm start
```

---

## ✅ Estrutura final do projeto

```
📁 projeto
 ┣ 📁 src
 ┃ ┗ 📄 index.js
 ┣ 📄 package.json
 ┗ 📄 node_modules
```

---

## 🎯 Resultado esperado

Ao rodar o projeto, você verá no terminal:

```
Servidor rodando em http://localhost:3000
```

---

Pronto! Seu servidor Node.js está funcionando 🚀
