package Capitulo05.listas_encadeadas;

public class LinkList {
    private Link firstLink; // primeiro nó da lista

    public LinkList() {
        firstLink = null;
    }

    public boolean isEmpty() {
        return (firstLink == null);
    }

    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        newLink.next = firstLink; // O novo nó aponta para o antigo primeiro nó
        firstLink = newLink; // O primeiro nó agora é o novo nó
    }

    public Link deleteFirst() {
        if (isEmpty()) {
            return null; // Retorna null se a lista estiver vazia
        }
        Link temp = firstLink; // armazena o nó a ser removido
        firstLink = firstLink.next; // o primeiro nó agora é o próximo nó
        return temp; // retorna o nó removido
    }

    public void displayLink() {
        System.out.println("List (first -> last): ");
        Link current = firstLink;

        while (current != null) {
            current.displayLink(); // exibe o nó atual
            current = current.next; // avança para o próximo nó
        }

        System.out.println("");
    }
}
