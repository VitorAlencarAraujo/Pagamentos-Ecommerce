# Pagamentos-Ecommerce

Projeto desenvolvido em Java para praticar os principais conceitos de Programação Orientada a Objetos (POO), utilizando uma estrutura de funcionários com diferentes cargos e formas de cálculo de bonificação.

## Objetivo

O sistema representa uma estrutura simples de funcionários de uma empresa, permitindo cadastrar diferentes tipos de funcionários e calcular suas respectivas remunerações.

O projeto possui três tipos de funcionários:

* Gerente
* Desenvolvedor
* Vendedor

Cada tipo possui uma regra própria para o cálculo de sua bonificação, e o vendedor também possui uma comissão baseada no valor vendido.


## Estrutura do projeto

```text
src/
├── Funcionario.java
├── Gerente.java
├── Desenvolvedor.java
├── Vendedor.java
└── main.java
```

### Funcionario.java

É a classe abstrata que representa um funcionário de forma geral.

Possui os seguintes atributos:

* nome
* cpf
* salario

Também possui métodos para:

* consultar o salário
* calcular bonificação
* calcular comissão
* calcular remuneração total
* exibir o holerite

A classe é declarada como abstract, portanto não pode ser instanciada diretamente.

### Gerente.java

Representa um funcionário com cargo de gerente.

A classe herda de Funcionario e possui uma bonificação de **20% do salário**.

```java
   public float calcularBonificacao() {
         return 20/100f;
    }
```

A remuneração total é calculada somando o salário à bonificação.

### Desenvolvedor.java

Representa um funcionário com cargo de desenvolvedor.

A classe também herda de Funcionario e possui uma bonificação de **10% do salário**.

```java
    public float calcularBonificacao() {
        return 10/100f;
    }
```

A remuneração total é calculada somando o salário à bonificação.

### Vendedor.java

Representa um funcionário com cargo de vendedor.

Além dos atributos herdados de Funcionario, possui o atributo:

```java
valorVendido
```

O vendedor recebe:

* 5% de bonificação sobre o salário
* 5% de comissão sobre o valor vendido

A remuneração total considera o salário, a bonificação e a comissão.

```java
    public float calcularRemuneracaoTotal() {
        return getSalario() + (getSalario() * calcularBonificacao()) + calcularComisao();
    }
```
## Conceitos de POO utilizados

### Encapsulamento

O encapsulamento é utilizado na classe Funcionario.

Os atributos:

```java
private String nome;
private String cpf;
private float salario;
```

são privados e não podem ser acessados diretamente por outras classes.

O acesso ao salário é realizado através do método:

```java
public float getSalario()
```

### Herança

A herança é utilizada pelas classes:

```java
public class Gerente extends Funcionario
public class Desenvolvedor extends Funcionario
public class Vendedor extends Funcionario
```

Isso permite que as três classes reutilizem os atributos e métodos definidos em Funcionario.

### Abstração

A classe:

```java
public abstract class Funcionario
```

representa uma estrutura genérica de funcionário.

Ela define comportamentos que devem ser implementados pelas outras classes, como:

```java
calcularBonificacao()
calcularComisao()
calcularRemuneracaoTotal()
```

Por ser abstrata, não é possível criar diretamente um objeto do tipo Funcionario.

### Polimorfismo

O polimorfismo pode ser observado no ArrayList<Funcionario> utilizado no Main.

Os objetos de diferentes classes são armazenados em uma mesma coleção:

```java
ArrayList<Funcionario> funcionarios = new ArrayList<>();
```

Depois, cada funcionário é percorrido utilizando:

```java
for (Funcionario funcionario : funcionarios) {
    funcionario.exibirHolerite();
}
```

Mesmo todos sendo tratados como Funcionario, cada objeto utiliza a implementação dos métodos sobrescritos em sua própria classe.

## Regras de remuneração

<img width="336" height="131" alt="image" src="https://github.com/user-attachments/assets/a30b4398-af7f-4617-9e33-5166319ae514" />

O programa pode ser executado através da classe:

```text
main.java
```

## Execução

O método main cria:

* um gerente
* um desenvolvedor
* um vendedor

Depois, os três funcionários são armazenados em um ArrayList<Funcionario> e seus respectivos holerites são exibidos no terminal.

### Funcionários com dados inválidos

O programa também realiza uma segunda demonstração utilizando dados inválidos para testar as validações implementadas nas classes.

São criados:

* um gerente com nome vazio
* um desenvolvedor com CPF vazio
* um vendedor com salário negativo e valor vendido negativo

Esses funcionários são armazenados em outro ArrayList<Funcionario> chamado funcionariosInvalidos.

O programa percorre essa coleção e exibe os holerites, além de calcular a remuneração total e o total da folha de pagamento desses funcionários.

## Conclusão

O projeto permitiu aplicar na prática os principais conceitos de POO em Java, como encapsulamento, herança, abstração e polimorfismo, além de trabalhar com bonificações, comissões e validação de dados.


