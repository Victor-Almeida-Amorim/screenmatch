package br.com.exemplos;

public class Cachorro extends Animal{
    private String nome;
    public Cachorro (String nome){
        super("Mamífero", "Cachorro");
        this.nome = nome;
    }


    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("Pitoco");
        Animal animal = new Animal();

        if (cachorro instanceof Cachorro){
            animal = (Animal) cachorro;
        }

    }
}
