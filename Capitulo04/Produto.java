package Capitulo04;

public class Produto {
    private Integer id;
    private String nomeProduto;

    public Produto(Integer id, String nomeProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNome(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
