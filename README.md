
# 🍔 Burger Brothers Brazil 🍔

- THE BEST BURGER IN THE WORLD

Projeto acadêmico desenvolvido em Java com o objetivo de simular um sistema de gerenciamento de um restaurante especializado em hambúrgueres. O sistema contempla funcionalidades de cadastro e gestão de clientes, produtos, pedidos e pagamentos, utilizando princípios sólidos de Programação Orientada a Objetos.

---

## 📌 Informações Gerais sobre o Projeto

**Objetivo:**  
Desenvolver um sistema completo em **Java puro** que simule a operação de um restaurante, aplicando conceitos de **Orientação a Objetos**, como **herança**, **polimorfismo**, **classes abstratas**, **interfaces** e **coleções**, além de **leitura e gravação em arquivos** para persistência de dados.

**Funcionalidades principais:**
- Cadastro, edição, listagem e remoção de clientes (CRUD)
- Criação e gerenciamento de produtos e combos
- Registro e cálculo de pedidos
- Controle de pagamentos
- Armazenamento de dados em arquivos `.txt`

---

## 🧩 Informações sobre as Classes e suas Relações

### 📁 `cliente`
- **Pessoa** (classe abstrata): Superclasse com atributos comuns (nome, CPF, etc.)
- **Cliente**: Subclasse de Pessoa, com métodos específicos de cliente
- **Validador**: Validação de entrada de dados
- **ClienteController**: CRUD de clientes
- **MenuCliente**: Interface de terminal para cliente

### 📁 `produto`
- **Produto**: Classe base para itens do cardápio
- **Combo**: Composição de vários produtos com desconto (usa *composição* de Produto)
- **ItemCardapio**: Representa produtos individuais no menu
- **CategoriaProduto**: Enum para categorias de produtos
- **ProdutoController**: Responsável por gerenciar produtos e combos

### 📁 `pedido`
- **Pedido**: Representa um pedido feito por um cliente (associação com Cliente e ItemPedido)
- **ItemPedido**: Representa um item dentro do pedido (agregação de Produto)
- **Pagamento**: Representa a forma de pagamento
- **PedidoController** e **MenuPedido**: Gerenciam fluxo do pedido no terminal

### 📁 `utils`
- **ArquivoUtil**: Leitura e gravação em arquivos `.txt` para persistência de dados

### 📁 `main`
- **Main.java**: Classe principal que inicia o sistema
- **MenuPrincipal**: Menu de navegação entre os módulos

---

## ▶️ Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/acairesm/Burger_Brothers_Brasil-.git 
2.Abra o projeto em uma IDE como IntelliJ IDEA, Eclipse ou VS Code com suporte a Java.

3.Execute a classe Main.java localizada no pacote main.

---

## 🤖 Uso do ChatGPT & Blackboxai

O ChatGPT & Blackboxai foi utilizado como assistente de desenvolvimento para:

- Modelagem de classes com base em requisitos fornecidos

- Revisão de padrões de projeto (MVC) e aplicação de boas práticas

- Suporte na Criação deste arquivo README.md conforme instruções acadêmicas

- Sugestões de nomes de pacotes, validações e melhorias na estrutura do código

O uso da IA teve como foco auxiliar no aprendizado, manter boas práticas e otimizar tempo, sem comprometer a autoria do código.

---

## 📚 Referências e Recursos

- Exemplos e tutoriais de boas práticas em repositórios GitHub

- ChatGPT (OpenAI) & Blackboxai para auxílio em estruturação e documentação

---

## 👥 Autores

Lorenzo Garcia Pedrozo 

André Caires 

Aslam Rekik

Leonardo Herédia

