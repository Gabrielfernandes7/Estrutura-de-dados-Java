package Capitulo04.fila;

public class Fila {
    private int maxSize;
    private long[] filaArray;
    private int front;
    private int rear;
    private int nItems;

    public Fila(int s) {
        maxSize = s;
        filaArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) { // insere item no final da fila
        if (rear == maxSize - 1) {
            rear = -1;
        }
        filaArray[++rear] = j; // incremente no final e insere

        nItems++; // mais um item
    }

    public long remove() { // remove o item da frente da fila
        long temp = filaArray[front++];

        if (front == maxSize) {
            front = 0;
        }

        nItems--;
        return temp;
    }

    public long peekFront() { // vê a frente da fila
        return filaArray[front];
    }

    public boolean isEmpty() { // verdadeiro se a fila estiver vazia
        return (nItems == 0);
    }

    public boolean isFull() { // verdadeiro se a fila estiver cheia
        return (nItems == maxSize - 1);
    }

    public int size() {
        return nItems;
    }

}
