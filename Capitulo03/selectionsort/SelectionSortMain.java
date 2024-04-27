package Capitulo03.selectionsort;

public class SelectionSortMain {
    public static void main(String[] args) {
        int maxSize = 10;
        ArraySelection arraySelection;
    
        arraySelection = new ArraySelection(maxSize);

        arraySelection.insereElemento(10);
        arraySelection.insereElemento(2);
        arraySelection.insereElemento(8);
        arraySelection.insereElemento(1);
        arraySelection.insereElemento(5);
        arraySelection.insereElemento(6);

        System.out.println("Não ordenado");

        arraySelection.mostrarConteudoVetor();

        arraySelection.selectionsortAlgoritmo();

        System.out.println("Ordenado: ");

        arraySelection.mostrarConteudoVetor();
    }
}
