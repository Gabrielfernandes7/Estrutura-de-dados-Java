package Capitulo04.pilha.exemploPilha;

public class AnalisadorSintaticoPilha {
    private int tamanhoPilha;
    private char[] pilhaArray;
    private int topoPilha;

    public AnalisadorSintaticoPilha(int tamanho) {
        tamanhoPilha = tamanho;
        pilhaArray = new char[tamanhoPilha];
        topoPilha = -1;
    }

    public void push(char j) {
        pilhaArray[++topoPilha] = j;
    }

    public char pop() {
        return pilhaArray[topoPilha--];
    }

    public char peek() {
        return pilhaArray[topoPilha];
    }

    public boolean isEmpty() {
        return (topoPilha == -1);
    }

    public boolean isFull() {
        return (topoPilha == tamanhoPilha - 1);
    }

}
