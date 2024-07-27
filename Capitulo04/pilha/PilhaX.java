package Capitulo04.pilha;

public class PilhaX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public PilhaX(int s) {
        maxSize = s; // estabelece o tamnho do vetor
        stackArray = new long[maxSize]; // cria vetor
        top = -1; // sem items
    }

    // push
    public void adicionaElementoPilha(long j) {
        // insere elemento no topo da pilha
        // incrementa top e atribui j a essa posição
        stackArray[++top] = j;
    }

    // pop
    public long removeElementoPilha() {
        // acessa o item e decrementa o topo
        return stackArray[top--];
    }

    // peek
    public long verTopoPilha() {
        return stackArray[top];
    }

    // isEmpty
    public boolean estaVaziaPilha() {
        return (top == -1);
    }

    // isFull
    public boolean estaCheiaPilha() {
        return (top == maxSize-1);
    }
}
