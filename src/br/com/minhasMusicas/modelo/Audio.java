package br.com.minhasMusicas.modelo;

public class Audio {
    private String nome;
    private int totalReproducoes;
    private int totalCurtidas;
    private int avaliacao;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalReproducoes() {
        return this.totalReproducoes;
    }

    public int getTotalCurtidas() {
        return this.totalCurtidas;
    }

    public int getAvaliacao(){
        return this.avaliacao;
    }
    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }

}
