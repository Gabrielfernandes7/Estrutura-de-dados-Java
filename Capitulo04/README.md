## Pilhas

A estrutura de dados Pilhas (Stacks) é uma estrutura fundamental na programação e é utilizada para armazenar elementos de maneira que o último elemento inserido seja o primeiro a ser removido (LIFO - Last In, First Out).

**Uso real**: Verificação de parênteses balanceados em expressões matemáticas ou de código, navegação entre páginas web (back/forward), chamadas de funções recursivas etc. Pilhas são frequentemente usadas para implementar funcionalidades de desfazer/refazer em editores de texto, gráficos, etc. Uma pilha é usada para armazenar ações que podem ser desfeitas, enquanto outra pilha é usada para ações que podem ser refeitas.

No Java, a implementação de uma pilha pode ser feita utilizando a classe `Stack` da biblioteca padrão:

```java
import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String expression = "{[()]}";
        if (isBalanced(expression)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }
}
```

### Explicação

1. **Importação e Definição**: Importamos a classe `Stack` e definimos a classe `BalancedParentheses` para verificar se uma expressão tem parênteses balanceados.

2. **Método `isBalanced`**: Percorremos a expressão caractere por caractere. Se o caractere for um parêntese de abertura (`(`, `{`, `[`), ele é empilhado. Se for um parêntese de fechamento (`)`, `}`, `]`), verificamos se o topo da pilha é o par correspondente.

3. **Método `isMatchingPair`**: Verifica se os parênteses abertos e fechados correspondem.

4. **Método `main`**: Testa a funcionalidade com uma expressão de exemplo.

O exemplo mostra como as pilhas podem ser usadas para resolver problemas de balanceamento de parênteses, uma aplicação prática comum no dia a dia dos desenvolvedores.

## Filas

A estrutura de dados Filas (Queues) é fundamental na programação e é utilizada para armazenar elementos de maneira que o primeiro elemento inserido seja o primeiro a ser removido (FIFO - First In, First Out).

**Uso real**: Filas são amplamente utilizadas em sistemas de gerenciamento de tarefas, processamento de requisições web, impressão de documentos, sistemas de mensagens, entre outros. Por exemplo, em um servidor web, as requisições dos clientes são enfileiradas para serem processadas na ordem de chegada, garantindo justiça e eficiência.

No Java, a implementação de uma fila pode ser feita utilizando a classe `LinkedList` da biblioteca padrão, que implementa a interface `Queue`:

```java
import java.util.LinkedList;
import java.util.Queue;

public class WebRequestQueue {
    public static void main(String[] args) {
        // Cria uma fila para gerenciar requisições
        Queue<String> requestQueue = new LinkedList<>();

        // Adiciona algumas requisições à fila
        requestQueue.add("Requisição 1: /index.html");
        requestQueue.add("Requisição 2: /about.html");
        requestQueue.add("Requisição 3: /contact.html");

        // Processa as requisições na ordem em que chegaram
        while (!requestQueue.isEmpty()) {
            String request = requestQueue.poll();
            processRequest(request);
        }
    }

    private static void processRequest(String request) {
        System.out.println("Processando " + request);
        // Aqui você pode adicionar o código para processar a requisição
    }
}
```

### Implementação de fila sem contagem de items

A inclusão do número de items em uma fila impõe um overhead nos métodos de insert e remove. Pois, se tivermos lidando
com um número grande de excessões e remoções, poderá influenciar no desempenho. Entretanto, dificilmente uma abordagem
sem contagem raramente é necessário na prática.

```java
public class FilaSemContagem {

    private int tamanhoMax; // maxSize
    private long[] filaArray;
    private int front;
    private int rear;

    public FilaSemContagem(int s) {
        tamanhoMax = s + 1;
        filaArray = new long[tamanhoMax];
        front = 0;
        rear = -1;
    }

    public void inserir(long j) {
        if (rear == tamanhoMax - 1) {
            rear = -1;
        }

        filaArray[++rear] = j;
    }

    public long remove() {
        long temp = filaArray[front++];

        if (front == tamanhoMax) {
            front = 0;
        }

        return temp;
    }

    public long peek() { // vê a frente da fila
        return filaArray[front];
    }

    public boolean isEmpty() {
        return (
            rear+1==front || (front+tamanhoMax-1 == rear)
        );
    }

    public boolean isFull() {
        return (
            rear+2==front || (front+tamanhoMax-2==rear)
        );
    }

    public int size() {
        if (rear >= front) {
            return rear-front+1;
        } else {
            return (tamanhoMax-front) + (rear+1);
        }
    }
}
```

### Explicação

1. **Criação da Fila**:
   - Utilizamos a classe `LinkedList`, que implementa a interface `Queue`, para criar uma fila de requisições (`requestQueue`).

2. **Adição de Requisições**:
   - As requisições são adicionadas à fila usando o método `add()`.

3. **Processamento de Requisições**:
   - As requisições são processadas na ordem em que chegaram, utilizando um laço `while` que continua até que a fila esteja vazia.
   - O método `poll()` remove e retorna a cabeça da fila (a primeira requisição).
   - O método `processRequest()` simula o processamento da requisição.

### Referências

1. Documentação da interface `Queue` do Java: [Java Queue Interface](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)
2. Artigo sobre uso de Filas em Java: [Queue in Java](https://www.geeksforgeeks.org/queue-interface-java/)
3. Guia sobre estruturas de dados em Java: [Data Structures in Java](https://www.baeldung.com/java-data-structures)

Essas referências fornecem uma base sólida para entender e implementar filas em Java, com exemplos práticos e explicações detalhadas.
