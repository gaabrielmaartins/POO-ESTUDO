# Sistema de Controle de Bonificações de Funcionários (POO)

Projeto desenvolvido para fins de estudo da disciplina de **Programação Orientada a Objetos (POO)** do Módulo 2º do CEFET-MG. 
**Objetivo**: modelar a estrutura organizacional de uma empresa e calcular as bonificações de diferentes cargos utilizando conceitos de POO.

---

## Conceitos Praticados
* **Herança Simples e Múltiplos Níveis** (`extends`)
* **Classes e Métodos Abstratos** (`abstract`)
* **Encapsulamento e Modificadores de Acesso** (`private`, `protected`)
* **Sobrescrita de Métodos** (`@Override`) e uso de `super()`
* **Polimorfismo** em tempo de execução

---

## Estrutura das Classes

* **`Funcionario` (Classe Abstrata Raiz)**: Define os atributos básicos (`nome`, `cpf`, `salarioBase`) e o método abstrato `calculaBonificacao()`.
* **`Gerente`**: Herda de `Funcionario`. Implementa regra de bonificação própria (15% do salário base + gratificação fixa de R$ 1000).
* **`Presidente`**: Herda de `Funcionario`. Implementa bonificação de 30% do salário base + cota de ações.
* **`Diretor`**: Herda de `Gerente`. Reutiliza o cálculo da classe mãe com `super.calculaBonificacao()` e adiciona participação nos lucros (+ R$ 2000).
* **`Secretaria` (Classe Abstrata Intermediária)**: Herda de `Funcionario` sem implementar o método abstrato, delegando a responsabilidade para suas filhas concretas.
  * **`SecretariaAdm`**: Implementa bonificação de 10% + auxílio escritório (R$ 300).
  * **`SecretariaAgencia`**: Implementa bonificação de 10% + produtividade de campo (R$ 500).
* **`ControleDeBonificacoes`**: Aplica **polimorfismo** acumulando as bonificações de qualquer tipo de funcionário via método `registra(Funcionario f)`.
* **`TesteSistema`**: Classe principal com o método `main`, responsável por instanciar a hierarquia, registar os objetos e exibir o total de bonificações.
