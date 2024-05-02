package Capitulo03.insertionsort;

public class InsertionSortMain {
    public static void main(String[] args) {
        int maxSize = 10;
        ArrayInsertion arrayInsertion;

        arrayInsertion = new ArrayInsertion(maxSize);

        arrayInsertion.insereElemento(10);
        arrayInsertion.insereElemento(0);
        arrayInsertion.insereElemento(8);
        arrayInsertion.insereElemento(14);
        arrayInsertion.insereElemento(3);
        arrayInsertion.insereElemento(7);

        System.out.println("Não ordenado: ");
        arrayInsertion.mostrarConteudoVetor();

        arrayInsertion.insertionsortAlgoritmo();

        System.out.println("Ordenado: ");
        arrayInsertion.mostrarConteudoVetor();
    }
}
