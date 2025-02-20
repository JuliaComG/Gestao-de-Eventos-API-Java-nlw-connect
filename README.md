[![Typing SVG](https://readme-typing-svg.demolab.com?font=Zen+Antique+Soft&size=35&pause=1000&color=27F700&center=true&vCenter=true&width=830&lines=Sistema+de+Gerenciamento+de+Eventos+-+API+Java;Events+Manager+System+-+Java+API;Sistema+de+gesti%C3%B3n+de+eventos+-+API+de+Java)](https://git.io/typing-svg)

Bem-vindo a API para Gestão de Eventos, um projeto desenvolvido com objetivo de gerenciar eventos e suas respectivas inscrições, gerar links de indicação, validar as regras de negócio, e acompanhar ranking de indicações.

<p align="center">
  <a href="#-tecnologias-utilizadas">🛠 Tecnologias Utilizadas</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-tecnologias-utilizadas">🧠 Como Usar</a>
</p>

![image](https://github.com/user-attachments/assets/7387498d-40eb-468c-8032-11dc8905acd1)

# 🚧 Em construção... 🚧

Nessa trilha, explorei conceitos fundamentais do e **Java** e **Spring Boot**, mergulhando na prática para construir uma aplicação completa de **inscrição em eventos**.  

Ao longo do curso, configurei o ambiente de desenvolvimento, utilizamos o **Spring Initializr** para criar nosso projeto e conectamos a aplicação a um banco de dados **MySQL**.  


## ✨ Visão Geral

O Amigo Secreto é uma aplicação web que permite aos usuários adicionar nomes de amigos, realizar o sorteio de pares e visualizar os resultados de diferentes maneiras. A aplicação oferece três modos de visualização do resultado: Modo Simples, Modo Pares e Modo QR Code, garantindo que o sorteio seja feito de forma justa e sigilosa.

## 🌍 Acesse o Projeto


## ✨ Funcionalidades

- 📌 **Inscrição**: Usuários podem se inscrever em eventos informando nome e e-mail.
- 🔗 **Geração de Link de Indicação**: Cada inscrito pode gerar um link de indicação único.
- 📊 **Ranking de Indicações**: Exibe um ranking baseado no número de indicações bem-sucedidas.
- 👥 **Visualização de Indicações**: Cada usuário pode ver quantas pessoas se inscreveram usando seu link.

## 🛠 Tecnologias Utilizadas

- **Java** 23.0.2
- **Spring Boot** 3.4.2
- **Spring Data JPA**
- **Spring Web**
- **Maven**  
- **Lombok**
- **Docker** 27.5.1 (para rodar o banco de dados)  
- **Postman** (testes das APIs)  
- **MySQL** (banco de dados)
- **MySQL Workbench** (gerenciar o banco de dados)   


## 🧠 Como Usar

### Pré-requisitos


## 📋 Rotas da API

Principais rotas da API:

🎟️ Eventos

- Criar um evento
    ```
    (POST) /events
    ```
- Listar todos os eventos
    ```
    (GET) /events
    ```
- Obter evento por nome formatado
    ```
    (GET) /events/{prettyName}
    ```

📝 Inscrição

- Realizar inscrição no evento
    ```
    (POST) /subscription/{prettyName}
    ```
- Ver indicações de um usuário específico
    ```
    (GET) /subscription/{prettyName}/ranking/{userId}
    ```

↗️ Rankings

- Visualizar ranking de indicações de um evento
    ```
    (GET) /subscription/{prettyName}/ranking/{userId}
    ```
- Visualizar ranking de indicações de um usuário específico
    ```
    (GET) /subscription/{prettyName}/ranking
    ```


## 📂 Estrutura do Projeto

### Arquivos e Diretórios
```
EM CONSTRUÇÃO
Sistema-De-Inscricao-Em-Eventos-API-Java-nlw-connect
├── 📂 assets/ 
│    │   
├── 📄 README.md

```

### Diagrama de Deployment

### Diagrama Entidade-Relacionamento (DER)



## 🖥️ Contribuição

Contribuições são bem-vindas! Se você deseja contribuir para este projeto, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionando nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## 🛡️ Licença

Este projeto está sob a licença MIT. Isso significa que você pode utilizá-lo, modificá-lo e distribuí-lo livremente, desde que mantenha os créditos.

## 📧 Contato

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato:

- Giulia Armanelli
- GitHub: JuliaComG
- Linkdin: https://www.linkedin.com/in/giulia-armanelli/
- Email: garmanelli.dev@gmail.com

## 💖 Créditos e Agradecimentos 

Quero agradecer à [Rocketseat](https://app.rocketseat.com.br/?type=ALL) pelo conhecimento compartilhado e pelas oportunidades proporcionadas por meio do evento [NLW Connect](https://www.rocketseat.com.br/eventos/nlw?utm_source=platform&utm_medium=organic&utm_campaign=lead&utm_term=nlw_19&utm_content=notificacao_plataforma-lp_inscricao).
