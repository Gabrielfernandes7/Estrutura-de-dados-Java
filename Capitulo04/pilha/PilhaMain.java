package Capitulo04.pilha;

public class PilhaMain {
    public static void main(String[] args) {
        PilhaX pilhaX = new PilhaX(5);

        pilhaX.adicionaElementoPilha(20);
        pilhaX.adicionaElementoPilha(30);
        pilhaX.adicionaElementoPilha(60);
        pilhaX.adicionaElementoPilha(80);

        while (!pilhaX.estaVaziaPilha()) { // até ficar vazia
            long valor = pilhaX.removeElementoPilha(); // empilhar items
            System.out.println(valor); // mostrar items
            System.out.println(" ");
        }
    }
}
