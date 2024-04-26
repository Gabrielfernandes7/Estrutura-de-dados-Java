package Capitulo03.bubblesort;

public class ArrayBubble {
    private long[] vetorA;
    private int numeroElementos;

    // o vetor começa vazio e suporta até (max - 1) elementos
    // o vetor é inicializado com 0 elementos
    public ArrayBubble(int max) {
        vetorA = new long[max]; // cria o vetor
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

    public void bubblesortAlgoritmo() {
        int out, in;

        for (out = numeroElementos - 1; out > 1; out--) // laço externo - para trás
        {
            for (in = 0; in < out; in++) // laço interno - para frente
            {
                if (vetorA[in] > vetorA[in+1]) {
                    swap(in, in+1);
                }
            }
        }
    }

    private void swap(int first, int second) {
        long temp = vetorA[first];
        vetorA[first] = vetorA[second];
        vetorA[second] = temp;
    }
}
