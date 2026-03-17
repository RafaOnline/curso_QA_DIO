# After e before
Testar coisas que precisa iniciar e terminar em determinado tempo Ex: Conexão com servidor

**@BeforeAll** e **@AfterAll** - Tudo que inicia ou finaliza no ciclo da classe
**@@BeforeEach** e **@AfterEach** - Inicia e finaliza antes de concluir o ciclo da classe

```java
puclic class ConsultarDadosDePessoaTest {

  @BeforeAll
  static void configurarConexao() {
    BancoDeDados.iniciarConexao();
    
  }

  @Test
  void validarDadosDeRetorno() {
    Assertions.assertTrue(true);
  }

  @AfterAll
  static void finalizarConexao () {
    BancoDeDados.finalizarConexao();
  }
}
```
