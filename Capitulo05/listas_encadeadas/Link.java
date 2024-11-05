package Capitulo05.listas_encadeadas;

public class Link {
    public int iData; // item de dado (chave)
    public double dData; // item de dados
    public Link next; // próximo nó da lista

    public Link(int id, double dd) {
        // next é definico automaticamente como null
        iData = id;
        dData = dd;
    }

    // exibe os nós
    public void displayLink() {
        System.out.print("{" + iData + " , " + dData + "}");
    }
}
