package Capitulo04.pilha.exemploPilha;

public class HistoricoMain {
    public static void main(String[] args) {
        HistoricoPilha historicoPilhaBusca = new HistoricoPilha(6);

        historicoPilhaBusca.adicionarBusca("github.com");
        historicoPilhaBusca.adicionarBusca("microsoft.com");
        historicoPilhaBusca.adicionarBusca("google.com");
        historicoPilhaBusca.adicionarBusca("qsharp.com");
        historicoPilhaBusca.adicionarBusca("gitlab.com");

        while (!historicoPilhaBusca.historicoVazio()) {
            String valorBusca = historicoPilhaBusca.removeBusca();
            System.out.println(valorBusca);
            System.out.println(" ");
        }

    }
}
