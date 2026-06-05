# Sistema de Gerenciamento de Pedidos (SGP)

O **SGP** é uma aplicação desktop desenvolvida em **Java** com o objetivo de simular um sistema comercial completo de controle de vendas. O projeto utiliza a biblioteca **Swing** para uma interface gráfica amigável e implementa uma arquitetura robusta baseada no padrão **MVC (Model-View-Controller)** com separação de persistência em camadas de repositório.

Para fins educacionais e de independência de infraestrutura, o sistema não utiliza um banco de dados relacional tradicional (como PostgreSQL ou MySQL). Em vez disso, foi desenvolvida uma engine de persistência proprietária que gerencia dados em arquivos planos no formato **CSV (Comma-Separated Values)** com suporte a autoincremento de chaves primárias na memória.

---

## 🏗️ Arquitetura do Sistema

O projeto é rigorosamente dividido em pacotes para garantir o desacoplamento e a manutenibilidade do código:

* **`model`:** Contém as entidades de negócio (`Cliente`, `Produto`, `Pedido`) e suas regras estruturais (getters, setters e construtores).
* **`view`:** Telas construídas com Java Swing (`MainView`, `ClienteView`, `ProdutoView`, `PedidoView`). As Views são estritamente visuais e não processam lógica de negócio.
* **`controller`:** Camada intermediária que recebe os estímulos da View, aciona os validadores e gerencia o fluxo de dados de e para os repositórios.
* **`repository`:** Responsável pela gerência da coleção de dados em memória (`ArrayList`) e pelo acionamento do salvamento em disco.
* **`util`:** Classes utilitárias globais do sistema:
    * `ArquivoUtil`: Manipulação de fluxos de leitura e escrita de arquivos (I/O).
    * `Validador`: Centraliza validações de strings, campos vazios e formatos numéricos para evitar quebras em tempo de execução (*runtime exceptions*).

---

## 🚀 Módulos e Funcionalidades

### 📋 Menu Principal (`MainView`)
* Painel centralizado com navegação limpa através do gerenciamento de janelas por ciclo de vida `DISPOSE_ON_CLOSE` (evita o fechamento acidental da aplicação ao fechar telas secundárias).

### 👥 Gerenciamento de Clientes
* Cadastro, consulta, alteração e exclusão (CRUD) de clientes.
* Persistência automática em `data/clientes.csv`.
* Controle de seleção em tabela: os botões de edição e exclusão exigem a seleção física de um registro na `JTable` para evitar operações nulas.

### 📦 Gerenciamento de Produtos
* Controle de estoque, preços e lotes de remessa.
* Persistência automática em `data/produtos.csv`.
* Busca dinámica por nome ou código integrada à interface gráfica.

### 🛒 Gerenciamento de Pedidos (Em desenvolvimento)
* Módulo centralizador responsável por cruzar as entidades de Clientes e Produtos.
* Cálculo automático do valor total do pedido.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)
* **Interface Gráfica:** Java Swing (JFrame, JDialog, JTable, GroupLayout)
* **Persistência Local:** Arquivos CSV gerenciados via `java.io`
* **IDE de Desenvolvimento:** NetBeans IDE
* **Controle de Versão:** Git & GitHub

---

## 📂 Como Rodar o Projeto

1. Certifique-se de ter o **JDK** instalado na sua máquina.
2. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git](https://github.com/SEU_USUARIO/NOME_DO_REPOSITORIO.git)
