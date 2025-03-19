package br.com.exemplos;

public class Circulo implements Forma{

    @Override
    public double calcularArea(){
        double raio = 23;
        return raio*raio*3.14;
    }

}
