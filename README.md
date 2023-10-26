# Uber Challenge - Email Service

Este README fornece uma visão geral da aplicação "Uber Challenge - Email Service", que foi desenvolvida com base em um tutorial no YouTube como parte de um desafio de vaga na Uber. A função principal da aplicação é enviar e-mails usando o Amazon Web Services (AWS) para a entrega de e-mails. Para começar, siga as instruções abaixo.

## Tabela de Conteúdos
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Configuração](#configuração)
- [Uso](#uso)

## Pré-requisitos

Antes de usar a aplicação, certifique-se de ter os seguintes pré-requisitos em vigor:

- **Git**: Você precisará do Git para clonar o projeto. Se você não o tiver instalado, pode baixar e instalar no [site oficial do Git](https://git-scm.com/).

- **Conta AWS**: Você deve ter uma conta AWS com as permissões necessárias para enviar e-mails usando o Amazon Simple Email Service (SES) da AWS. Você precisará obter suas chaves de acesso AWS e configurar a região. Se você não tiver uma conta AWS, pode se inscrever no [site da AWS](https://aws.amazon.com/).

- **AWS CLI**: Certifique-se de ter a Interface de Linha de Comando da AWS (CLI) instalada em sua máquina. Se você ainda não a tiver instalada, pode seguir o [guia oficial de instalação da AWS CLI](https://docs.aws.amazon.com/pt_br/cli/latest/userguide/getting-started-install.html).

## Instalação

Para configurar a aplicação em sua máquina local, siga estas etapas:

1. Clone o projeto para um diretório de sua escolha usando o Git. Abra o terminal ou prompt de comando e execute o seguinte comando:

   ```shell
   git clone https://github.com/hugomos/uber-challenge-email-service-spring-api.git

2. Clone o projeto para um diretório de sua escolha usando o Git. Abra o terminal ou prompt de comando e execute o seguinte comando:

   ```shell
   cd <diretório_do_projeto>
   
## Configuração

Para configurar a aplicação para o envio de e-mails, você precisa fornecer suas credenciais de acesso AWS e especificar a região da AWS. Siga estas etapas para configurar a aplicação:

1. Dentro do diretório do projeto, crie um arquivo chamado `application.properties` no diretório `/src/main/resources`.
2. Abra o arquivo `application.properties` e insira o seguinte código, substituindo os espaços reservados por suas credenciais de acesso AWS e a região:
   ```shell
    aws:
    accessKeyId: suaChaveDeAcesso
    secretKey: suaChaveSecreta
    region: suaRegião

  * Certifique-se de substituir suaChaveDeAcesso, suaChaveSecreta e suaRegião por sua chave de acesso AWS, chave secreta e a região da AWS onde você deseja enviar e-mails.

## Uso

Depois de concluir as etapas de instalação e configuração, você pode começar a usar a aplicação para enviar e-mails usando o AWS SES. Certifique-se de que sua AWS CLI esteja devidamente configurada com sua conta AWS.

Para obter mais detalhes sobre como usar a aplicação, consulte o tutorial específico ou a documentação fornecida no tutorial do YouTube que você seguiu para desenvolver esta aplicação. Se você precisar de mais assistência ou tiver dúvidas sobre a funcionalidade da aplicação, consulte o tutorial ou a documentação para obter orientações.

Aproveite o uso da aplicação "Uber Challenge - Email Service"! Se encontrar algum problema ou tiver feedback, sinta-se à vontade para entrar em contato para suporte ou melhorias.

---

**Agradecimentos a [Fernanda-Kipper](https://github.com/Fernanda-Kipper) pelo apoio no desenvolvimento deste projeto.**  
**Veja o video no Youtube**: [Resolvendo DESAFIO de VAGA BACKEND com Java Spring + Arquitetura Limpa](https://www.youtube.com/watch?v=eFgeO9M9lLw)

[Link do perfil do autor original](https://www.linkedin.com/in/hugomos/)