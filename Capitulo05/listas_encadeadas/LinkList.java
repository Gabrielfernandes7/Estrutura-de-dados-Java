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
        newLink.next = firstLink;
    }

    public Link deleteFirst() {
        Link temp = firstLink;
        firstLink = firstLink.next;
        return temp;
    }

    public void displayLink() {
        System.out.println("List (first -> last): ");
        Link current = firstLink;

        while (current != null) {
            current.displayLink();
            current = current.next;
        }

        System.out.println("");
    }
}
