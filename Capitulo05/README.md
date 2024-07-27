# Estrutura de dados

##  Listas

A estrutura de dados Listas são uma estrutura de dados fundamental
na programação e são utilizadas para armazenar coleções de elementos
de maneira ordenada.

**Uso real**: Carrinho de compras de uma plataforma de ecommerce, histórico de um navegador, Sistema de gerenciamento de tarefas etc.

No Java existe duas maneiras de implementar as listas, sendo elas:

**ArrayList**: Implementação da interface List que usa um array interno para armazenar os elementos. Ele fornece operações de acesso rápido aos elementos, mas pode ser menos eficiente em operações de inserção e remoção no meio da lista, pois requer deslocamento de elementos.

**LinkedList**: Implementação da interface List que usa uma estrutura de lista duplamente encadeada. Ela fornece operações eficientes de inserção e remoção no meio da lista, mas o acesso aos elementos pode ser mais lento do que em um ArrayList, pois requer percorrimento sequencial.

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        List<String> lista = new ArrayList<>();

        // Adicionando elementos à lista
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        // Acessando elementos da lista
        System.out.println("Elementos da lista:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Acessando um elemento específico
        String primeiroElemento = lista.get(0);
        System.out.println("Primeiro elemento: " + primeiroElemento);

        // Removendo um elemento da lista
        lista.remove("Banana");
        System.out.println("Elementos após a remoção:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
```