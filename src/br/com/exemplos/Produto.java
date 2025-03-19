package br.com.exemplos;
import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private double precoDesconto;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() { return this.nome; }
    public double getPreco() { return this.preco; }

    public double getIdade(){
        return this.preco;
    }

    public double getPrecoDesconto(){
        return this.precoDesconto;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public int getQuantidade(){ return this.quantidade; }

    public void setQuantidade(int quantidade ){ this.quantidade = quantidade; }

    public void desconto (float desconto){
        this.precoDesconto = this.preco * (1-desconto);
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public static void main(String[] args){
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Coca-Cola",4.50, 2));
        produtos.add(new Produto("Carne", 45.60, 3));
        produtos.add(new Produto("Carvão", 15.6, 1));

        System.out.println(produtos.size());
        System.out.println(produtos.get(2));

        System.out.println(produtos);

        produtos.add(new ProdutoPerecivel("Carne de Boi", 45.60, 1, "23/05/2025"));

        System.out.println(produtos.get(3));

        List<Produto> produtos1 = new ArrayList<>();
        produtos1.add(new Produto("Camiseta", 25, 1));
        produtos1.add(new Produto("Short", 15, 1));
        produtos1.add(new Produto("Terno", 250, 1));
        produtos1.add(new Produto("Calça", 50, 1));
        produtos1.add(new Produto("Camisa Meia Estação", 30, 1));
        produtos1.add(new Produto("Meia", 10, 1));
        produtos1.add(new Produto("Tenis", 120, 1));

        double aux = 0;
        int cont = 0;
        double media;

        for (Produto p: produtos1){
            aux = aux + p.getPreco();
            cont++;
        }

        media = aux/cont;

        System.out.println(String.format("Media dos preços da lista de produtos: %.2f", media));

    }


}
