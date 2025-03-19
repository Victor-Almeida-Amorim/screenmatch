package br.com.exemplos;

public class ProdutoPerecivel extends Produto{

    private String validade;

    public ProdutoPerecivel (String nome, double preco, int quantidade, String validade) {
        super(nome, preco, quantidade);
        this.validade = validade;
    }

    public String getValidade(){
        return this.validade;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
