# Autenticações seguras-

## Chave SSH
Uma chave SSH no GitHub é um par de códigos criptográficos (um público, um privado) que permite conectar seu computador ao GitHub de forma segura, sem precisar digitar usuário e senha a cada git push ou pull. Ela funciona como uma autenticação automática e mais segura que senhas tradicionais. 

### Passo a passo de como ativar a chave SSH

Como a chave gerar no CLI:

- **ssh-keygen -t ed25519 -C (mais o e-mail aqui)**

Colar nas configurações do Github a chave gerada

Ativar agente para funcionar a chave:

- **eval $(ssh-agent -s)**

Passar a chave privada ao agente:

- **ssh_add + (caminho da pasta ou nome do arquivo se estiver dentro da pasta)**
