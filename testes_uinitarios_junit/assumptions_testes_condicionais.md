# Assumptions = Hipóteses

```java
@Test
void validarAlgoSomenteNoUusuarioWillyan(){
  Assumptions.assumeTrue("root".equals(System.getenv("USER"));
  Assertions.assertEquals(10, 5+5);
}
```

# Teste condicional
Valida se o usuário é compativel com "Willyan"
```java
@Test
@EnableIfEnvironmentVariable(named = "USER", matches = "willyan")
void validarAlgoSomenteNoUusuarioWillyan(){
  Assertions.assertEquals(10, 5+5);
}
```
