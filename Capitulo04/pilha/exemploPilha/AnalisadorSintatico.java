package Capitulo04.pilha.exemploPilha;

public class AnalisadorSintatico {
    private String input;

    public AnalisadorSintatico(String in) {
        input = in;
    }

    public void check() {
        int tamanhoPilha = input.length();
        AnalisadorSintaticoPilha aPilha = new AnalisadorSintaticoPilha(tamanhoPilha);

        for (int i = 0; i < tamanhoPilha; i++) { // obter os caracteres
            char ch = input.charAt(i); // obtém o caractere na posição i

            switch (ch) {
                // símbolos de abertura
                case '{':
                case '[':
                case '(':
                    aPilha.push(ch);
                    break;
                // símbolos de fechamento
                case '}':
                case ']':
                case ')':
                    if (!aPilha.isEmpty()) { // se a pilha não estiver vazia
                        char chx = aPilha.pop(); // desempilhar e testar
                        if (
                            (ch=='}' && chx=='}') ||
                            (ch==']' && chx=='[') ||
                            (ch==')' && chx=='(')
                        ) {
                            System.out.println("Error: " +  ch + " at " + i);
                        }
                    }
                    break;
                default:
                    break;
            }
        }

        if (!aPilha.isEmpty()) {
            System.out.println("Entrada não delimitada de forma correta");
        }
    }
}
