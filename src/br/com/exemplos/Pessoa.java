package br.com.exemplos;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNpme(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public boolean verificarIdade(){
        if (this.idade > 18){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString(){
        return String.format("""
                Nome: %s
                Idade: %d
                """, this.nome, this.idade);
    }

    public static void main(String[] args){
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Victor", 21);
        Pessoa p2 = new Pessoa("Mariana", 21);
        Pessoa p3 = new Pessoa("Anne", 17);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println(pessoas);
        System.out.println(pessoas.get(0).getNome());
        System.out.println(pessoas.size());
    }
}
