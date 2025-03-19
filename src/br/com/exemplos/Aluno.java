package br.com.exemplos;

public class Aluno extends Pessoa{
    private int nota;

    public Aluno(String nome, int idade, int nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public int getNota(){
        return this.nota;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public float media(){
        return nota/1;
    }
}
