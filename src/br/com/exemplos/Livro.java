package br.com.exemplos;

public class Livro {
    private String nome;
    private String autor;

    public Livro (String nome, String autor){
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome(){
        return this.nome;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void detalhes(){
        System.out.println(String.format("Nome: %s\nAutor: %s", this.nome, this.autor));
    }
}
