# Explorando Padrões de Projetos na Prática com Java e Spring

Uma breve descrição sobre o que foi realizado durante este projeto.

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando o Spring Framework, são eles: Singleton, Strategy, Repository e
Facade

## Singleton 
> O padrão _Singleton_ garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. É útil para gerenciar recursos compartilhados, como conexões de banco de dados ou configurações de aplicação.

Características:

- Garante uma única instância.
- Acesso global.
- Controle sobre a criação e o ciclo de vida da instância.

## Strategy
> O padrão Strategy permite que você defina uma família de algoritmos, encapsule cada um deles e os torne intercambiáveis.

Características do Strategy:

- Encapsula algoritmos.
- Facilita a troca de algoritmos em tempo de execução.
- Promove a reutilização de código.

## Repository
> O padrão Repository é usado para abstrair a lógica de acesso a dados, fornecendo uma interface para operações de CRUD.

Características do Repository:

- Abstrai a lógica de acesso a dados.
- Facilita a manutenção e testes.
- Promove a separação de preocupações.

## Facade
> O padrão Facade fornece uma interface simplificada para um subsistema complexo, facilitando a interação com ele. É útil para reduzir a complexidade e dependências entre sistemas.

Características:

- Simplifica a interface do subsistema.
- Reduz a dependência do cliente.
- Esconde a complexidade do sistema.
