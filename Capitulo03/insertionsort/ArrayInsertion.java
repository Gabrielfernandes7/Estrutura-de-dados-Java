package Capitulo03.insertionsort;

public class ArrayInsertion {
    private long[] vetorA;
    private int numeroElementos;

    public ArrayInsertion(int max) {
        vetorA = new long[max];
        numeroElementos = 0;
    }

    public void insereElemento(long valor) {
        vetorA[numeroElementos] = valor;
        numeroElementos++;
    }

    public void mostrarConteudoVetor() {
        for(int j = 0; j < numeroElementos; j++) {
            System.out.println(vetorA[j]);
        }
    }
}