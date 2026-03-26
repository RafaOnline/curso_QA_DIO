# Documentação de Testes Automatizados - Projeto BDD Everis DIO

Este documento detalha a estrutura, ferramentas e cenários de testes automatizados implementados no projeto **bootcamp-bdd-everis-dio-main**. O projeto utiliza a abordagem de **Desenvolvimento Orientado a Comportamento (BDD)** para validar funcionalidades de e-commerce.

## 🛠️ Tecnologias e Ferramentas

O projeto foi desenvolvido utilizando as seguintes tecnologias:

| Categoria | Ferramenta | Versão |
| :--- | :--- | :--- |
| **Linguagem** | Java | 1.8 |
| **Gerenciador de Dependências** | Maven | - |
| **Framework de Teste** | JUnit | 4.12 |
| **Framework BDD** | Cucumber | 6.8.1 |
| **Automação de Interface (Web)** | Selenium WebDriver | 3.141.59 |
| **Gerenciamento de Drivers** | WebDriverManager | 4.4.3 |
| **Relatórios de Execução** | ExtentReports | 3.1.5 |

## 🏗️ Estrutura do Projeto

A arquitetura segue o padrão **Page Object Model (POM)**, organizando o código de forma modular e reutilizável:

*   **`src/test/resources/features`**: Contém os arquivos `.feature` escritos em Gherkin (linguagem natural).
*   **`src/test/java/com/everis/steps`**: Implementação dos passos (Step Definitions) que conectam o Gherkin ao código Java.
*   **`src/test/java/com/everis/pages`**: Classes que representam as páginas do sistema e contêm os elementos e ações da interface.
*   **`src/test/java/com/everis/util`**: Classes utilitárias, incluindo `Hooks` para configuração de setup/teardown e `Utils` para funções auxiliares.
*   **`src/test/java/com/everis/tests`**: Classe `RunnerTest` responsável por configurar e disparar a execução dos testes.

## 📝 Cenários de Teste

Os testes estão documentados no arquivo `RealizaCompra.feature` e cobrem os seguintes fluxos:

### 1. Adicionar produto ao carrinho
*   **Objetivo**: Validar se um usuário consegue pesquisar e adicionar um item ao carrinho com sucesso.
*   **Site**: [My Store (Automation Practice)](http://automationpractice.com)
*   **Passos**:
    1.  Acessar o site.
    2.  Pesquisar pelo produto "Blouse".
    3.  Adicionar o produto ao carrinho.
*   **Validação**: O sistema deve confirmar que o produto "Blouse" está presente no carrinho.

### 2. Aumentar a quantidade de produto através dos detalhes
*   **Objetivo**: Validar se a alteração de quantidade na página de detalhes do produto é refletida corretamente no carrinho.
*   **Site**: [Automation Exercise](https://automationexercise.com)
*   **Passos**:
    1.  Acessar o site.
    2.  Pesquisar pelo produto "Men Tshirt".
    3.  Acessar a página de detalhes do produto.
    4.  Aumentar a quantidade do produto.
    5.  Adicionar ao carrinho.
*   **Validação**: O sistema deve confirmar que o produto "Men Tshirt" possui a quantidade **2** no carrinho.

## 📊 Relatórios e Evidências

O projeto está configurado para gerar relatórios detalhados após a execução:
*   **ExtentReports**: Gera um relatório HTML em `target/report/html/` contendo o status de cada passo e capturas de tela (screenshots) automáticas em caso de sucesso ou falha.
*   **Cucumber JSON**: Gera um arquivo de resultados em `target/cucumber.json` para integração com outras ferramentas.

## 🚀 Como Executar os Testes

Para executar os testes via linha de comando, utilize o Maven:

```bash
mvn test
```

Ou execute a classe `RunnerTest.java` diretamente através de uma IDE (Eclipse/IntelliJ).
