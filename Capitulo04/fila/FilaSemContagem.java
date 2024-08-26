package Capitulo04.fila;

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
