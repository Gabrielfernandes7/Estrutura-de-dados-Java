package Capitulo04;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    // Criando um ArrayList de Strings
    List<Produto> produtos = new ArrayList<>();

    public CarrinhoCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void mostrarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Carrinho de compras vazio");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto.getId() + " - " + produto.getNomeProduto());
            }
        }
    }

    public double calcularPrecoTotal() {
        double total = 0;

        if (produtos.isEmpty()) {
            System.out.println("Carrinho de compras vazio");
        } else {
            for (Produto produto : produtos) {
                total += produto.getPreco();
            }
        }
        
        return total;
    }
}