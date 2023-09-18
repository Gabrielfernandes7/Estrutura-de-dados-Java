# Vetores

São estruturas de dados que permitem armazenar uma coleção de
elementos em uma só variável. Cada elemento do vetor é acessado
por meio de um índice que começa por 0 o primeiro elemento.

```java
// Declarando e inicializando um vetor inteiro de 5 elementos
int[] numeros = new int[5];

String[] nomes = {"Nome 1", "Nome 2", "Nome 3"};

int tamanhoVetorNumeros = numeros.length;

int primeiroElementoNumeros = numeros[0];
String segundoElementoNomes = nomes[1];

// iteração sobre um vetor
for (int i = 0; i < tamanhoVetorNumeros; i++) {
    System.out.println(numeros[i]);
}

// Matrizes
int [][] matriz = new int[3][3];

matriz[0][0] = 1;
matriz[1][1] = 2;

// Iteração sobre uma matriz
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```

## Inserção

Para inserir intens em um array
c3po

```java
public class ArrayCriado {
    public static void main (String[] args) {
        int[] numeros = new int[10]; // Cria um array de 10 elementos

        numeros[0] = 10; // Insere o 10 no elemento 0

        numeros.add(20); // adiciona o 20 no final do array

        // Imprime os elementos do array
        for (let i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
```

## Pesquisa

- Busca Linear

  - [Busca Linear](/BuscaLinear.java)

- Busca Binária

## Remoção

```java
int[] numeros = {10, 20, 30};

// Cria um novo array
int[] novosNumeros = new int[numeros.length - 1];

// Copia os elementos do array original para o novo array, excluindo o elemento no índice 0
for (int i = 1; i < numeros.length; i++) {
  novosNumeros[i - 1] = numeros[i];
}

// Substitui o array original pelo novo array
numeros = novosNumeros;
```
