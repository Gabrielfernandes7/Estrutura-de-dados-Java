package Capitulo04.pilha.exemploPilha;

// histórico de navegação
public class HistoricoPilha {
    private int tamanhoHistoricoPilha;
    private String[] historicoArray;
    private int top;

    public HistoricoPilha(int tamanhoHistorico) {
        tamanhoHistoricoPilha = tamanhoHistorico;
        historicoArray = new String[tamanhoHistoricoPilha]; // vetor de strings
        top = -1;
    }

    public void adicionarBusca(String busca) {
        historicoArray[++top] = busca;
    }

    public String removeBusca() {
        return historicoArray[top--];
    }

    public String verTopoHistorico() {
        return historicoArray[top];
    }

    public boolean historicoVazio() {
        return (top == -1);
    }

    public boolean historicoCheio() {
        return (top == tamanhoHistoricoPilha-1);
    }
}
