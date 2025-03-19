package br.com.exemplos;

public class Animal {
    private String classe;
    private String especie;

    public Animal(){

    }

    public Animal(String classe, String especie){
        this.classe = classe;
        this.especie = especie;
    }

    public void fazerBarulho(){
        System.out.println("Barulho");
    }

}
