<img width="1017" height="89" alt="image" src="https://github.com/user-attachments/assets/9c2beeb1-91db-4ca2-8fb0-241c4f66a58d" /># Introdução a testes de software

## Definição
"Testes de software é o processo de execução de um produto para determinar se ele 
atingiu suas especificações e funcionou corretamente no ambiente para qual o foi projetado"

## Conceitos básicos
**Defeito, Erro, Falha**

Falha: Na visão do usuário. Ex: Tela azul

Erro: Falha humana no desenvolvimento. Ex: Foi esquecido de testar alguma funcionalidade

Defeito/Bug: Erro técnico no desenvolvimento

## Verificação e validação

- **Verificação**: Estamos construindo o sistema certo? Ex: É oque foi planejado?
- **Validação**: Estamos construindo o software certo? Ex: Regras de negócio

## Níveis de teste

<img width="1017" height="89" alt="image" src="https://github.com/user-attachments/assets/a7a30a1a-1a13-4920-9311-fc8d3f6ddb2e" />

**Unidade**: Validação de cada método ou parte do software

**Teste de integração**: Voltado para validação de integração com banco de dados, API ou conexão com sistemas externos

**Teste de sistema**: Validação do sistema, testar ele 

**Regressão**: Reavaliar tudo oque está sendo desenvolvido, para ver se não está acontecendo erro após criação de novas features

**Teste de aceitação**: Cliente faz a validação do sistema

## Alpha, Beta, Cannary

**Alpha**: Testes enquanto está em desenvolvimento

**Beta**: Testes com sistema próximo do concluido

**Cannary**: É testado um sistema atualizado de uma próxima versão com uma parte do púilbico antes do deploy para todos

## Técnicas de testes
Cada nível de teste possui técnicas diferentes

### Caixa branca
- Também conhecido como teste estrutural
- Validar dados, controles, fluxos, chamadas
- Garantir a qualidade da implementação
- Níveis: Unidade, integração e regressão

### Caixa Preta
- Teste funcional
- Verificar saídas usando vários tipos de entrada
- Teste sem conhecer a estrutura interna do software
- Níveis: Integração, sistema, Aceitação

### Caixa cinza
- Mescla técnicas de caixa branca e caixa preta
- Analisa parte lógica e também funcionalidade
- Exemplo: Ter acesso a documentação do funcionamento do código
- Engenharia reversa

## Testes não funcionais

Testes não funcionais estão ligados a requisitos não funcionais:
- Comportamento do sistema
- Performance
- Escalabilidade
- Segurança
- Infraestrutura

### Como?
Ferramentas que usam técnicas para apurar o comportamento do sistema em determinadas circunstâncias.

### Teste de carga
O teste de carga é realizado para verificar qual o volume de transações, acessos simultâneos ou 
usuários que um servidor/software/sistema suporta.

Alguns pontos de atenção:
- Objetivos para clareza nos resultados
- Ambiente
- Cenários
- Execução de testes
- Análise do resultado

### Teste de stress
"Teste de stress é realizado para submeter o software a situações extremas. Basicamente, o teste de stress
baseia-se a situações extremas. Baiscamente, o teste de stress baseia-se em testar
os limites do software e avaliar seu comportamente. Assim avalia-se até quando
o software pode ser exigido e quais as falhas (se existirem) decorrentes do teste"

### Teste de segurança
"O teste de segurança é um processo crítico de segurança cibernética que visa detectar vulnerabilidades
em sistemas,software, redes e aplicativo"

## Pirâmide de testes

<img width="671" height="373" alt="image" src="https://github.com/user-attachments/assets/0d7e7d89-5ce5-4f3d-9d8a-4324e4a2bf21" />

<img width="674" height="655" alt="image" src="https://github.com/user-attachments/assets/bee25e06-ef9c-49ad-85e6-21cfc488d183" />

