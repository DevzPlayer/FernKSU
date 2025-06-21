SukiSU Ultra (FernKSU)

Versão em PortuguêsBaseado em SukiSU Ultra e KernelSURepositório do projeto: https://github.com/DevzPlayer/FernKSU

⚡ Aviso

Este é um projeto experimental, baseado em tecnologias como KernelSU e susfs.
Use por sua conta e risco. Pode causar instabilidade se utilizado incorretamente.

📁 Como adicionar ao seu kernel

Execute os comandos abaixo no diretório raiz do seu código-fonte do kernel:

Para dispositivos GKI (main):

curl -LSs "https://raw.githubusercontent.com/SukiSU-Ultra/SukiSU-Ultra/main/kernel/setup.sh" | bash -s main

Para dispositivos não-GKI:

curl -LSs "https://raw.githubusercontent.com/SukiSU-Ultra/SukiSU-Ultra/main/kernel/setup.sh" | bash -s nongki

Com susfs integrado (recomendado):

curl -LSs "https://raw.githubusercontent.com/SukiSU-Ultra/SukiSU-Ultra/main/kernel/setup.sh" | bash -s susfs-main

🚧 Hooking (Integração de permissões)

KPROBES (padrão em GKI 2.0):

Requer CONFIG_KPROBES=y

Para uso com módulos LKM

Manual (para não-GKI):

Requer CONFIG_KSU_MANUAL_HOOK=y

Ver instrução: How to integrate non-GKI

🚀 Suporte a KPM

Requer:

CONFIG_KPM=y

CONFIG_KALLSYMS=y

CONFIG_KALLSYMS_ALL=y

Repositório patch: https://github.com/ShirkNeko/SukiSU_KernelPatch_patchTemplate: https://github.com/udochina/KPM-Build-Anywhere

📢 Atualizações OTA com Root Persistente

Após a atualização OTA, não reinicie ainda.

Abra o gerenciador KernelSU e selecione o zip do AnyKernel3 correspondente.

Flash no slot oposto ao ativo.

Reinicie.

Em não-GKI, é mais seguro usar o TWRP diretamente.

✔ Compatibilidade

Suporte pleno a Android GKI 2.0 (kernel 5.10+)

Compatível com kernels 3.x, 4.4+ (via adaptação manual)

Arquiteturas: arm64-v8a, armeabi-v7a (bare), x86_64

💡 Recursos

Root baseado no kernel via su

Sistema de módulos tipo "Magic Mount"

App Profile: restrição de root por app

Suporte a dispositivos não-GKI

Integração com KPM

🚫 Problemas comuns

Dispositivo trava ao desinstalar o gerenciador KernelSU: remova o pacote com.sony.playmemories.mobile

📄 Licença

Arquivos do diretório kernel: GPL-2.0-only

Restante do projeto: GPL-3.0+

👏 Agradecimentos

Créditos a:

SukiSU Ultra

KernelSU

KernelSU Next

Magisk

Para mais informações e builds personalizados:https://github.com/DevzPlayer/FernKSU

