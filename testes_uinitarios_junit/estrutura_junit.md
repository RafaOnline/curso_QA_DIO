# Estrutura básica para teste Junit

```java
class PessoaTeste {
  @Test //--> Anotação primodial para testar
  void validaVerificacaoDeMaioridade() {
    Pessoa joaozinho = new Pessoa("João", LocalDate.of(2004,1,1)); // --> cri um cenário
    Assertions.assertTrue(joaozinho.ehMaiorDeIdade()); //- Executa as validações
  }
}
```
