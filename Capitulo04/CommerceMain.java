package Capitulo04;

public class CommerceMain {
    public static void main(String[] args) {

        Produto produto1 = new Produto(1, "Notebook", 3099.99);
        Produto produto2 = new Produto(2, "Celular", 1999);

        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);

        carrinho.mostrarProdutos();

        double totalDaCompra = carrinho.calcularPrecoTotal();

        System.out.println("O total da compra é: R$ clear" + totalDaCompra);
    }
}
