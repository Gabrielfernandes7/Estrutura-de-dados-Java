package Capitulo04;

public class CommerceMain {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Notebook");
        Produto produto2 = new Produto(2, "Celular");

        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        carrinho.mostrarProdutos();
    }
}
