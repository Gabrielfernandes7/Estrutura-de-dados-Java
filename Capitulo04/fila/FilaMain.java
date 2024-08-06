package Capitulo04.fila;

public class FilaMain {
    public static void main(String[] args) {
        Fila filaX = new Fila(3);

        filaX.insert(10);
        filaX.insert(20);
        filaX.insert(30);

        filaX.remove();
        filaX.remove();
        filaX.remove();

        filaX.insert(40);
        filaX.insert(50);
        filaX.insert(60);

        while (!filaX.isEmpty()) {
            long values = filaX.remove();
            System.out.println(values);
            System.out.println(" ");
        }

    }
}