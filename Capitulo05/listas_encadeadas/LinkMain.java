package Capitulo05.listas_encadeadas;

public class LinkMain {
    public static void main(String[] args) {
        
        LinkList theList = new LinkList(); // criar nova lista

        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayLink();

        while (!theList.isEmpty()) {
            Link aLink = theList.deleteFirst();
            System.out.println("Deleted ");

            aLink.displayLink();
            System.out.println("");
        }

        theList.displayLink();
    }
}
