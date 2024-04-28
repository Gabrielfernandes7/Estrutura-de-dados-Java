package Capitulo03.selectionsort;

public class ArraySelection {
    private long[] vetorA;
    private int numeroElementos;

    public ArraySelection(int max) {
        vetorA = new long[max];
        numeroElementos = 0;
    }

    public void insereElemento(long valor) {
        vetorA[numeroElementos] = valor;
        numeroElementos++;
    }

    public void mostrarConteudoVetor() {
        for (int j = 0; j < numeroElementos; j++) {
            System.out.println(vetorA[j]);
        }
    }

    public void selectionsortAlgoritmo() {
        int out, in, min;

        for (out = 0; out < numeroElementos -1; out++) {
            min = out;

            for (in = out + 1; in < numeroElementos; in++) {
                if (vetorA[in] < vetorA[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    private void swap(int first, int second) {
        long temp = vetorA[first];
        vetorA[first] = vetorA[second];
        vetorA[second] = temp;
    }
}
