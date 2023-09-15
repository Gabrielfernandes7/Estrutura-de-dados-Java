# Overview

## Programação Orientada à Objetos (POO)

- **Classe:** é um modelo que define os atributos e métodos comuns dos objetos.

- **Objetos:** são estruturas (entidades) que representam coisas do mundo real e possuem tanto métodos quanto atributos.

- **Construtor:** um método especial chamado automaticamente quando um objeto é criado para inicializar seus atributos.

### Pilares da POO

#### Abstração

A abstração envolve representar apenas as características comportamentais e essenciais de um objeto.

#### Herança

É a criação de outra classe *estendida* ou *derivada* a partir de outra classe base. A herança permite que um objeto herde os atributos ou métodos de outro objeto.

#### Polimorfismo

O polimorfismo permite que objetos de diferentes classes ajam de diferentes maneiras, dependendo do contexto. Com o polimorfismo os mesmos atributos e métodos podem ser utilizados em objetos distintos, mas com implementação lógica diferente. Exemplo de polimorfismo a seguir:

```java
class Animal {
    void fazerBarulho() {
        System.out.println("Fazer barulho");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerBarulho() {
        System.out.println("Latir");
    }
}

public class PolimorfismoExemplo {
    public static void main (String[] args) {

        Animal meuAnimal = new Cachorro(); // Polimorfismo

        meuAnimal.fazerBarulho();

        Animal outroAnimal = new Animal(); // Sem Polimorfismo

        outroAnimal.fazerBarulho();
    }
}
```

#### Encapsulamento

O encapsulamento envolve ocultar os detalhes de implementação de um objeto.

## Básico de Java

```java
class Main {
    public class static void main(String[] args) {
        System.out.println("Java");
    }
}
```

**Tipos primitivos de variáveis:**

- boolean, byte, char, short, int, long, float, double

**Entrada / Saída:**

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Java");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro");

        int numeroInteiro = scanner.nextInt();

        System.out.print("Você digitou o número " + numeroInteiro);

        scanner.close();
    }
}
```
