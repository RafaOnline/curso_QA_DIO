# Chave SSH

Como a chave gerar no CLI:

**ssh-keygen -t ed25519 -C (mais o e-mail aqui)**

Ativar agente para funcionar a chave:

**eval $(ssh-agent -s)**

Passar a chave privada ao agente:

ssh_add + (caminho da pasta ou nome do arquivo se estiver dentro da pasta)
