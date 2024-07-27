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