package Capitulo03.bubblesort;

public class BubbleSortMain {
    public static void main(String[] args) {
        int maxSize = 10;
        ArrayBubble arrayBubble;

        arrayBubble = new ArrayBubble(maxSize);

        arrayBubble.insereElemento(10);
        arrayBubble.insereElemento(0);
        arrayBubble.insereElemento(8);
        arrayBubble.insereElemento(14);
        arrayBubble.insereElemento(3);

        System.out.println("Não ordenado: ");
        arrayBubble.mostrarConteudoVetor();

        arrayBubble.bubblesortAlgoritmo();

        System.out.println("Ordenado: ");
        arrayBubble.mostrarConteudoVetor();
    }
}
